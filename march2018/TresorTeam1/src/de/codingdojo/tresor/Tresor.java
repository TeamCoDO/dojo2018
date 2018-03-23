package de.codingdojo.tresor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tresor {

	private Logger logger;
	private int[] aktuellerCode;
	private int aktuelleStelle = 0;
	private int anzahlVersuche = 0;
	private int maxVersuche;
	
	/**
	 * @return the maxVersuche
	 */
	public int getMaxVersuche() {
		return maxVersuche;
	}

	public Tresor() {
		logger = LogManager.getLogger(Tresor.class);
		//logger.traceEntry();
		anzahlVersuche = 0;
		//logger.traceExit();
	}
	
	/**
	 * @return the aktuellerCode
	 */
	public int[] getAktuellerCode() {
		return aktuellerCode;
	}

	/**
	 * @param aktuellerCode the aktuellerCode to set
	 */
	public void setAktuellerCode(int[] aktuellerCode) {
		this.aktuellerCode = aktuellerCode;
	}

	/**
	 * @return the aktuelleStelle
	 */
	public int getAktuelleStelle() {
		return aktuelleStelle;
	}

	/**
	 * @param aktuelleStelle the aktuelleStelle to set
	 */
	public void setAktuelleStelle(int aktuelleStelle) {
		this.aktuelleStelle = aktuelleStelle;
	}

	/**
	 * @return the anzahlVersuche
	 */
	public int getAnzahlVersuche() {
		return anzahlVersuche;
	}

	/**
	 * @param anzahlVersuche the anzahlVersuche to set
	 */
	public void setAnzahlVersuche(int anzahlVersuche) {
		this.anzahlVersuche = anzahlVersuche;
	}

	/**
	 * Generiere neuen Code
	 * @param maxVersuche 
	 */
	public void init(int maxVersuche) {
		//logger.traceEntry();
		this.aktuellerCode = new Generator().getCode();
		this.anzahlVersuche = 0;
		this.maxVersuche = maxVersuche;
		//logger.traceExit();
	}

	/**
	 * Illegal aber nötig: liefert den Code
	 * 
	 * @return
	 */
	public int[] getCode() {
		return aktuellerCode;
	}

	/**
	 * Code von aussen setzen
	 * 
	 * @return
	 */
	public void setCode(int[] werte) {
		aktuellerCode = werte;
		anzahlVersuche = 0;
	}

	/**
	 * Knacken: immer die aktuelle Stelle
	 * 
	 * @return
	 */
	public int knack(int ziffer) {
		
		int ergebnis;
		anzahlVersuche++;
		
		if (aktuellerCode[aktuelleStelle] == ziffer) {
			//logger.info("(grün) " + ziffer + " Zahl ist richtig");
			aktuelleStelle++;
			anzahlVersuche = 0;
			if (aktuelleStelle == 4) {
				logger.info("(doppelgrün) GESCHAFFT!");
			}
			ergebnis =  0;
		} else if (aktuellerCode[aktuelleStelle] > ziffer) {
			//logger.error("(rot) " + ziffer + " Zahl ist größer. Anzahl der Versuche: " + anzahlVersuche);
			ergebnis = 1;
		} else {
			//logger.error("(rot) " + ziffer + " Zahl ist kleiner. Anzahl der Versuche: " + anzahlVersuche);
			ergebnis = -1;
		}
		return ergebnis;
	}

}
