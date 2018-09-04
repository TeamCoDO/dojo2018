package de.codingdojo.dojo201809.aufgabe2;

/**
 * Umrechnung von Sekunden in detaillierte Zeitangaben
 * 
 *
 */
public class SekundenRechner {

	static final int SEKUNDEN_PRO_MINUTE = 60;
	static final int SEKUNDEN_PRO_STUNDE = 60 * SEKUNDEN_PRO_MINUTE;
	static final int SEKUNDEN_PRO_TAG = 24 * SEKUNDEN_PRO_STUNDE;
	static final int SEKUNDEN_PRO_JAHR = 365 * SEKUNDEN_PRO_TAG;
	
	/**
	 * Zerlegen von Sekunden in einen ZeitContainer
	 * 
	 * @param sekunden
	 * @return
	 */
	public ZeitContainer zerlegeSekunden(int sekunden) {

		if (sekunden < 0) {
			throw new IllegalArgumentException("Ungültiger Wert " + sekunden);
		}
		
		ZeitContainer result = new ZeitContainer();
		int rest = sekunden;
		
		result.setJahre(rest / SEKUNDEN_PRO_JAHR);
		rest = rest % SEKUNDEN_PRO_JAHR; 
		
		result.setTage(rest / SEKUNDEN_PRO_TAG);
		rest = rest % SEKUNDEN_PRO_TAG; 
		
		result.setStunden(rest / SEKUNDEN_PRO_STUNDE);
		rest = rest % SEKUNDEN_PRO_STUNDE; 
		
		result.setMinuten(rest / SEKUNDEN_PRO_MINUTE);
		rest = rest % SEKUNDEN_PRO_MINUTE; 
		
		result.setSekunden(rest);
		
		return result;
	}
}
