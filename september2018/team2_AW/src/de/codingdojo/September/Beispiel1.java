package de.codingdojo.September;

import java.util.Scanner;

public class Beispiel1 {
	
	private static int i; // Länge Eingabefeld
	private static String str1 = ""; // Eingabe Zeichenkette
	private static String str2 = ""; // Gespiegelte Zeichenkette
	private static String ergebnis = ""; // Verknüpfte Zeichenkette str1 + str2
	
	public Beispiel1 (String str) {
		ermittleString(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bitte geben Sie eine Zeichenkette ein: ");
		Scanner scanner = new Scanner(System.in);
		str1 = scanner.nextLine();
		i = str1.length();
		System.out.println("i: " + i);
		
		// Verknüpfen der Eingabe mit dem Spiegelbild der Eingabe
		while (i > 0) {
			i--;
			// Einzelnen Stringwert ermitteln und zu str2 anfügen
			str2 = str2 + str1.charAt(i);
			System.out.println("str2: " + str2);
		}
		
		ergebnis = str1 + str2;
		
		System.out.println("Ergebnis: " + ergebnis);
	}
	
	public void ermittleString(String input) {
		
		i = input.length();
		System.out.println("i: " + i);
		
		// Verknüpfen der Eingabe mit dem Spiegelbild der Eingabe
		while (i > 0) {
			i--;
			// Einzelnen Stringwert ermitteln und zu str2 anfügen
			str2 = str2 + input.charAt(i);
			System.out.println("input: " + input);
		}
		
		ergebnis = input + str2;
		
		System.out.println("Ergebnis: " + ergebnis);
	}
	
	public String getErgebnis() {
		return (ergebnis);
	}

}
