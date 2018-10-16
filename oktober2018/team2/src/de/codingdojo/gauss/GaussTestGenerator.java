package de.codingdojo.gauss;

public class GaussTestGenerator {

	public static void main(String[] args) {
		System.out.println("Start Test");
		for (long zahl = 0; zahl <= 10000000; zahl++) {
			boolean result = GaussTools.vergleicheErgebnisse(GaussTools.bildeSumme(zahl), GaussTools.berechneNachGauss(zahl));
			
			if(result) {
				//System.out.println("Das Ergebnis ist für " + zahl + " gleich!");
			} else {
				System.out.println("Das Ergebnis ist für " + zahl + " nicht gleich!");
			}
		}
		System.out.println("Ende Test");

	}

}
