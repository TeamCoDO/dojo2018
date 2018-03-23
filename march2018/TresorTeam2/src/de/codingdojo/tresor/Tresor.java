package de.codingdojo.tresor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tresor {

	private Logger logger;
	private int[] aktuellerCode;
	private int aktuelleStelle = 0;
	private int anzahlVersuche = 0;
	private int anzahlVersucheMax=4;
	
	
	public Tresor() {
		logger = LogManager.getLogger(Tresor.class);
		logger.traceEntry();
		logger.traceExit();
	}
	
	/**
	 * Generiere neuen Code
	 */
	public void init() {
		logger.traceEntry();
		aktuellerCode = new Generator().getCode();
		anzahlVersuche = anzahlVersucheMax;
		logger.traceExit();
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
	 * Code von aussen setzen (illegal, zum Testen)
	 * 
	 * @return
	 */
	public void setCode(int[] werte) {
		aktuellerCode = werte;
	}

	/**
	 * Knacken: immer die aktuelle Stelle
	 * 
	 * @return
	 */
	public int knack(int ziffer){
		checkRestversuche(getRestversuche());
		
		if (aktuellerCode[aktuelleStelle] == ziffer) {
			logger.info(ziffer + " Zahl ist richtig");
			
			aktuelleStelle++;
			if (aktuelleStelle == 4) {
				logger.info("(doppelgrün) GESCHAFFT!");
			}
			restoreAnzahlVersuche();
			return 0;
		} else if (aktuellerCode[aktuelleStelle] > ziffer) {
			decrementiereAnzahlVersuche();
			logger.error(ziffer + " Zahl ist größer. Anzahl der Versuche: " + getRestversuche());
			return -1;
		} else {
			decrementiereAnzahlVersuche();
			logger.error( ziffer + " Zahl ist kleiner. Anzahl der Versuche: " + getRestversuche());
			return 1;
		}
		
	}
	
	public void checkRestversuche(int anzahlVersuche) {
		if (anzahlVersuche==0) {
			throw new TresorException();
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public int getRestversuche() {
		return anzahlVersuche;
	}
	
	public void decrementiereAnzahlVersuche() {
		anzahlVersuche--;
	}
	
	public void restoreAnzahlVersuche() {
		anzahlVersuche=anzahlVersucheMax;
	}
	
	
	public void setAnzahlVersucheProZiffer(int anzahlVersuche) {
		this.anzahlVersucheMax=anzahlVersuche;
		restoreAnzahlVersuche();
	}
	
	public String getStatus( ) {
		StringBuilder sb = new StringBuilder();
		for (int ii = 0; ii < aktuelleStelle; ii++) {
			sb.append(aktuellerCode[ii]);
			sb.append(" ");
		}
		int ss = aktuelleStelle;
		if (anzahlVersuche == 0) {
			sb.append("X ");
			ss++;
		}
		for (int ii = ss; ii < 4; ii++) {
			sb.append("_ ");
		}
		return sb.toString();
	}

}
