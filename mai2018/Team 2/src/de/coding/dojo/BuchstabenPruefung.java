package de.coding.dojo;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BuchstabenPruefung {

	private Scanner scanner;
	public BuchstabenPruefung(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public static void main(String[] args) {
		BuchstabenPruefung bp = new BuchstabenPruefung(new Scanner(System.in));
		String zeichenketteZuPruefen = bp.einlesenZeichenkette();
		
		if (bp.pruefenZeichenkette(zeichenketteZuPruefen)) {
			bp.verarbeiteZeichenkette(zeichenketteZuPruefen);
		} else {
			System.out.println("Zeichenkette fehlerhaft - bitte prüfen!");
		}
		
	}

	private void verarbeiteZeichenkette(String zeichenketteZuPruefen) {
		int laenge = zeichenketteZuPruefen.length();
		
		ermittleWerte('a', laenge, zeichenketteZuPruefen);
		ermittleWerte('e', laenge, zeichenketteZuPruefen);
		ermittleWerte('f', laenge, zeichenketteZuPruefen);
		ermittleWerte('r', laenge, zeichenketteZuPruefen);
		ermittleWerte('q', laenge, zeichenketteZuPruefen);
		ermittleWerte('z', laenge, zeichenketteZuPruefen);
		
	}

	private void ermittleWerte(char c, int laenge, String zeichenketteZuPruefen) {
		// absolute Anzahl Zeichen
		int absolut = zaehleAbsolut(c, laenge, zeichenketteZuPruefen);
		
		// relativ zur Gesamtzahl
		double relativ = (double)absolut/laenge * 100;
		
		// Ausgabe
		NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
		if (absolut > 0) {
			System.out.println(c + ": " + absolut + " (" + nf.format(relativ) + "%)");
		}
		
	}

	protected int zaehleAbsolut(char c, int laenge, String zeichenketteZuPruefen) {
		int absolut = 0;
		char cLower = Character.toLowerCase(c);
		char cUpper = Character.toUpperCase(c);
		
		for(int i = 0; i < laenge; i++) {
			
			if (cLower == zeichenketteZuPruefen.charAt(i) ||
				cUpper == zeichenketteZuPruefen.charAt(i)) {
				absolut++;
			}
		}
		
		return absolut;
	}

	protected String einlesenZeichenkette() {
		try{
			
			return scanner.nextLine();
		}
		catch (NoSuchElementException e) {
			return null;
		}
		
	}
	
	protected boolean pruefenZeichenkette (String zeichenkette) {

		// Prüfung auf null/leer
		if (zeichenkette == null || zeichenkette.isEmpty()) {
			return false;
		}
		
		//Prüfung auf Ziffern
		for(int i = 0; i < zeichenkette.length(); i++) {
			
			if (Character.isDigit(zeichenkette.charAt(i))) {
				return false;
			}
		}
		

		// alles OK
		return true;
	}
	
}
