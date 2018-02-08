package de.codingdojo.tresor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tresor {

	private Logger logger;
	private int[] aktuellerCode;
	private int aktuelleStelle = 0;
	private int anzahlVersuche = 0;
	
	public Tresor() {
		logger = LogManager.getLogger(Tresor.class);
		logger.traceEntry();
		anzahlVersuche = 0;
		logger.traceExit();
	}
	
	/**
	 * Generiere neuen Code
	 */
	public void init() {
		logger.traceEntry();
		aktuellerCode = new Generator().getCode();
		anzahlVersuche = 0;
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
		anzahlVersuche++;
		logger.info("(gelb) völlig wurscht");
		if (aktuellerCode[aktuelleStelle] == ziffer) {
			logger.info("(grün) " + ziffer + " Zahl ist richtig");
			aktuelleStelle++;
			if (aktuelleStelle == 4) {
				logger.info("(doppelgrün) GESCHAFFT!");
			}
			return 0;
		} else if (aktuellerCode[aktuelleStelle] > ziffer) {
			logger.error("(rot) " + ziffer + " Zahl ist größer. Anzahl der Versuche: " + anzahlVersuche);
			return -1;
		} else {
			logger.error("(rot) " + ziffer + " Zahl ist kleiner. Anzahl der Versuche: " + anzahlVersuche);
			return 1;
		}
	}

}
