/**
 * 
 */
package de.codingdojo.gauss;

/**
 * @author 
 *
 */
public class GaussTools {

	
	
	/**
	 * Bildet die Summe nach der Vorlage
	 * 1+2+...+n=result
	 * @param n
	 * @return result
	 */
	public static long bildeSumme(long n) {
		
		long result = 0;
		
		for (long i = 1; i <= n; i++) {
			result+=i;
		}
		return result;
	}

	/**
	 * Berechnet die Summe anhand der Formel nach Gauss
	 * @param n
	 * @return result
	 */
	public static long berechneNachGauss(long n) {
			
		return n * (n + 1) / 2;
	}

	/**
	 * Vergleicht zwei Eingabeparameter vom Typ long auf Gleichheit
	 * @param ergebnis1
	 * @param ergebnis2
	 * @return
	 */
	public static boolean vergleicheErgebnisse(long ergebnis1, long ergebnis2) {
		
		return ergebnis1 == ergebnis2;
	}

}
