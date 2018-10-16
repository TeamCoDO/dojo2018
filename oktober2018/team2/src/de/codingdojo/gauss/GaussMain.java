/**
 * 
 */
package de.codingdojo.gauss;

import java.util.Scanner;

/**
 * @author 
 *
 */
public class GaussMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Ausgabe 
		System.out.println("Welche Zahl wollen Sie prüfen: "); 
		Scanner scanner = new Scanner(System.in); 
		long zahl = scanner.nextInt(); 

		System.out.println(GaussAusgaben.bildeSummeAusgabe(zahl));
		System.out.println();
		System.out.println(GaussAusgaben.berechneNachGaussAusgabe(zahl));
		System.out.println();
		
		
		boolean result = GaussTools.vergleicheErgebnisse(GaussTools.bildeSumme(zahl), GaussTools.berechneNachGauss(zahl));
		
		if(result) {
			System.out.println("Das Ergebnis ist für " + zahl + " gleich!");
		} else {
			System.out.println("Das Ergebnis ist für " + zahl + " nicht gleich!");
		}
		
		scanner.close();
	}

}
