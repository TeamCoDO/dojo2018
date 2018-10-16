package de.codingdojo.gauss;

public class GaussAusgaben {

	/**
	 * Ausgabe der Berechnung nach Summenbildung
	 * @param eingabe
	 * @return
	 */
	public static String bildeSummeAusgabe(long eingabe) {
		String resultText = "";
		
		for (long i = 1; i <= eingabe; i++) {
			if (i == 1) {
				resultText = "" + i;
			} else {
				resultText = resultText + " + " + i;
			}
		}
		resultText = resultText + " = " + GaussTools.bildeSumme(eingabe);

		return resultText;
	}

	/**
	 * Ausgabe der Berechnung nach Gauss
	 * @param eingabe
	 * @return
	 */
	public static String berechneNachGaussAusgabe(long eingabe) {
		return  eingabe + " * (" +eingabe +" + 1) / 2 = " + GaussTools.berechneNachGauss(eingabe);
	}

}
