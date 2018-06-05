/**
 * 
 */
package de.codingdojo.rechenspiel;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**

 *
 */
public class Rechenspiel {

	private static final String EINGABETEXT = "Wie viele Aufgaben möchten Sie lösen?";
	private int anzahlAufgaben = 0;
	private int range;
	private String operation;
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	private static Rechenspiel rechenspiel;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		rechenspiel = new Rechenspiel();
		System.out.println(getEingabetext());
		boolean isAnzahlOk = false;
		do {
			if (scanner.hasNextLine()) {
				try {
					rechenspiel.setAnzahlAufgaben(RechenspielUtilities.toNumber(scanner.nextLine()));
					isAnzahlOk = true;
				} catch (NumberFormatException e) {
					System.out.println("Bitte eine gültige Zahl eingeben: ");
				}

			} 
		} while (!isAnzahlOk);
		

		System.out.println("Welche Operation soll durchgeführt werden?: ");

		boolean rechenartOk = false;
		do {
			if (scanner.hasNextLine()) {
					String operationString = scanner.nextLine();
					if (RechenspielUtilities.isOperationValidate(operationString)){
						rechenspiel.setOperation(operationString);
						rechenartOk = true;
					}
					else{
						System.out.println("Gültige Rechenarten sind: ++, --, +-, -+");
					}

			} 
		} while (!rechenartOk);
		

		System.out.println("In welchem Zahlenraum soll gerechnet werden: ");

		boolean zahlenraumOk = false;
		do {
			if (scanner.hasNextLine()) {
				try {
					rechenspiel.setRange(RechenspielUtilities.toNumber(scanner.nextLine()));
					zahlenraumOk = true;
				} catch (NumberFormatException e) {
					System.out.println("Bitte eine gültige Zahl eingeben: ");
				}

			} 
		} while (!zahlenraumOk);
		
		int counter = 0;
		
		do {
			//TODO Aufgaben generieren, ausgeben und Eingabe der Lösung prüfen
		} while (counter<rechenspiel.getAnzahlAufgaben());
		
		
	

	}

	public int getAnzahlAufgaben() {
		return anzahlAufgaben;
	}

	public void setAnzahlAufgaben(int anzahlAufgaben) {
		this.anzahlAufgaben = anzahlAufgaben;
	}

	/**
	 * Liefert den Text zur Eingabe zurück
	 * @return
	 */
	public static String getEingabetext() {
		return EINGABETEXT;
	}

	/**
	 * @param range
	 */
	public void setRange(int range) {
		this.range=range;
	}

	/**
	 * @return
	 */
	public int getRange() {
		return this.range;
	}

}
