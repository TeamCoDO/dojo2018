/**
 * 
 */
package de.codingdojo.sekunden;

import java.util.Scanner;

/**
 * SekundenUmrechnen ist eine HauptKlasse für Eingabe eines Sekundenwertes und Ausgabe eines Ergebnisses der Form
 * xxx Sekunden entsprechen:
 * x Jahren,
 * x Tagen,
 * x Stunden,
 * x Minuten und
 * x Sekunden.
 *
 */
public class SekundenUmrechnenMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welchen Sekundenwert wollen Sie zerlegen?");
		Scanner sc = new Scanner(System.in);
		try { 
			int eingabe = sc.nextInt();
		
			Ergebnis ergebnis = berechneErgebnis(eingabe);
			printAusgabe(ergebnis, eingabe);
		}
		finally {
			if(sc!=null)
				sc.close();
		}
	}
	
	
	/**
	 * Gibt das berechnete Ergebnis aus
	 * @param ergebnis
	 * @param eingabe
	 */
	private static void printAusgabe(Ergebnis ergebnis, int eingabe) {
		
		StringBuilder ausgabe = new StringBuilder();
		ausgabe.append(eingabe + " Sekunden entsprechen: " + "\n");
		ausgabe.append(ergebnis.getJahre() + " Jahre," + "\n");
		ausgabe.append(ergebnis.getTage() + " Tage," + "\n");
		ausgabe.append(ergebnis.getStunden() + " Stunden," + "\n");
		ausgabe.append(ergebnis.getMinuten() + " Minuten und" + "\n");
		ausgabe.append(ergebnis.getSekunden() + " Sekunden");

		System.out.println(ausgabe);
	}
	
	/**
	 * Berechnet ein Ergebnis aus dem enigegebenen Sekundenwert
	 * @param eingabe
	 * @return
	 */
	private static Ergebnis berechneErgebnis(int eingabe) {
		Rechner rechner = new Rechner();
		return rechner.berechneEingabe(eingabe);
	}

}
