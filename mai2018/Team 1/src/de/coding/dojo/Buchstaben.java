package de.coding.dojo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Buchstaben {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String zeichenkette=scanner.nextLine();
		
	}
	
	/**
	 * liefert die Zeichenkette 
	 * @return String
	 */
	public String getZeichenkette(String zeichenkette){
		if("".equals(zeichenkette)){
			throw new RuntimeException("Die Zeichenkette darf nicht leer sein!");
		}
		return zeichenkette;
	}

	/**
	 * berechnet die Gesamtlänge der Zeichenkette
	 * @param zeichenkette
	 * @return Länge
	 */
	public int getGesamtlaenge(String zeichenkette) {
				
		return zeichenkette.length();
	}

	/**
	 * ermittelt die Anzahl des mitgegebenen Buchstabens
	 * @param zeichenkette
	 * @param buchstabeToCheck
	 * @return Anzahl des Buchstabens
	 */
	public int getAnzahl(String zeichenkette, char buchstabeToCheck) {
		
		int zaehler = 0;
		
		for (int i = 0; i < zeichenkette.length(); i++) {
			if (zeichenkette.toLowerCase().charAt(i) == buchstabeToCheck){
					zaehler++;
			}
			
		}
		
		return zaehler;
	}

	/**
	 * liefert die relative Häufigkeit eines Buchstabens im String
	 * @param zeichenkette
	 * @param c
	 * @return
	 */
	public String getScore(String zeichenkette, char c) {
		NumberFormat numberFormat = new DecimalFormat("##00.0000");
		Double result= (((double)getAnzahl(zeichenkette, c)/getGesamtlaenge(zeichenkette))*100);
		return numberFormat.format(result);


	}
	
	

}
