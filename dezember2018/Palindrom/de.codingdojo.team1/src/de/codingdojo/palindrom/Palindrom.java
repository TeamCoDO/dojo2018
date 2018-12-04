package de.codingdojo.palindrom;

import java.util.Scanner;

/**
 * Hauptklasse für Palindrom-Prüfungen Dojo Dezember 2018
 *
 */
public class Palindrom {
	
/*
 * PseudoCode 
 * Eingabe : scanner
 * Evaluierung : Klein- und Großschreibung wird hierbei vernachlässigt, d.h. 'A' == 'a', 'B' == 'b', usw.
 * Eingabe: Lagerregal, Legovogel, Rentner, Renner, sereneres, Summus   	Ausgabe: Palindrom
 * Eingabe: Wasserfall  Ausgabe: Kein Palindrom
 * Eingabe: Anni roch Corinna. Palindrom
 * Ausgabe : printout
 */


	public static void main(String[] args) {
		
		// Eigabe
		System.out.println("Geben Sie eine Zeichenkette ein!"); 
		Scanner scanner = new Scanner(System.in); 
		String zeichenfolge = scanner.nextLine(); 
		
		// Prüfung
		Palindrom palindrom= new Palindrom();
		boolean isPalindrom = palindrom.isWortPalindrom(zeichenfolge)||palindrom.isSatzPalindrom(zeichenfolge);
		
		//Ausgabe
		if (isPalindrom){
			System.out.println(zeichenfolge + " is ein Palindrom");
		}
		else{
			System.out.println(zeichenfolge + " ist kein Palindrom");	
		}
		
		scanner.close();

	}

	/**
	 * Prüft, ob die übergebene Zeichenfolge ein Palindrom ist
	 * Groß-/Kleinschreibung wird ignoriert
	 * @param zeichenfolge
	 * @return true, wenn die zeichenfolge ein Palindrom ist
	 */
	public boolean isWortPalindrom(String zeichenfolge) {
		// prüfen auf null
		if (zeichenfolge == null) {
			throw new IllegalArgumentException("null als zeichenfolge nicht zulässig");
		}
		// sonderfall leer-String ist kein Palindrom
		if (zeichenfolge.isEmpty()) {
			return false;
		}
		for (int i = 0; i < zeichenfolge.length() / 2; i++) {
			if (!zeichenGleich(zeichenfolge.charAt(i), zeichenfolge.charAt(zeichenfolge.length() - 1 - i))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Prüft, ob die übergebene Zeichenfolge ein Palindrom ist
	 * Groß-/Kleinschreibung wird ignoriert
	 * Satzzeichen und Leerzeichen werden nicht berücksichtigt
	 * @param zeichenfolge
	 * @return true, wenn die zeichenfolge ein Palindrom ist
	 */
	public boolean isSatzPalindrom(String zeichenfolge) {
		return isWortPalindrom(zeichenfolgeBereinigen(zeichenfolge));
	}

	/**
	 * Prüft, ob die beiden übergebenen Zeichen gleich sind
	 * Groß-/Kleinschreibung wird ignoriert
	 * @param zeichen1
	 * @param zeichen2
	 * @return
	 */
	public boolean zeichenGleich(char zeichen1, char zeichen2) {
		return Character.toLowerCase(zeichen1) == Character.toLowerCase(zeichen2);
	}

	/**
	 * entfernt Leerzeichen und Satzzeichen aus der übergebenen Zeichenfolge
	 * @param zeichenfolge
	 * @return
	 */
	public String zeichenfolgeBereinigen(String zeichenfolge) {
		
		// prüfen auf null
		if (zeichenfolge == null) {
			throw new IllegalArgumentException("null als zeichenfolge nicht zulässig");
		}
		return zeichenfolge
				.replaceAll(" ", "")
				.replaceAll("\\,", "")
				.replaceAll("\\.", "")
				.replaceAll("\\!", "")
				.replaceAll("\\?", "")
				.replaceAll("\\:", "");
	}

}
