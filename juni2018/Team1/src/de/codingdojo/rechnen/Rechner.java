package de.codingdojo.rechnen;

import java.util.Random;
import java.util.Scanner;

public class Rechner {

	static int untergrenze;
	static int obergrenze;
	static int anzahlAufgaben;
	static Scanner scanner;
	static String art;
	
	public static void main(String[] args) {
		
		
		anzahlAufgaben = abfrageAnzahl();

		art = abfrageArt();

		abfrageGrenzen(scanner, anzahlAufgaben);

		int wert1 = randInt(untergrenze, obergrenze);
		int wert2 = randInt(untergrenze, obergrenze);
		
		for (int i = 0; i < anzahlAufgaben; i++) {
			switch (art) {
			case "++":
				Rechnen.pruefeAufgabenergebnis(wert1, wert2, "+", untergrenze, obergrenze);
			case "+-":
			case "-+":
			case "--":
				Rechnen.pruefeAufgabenergebnis(wert1, wert2, "-", untergrenze, obergrenze);

			default:
				System.out.println("Dürfte nicht passieren");
			}
			
		}

	}
	
	public static int randInt(int min, int max) {
		  Random rand = null;
		  int randomNum = rand.nextInt((max - min) + 1) + min;
		  return randomNum;
		}

	/**
	 * Abfrage der Zahlenraumgrenzen und Überprüfung der Eingaben auf Plausibilität
	 * @return
	 */
	private static void abfrageGrenzen(Scanner scanner, int anzahlAufgaben) {
		System.out.println("Bitte Untergrenze des Zahlenraums eingeben: ");
		untergrenze = scanner.nextInt();

		System.out.println("Bitte Obergrenze des Zahlenraums eingeben: ");
		obergrenze = scanner.nextInt();

		Rechnen.pruefeGrenzen(untergrenze, obergrenze);
		Rechnen.pruefeDifferenzGrenzen(untergrenze, obergrenze, anzahlAufgaben);
	}

	/**
	 * Abfrage der Rechenart und Überprüfung der Eingabe auf Sinnhaftigkeit
	 * @return
	 */
	private static String abfrageArt() {
		
		System.out.println("Bitte Art der Aufgabe eingeben (++, --, +-, -+): ");

		scanner = new Scanner(System.in);
		String art = scanner.nextLine();
		
		while(!Rechnen.pruefeAufgabenEingabeArt(art))
		{
			System.out.println("Bitte Art der Aufgabe eingeben (++, --, +-, -+): ");
			scanner = new Scanner(System.in);
			art = scanner.nextLine();
		}
		return art;
	}

	/**
	 * Abfrage der Aufgabenanzahl und Überprüfung der Eingabe auf INT
	 * @return
	 */
	private static int abfrageAnzahl() {
		int anzahlAufgaben = 0;
		System.out.println("Wieviele Aufgaben möchten Sie lösen?");
		Scanner scanner = new Scanner(System.in);
		
		if(scanner.hasNextInt())
		{
			anzahlAufgaben = scanner.nextInt();
		}
		else{
			System.out.println("Bitte Zahl eingeben: ");
			scanner = new Scanner(System.in);
			while(!scanner.hasNextInt())
			{
				System.out.println("Bitte Zahl eingeben: ");
				scanner = new Scanner(System.in);
			}
			anzahlAufgaben = scanner.nextInt();
		}
		return anzahlAufgaben;
	}

}
