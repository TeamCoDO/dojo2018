package de.codingdojo.oktober;

import java.util.Scanner;

/**
 * @author 
 *
 */
public class BeispielGauss {
	
	private static int i;
	private int testZahl;
	private static Integer ergebnisSumme;
	private static Integer ergebnisFormel;
	
	/**
	* BeispielGauss()
	* Implementiert den Gauß-Test
	*/
	public BeispielGauss() {
		i = 0;
		testZahl = 0;
		ergebnisSumme = 0;
		ergebnisFormel = 0;
	}
	
	/**
	* main()
	* Implementiert den Gauß-Test via main-Aufruf
	*/
	public static void main(String[] args) {
		
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		
		Scanner scanner = new Scanner(System.in);
		String eingabeZahl = scanner.nextLine();
		
		BeispielGauss BeispielGauss = new BeispielGauss();
		BeispielGauss.berechneSumme(eingabeZahl);
		System.out.println("Ergebnis - Summe: " + getErgebnisSumme());
		
		BeispielGauss beispiel2 = new BeispielGauss();
		beispiel2.berechneFormel(eingabeZahl);
		System.out.println("Ergebnis - Formel: " + getErgebnisFormel());
	}

	/**
	* berechneSumme()
	* Berechnet die Summe vom 1 bis zur eingegebenen Zahl
	*/
	protected int berechneSumme(String eingabeZahl) {
		try
		{
			testZahl = Integer.parseInt(eingabeZahl);
			for (i=0; i <= testZahl; i++) {
				System.out.println("Zahl: " + i);
				ergebnisSumme = ergebnisSumme + i;  
			}
		}
		catch (NumberFormatException nfe) {
			System.out.println("berechneSumme() - " + nfe.getMessage());
		}
		return ergebnisSumme;
	}
	
	/**
	* berechneFormel()
	* Berechnet die Summe laut Gauß-Formel
	*/
	protected int berechneFormel(String eingabeZahl) {
		try
		{
			testZahl = Integer.parseInt(eingabeZahl);
			ergebnisFormel = testZahl * (testZahl + 1) / 2;
		}
		catch (NumberFormatException nfe) {
			System.out.println("berechneFormel() - " + nfe.getMessage());
		}
		return ergebnisFormel;
	}
	
	/**
	* getErgebnisSumme()
	* Ausgabe der Ergebnisaddition
	*/
	public static Integer getErgebnisSumme() {
		return ergebnisSumme;
	}
	
	/**
	* getErgebnisFormel()
	* Ausgabe Ergebnis über Formel laut Gauß
	*/
	public static Integer getErgebnisFormel() {
		return ergebnisFormel;
	}
}
