package de.codingdojo.rechnen;

import java.util.Scanner;

public class Rechnen {
	
	private int eingabe;
	private static int globalresult;
	private static int globalresult1;
	private static int globalresult2;
	
	
	public static void main(String[] args) {
		
		System.out.println("Wieviele Aufgaben möchten Sie lösen: ");
		Scanner scanner = new Scanner(System.in);
		String anzahl = scanner.nextLine();
		System.out.println("Your anzahl is " + anzahl);
		
		System.out.println("Welche RechenOperation wollen Sie durchführen: ");
		String rechenop = scanner.nextLine();
		System.out.println("Deine Rechenoperation ist " + rechenop);
		
		pruefeRechenart(rechenop);
		
		int int1 = ermittleZahl();
		int int2 = ermittleZahl();
		
		System.out.println("Zahl 1: " + int1);
		System.out.println("Zahl 2: " + int2);
		
		pruefeZahlenraum(int1, int2);
		
		aufgabeBerechnen(int1, int2, rechenop);
		
		System.out.println("Ergebnis eingeben: ");
		String erg = scanner.nextLine();
		System.out.println("Dein Ergebnis lautet " + erg);
		
		int result = Integer.parseInt(erg);
		pruefeErgebnis(result);
		
		if (rechenop.equals("++") || rechenop.equals("--")) {
		
		if (result == globalresult) {
			System.out.println("Super! Bravo! Richtig gerechnet!");
		} else {
			System.out.println("Bist du dir sicher?");
		}
		
	}

	}
	
	public static int ermittleZahl() {
		int rand = (int) (Math.random() * 100);
		boolean gef = false;
		if (rand > 100 || rand < 0) {
			while (gef == false) {

				if (rand > 0 && rand < 100) {
					gef = true;
					
				}
			}
		}
		return rand; 
	}

	public boolean istZahl (int ieingabe) {
		
		if (ieingabe > 0 && ieingabe <= 10) {
			return true;
		}
		
		return false;
	}
	
	public static boolean pruefeRechenart (String eingabe) {
		
		if (eingabe.equals("++")
		   || eingabe.equals("--")
		   || eingabe.equals("+-")
		   || eingabe.equals("-+")) {
			return true;
		}
		
		return false;
	}
	
	public static boolean pruefeZahlenraum (int min, int max) {
		
		if (min < 0 || max < 0) {
			return false;
		}
		
		if (min >= max) {
			return false;
		}
		
		if (min > 100 || max > 100) {
			return false;
		}
		
		return true;
	}
	
	public static boolean pruefeErgebnis (int ieingabe) {
		
		if (ieingabe < 0 
		   || ieingabe > 100) {
			return false;
		}
		
		return true;
	}
	
	public static void aufgabeBerechnen (int parm1, int parm2, String rechenart) {
		if (rechenart.equals("++")) {
			globalresult = parm1 + parm2;
		}
		
		if (rechenart.equals("--")) {
			globalresult = parm1 - parm2;
		}
		
		if (rechenart.equals("+-")
		   || rechenart.equals("-+")) {
			globalresult1 = parm1 + parm2;
			globalresult2 = parm1 - parm2;
		}
		
	}

}
