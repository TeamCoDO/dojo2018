/**
 * 
 */
package de.codingdojo.dosenrechner;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 
 *
 */
public class DosenRechnerMain {

	/**
	 * main-Methode zur Dojo-Aufgabe
	 */
	public static void main(String[] args) {
		Dose d = einlesenDose();
		ausgebenDosenwerte(d);
	}

	/**
	 * Einlesen der Parameter einer Dose aus der Konsole 
	 * @return dose
	 */
	private static Dose einlesenDose() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("******** Berechnung von Dosen-Werten *********"); 
				System.out.println("Bitte geben Sie den Umfang der Dose in cm ein: "); 
				double umfang = sc.nextDouble();	
				System.out.println("Bitte geben Sie die Höhe der Dose in cm ein: "); 
				double hoehe = sc.nextDouble();	
				return new Dose(umfang, hoehe);
			} catch (Exception e) {
				System.out.println("falsche Eingabe."); 
			}
		}
	}

	/**
	 * Ausgeben der geforderten Werte zu der Dose
	 * @param d
	 */
	private static void ausgebenDosenwerte(Dose d) {
		ausgebenDosenwert("Durchmesser des Dosenbodens: ", DosenRechner.rechneDurchmesser(d)); 
		ausgebenDosenwert("Fläche des Dosenbodens: ", DosenRechner.rechneFlaecheDosenBoden(d)); 
		ausgebenDosenwert("Mantelfläche der Dose: ", DosenRechner.rechneMantelflaeche(d)); 
		ausgebenDosenwert("Gesamtfläche der Dose: ", DosenRechner.rechneGesamtflaeche(d)); 
		ausgebenDosenwert("Volumen der Dose: ", DosenRechner.rechneVolumen(d)); 
	}
	
	/**
	 * Formatieren einer einzelnen Ausgabezeile
	 * @param text fester Text
	 * @param wert auszugebender Wert
	 */
	private static void ausgebenDosenwert(String text, double wert) {
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println(text + ": " + df.format(wert)); 
	}

}
