/**
 * 
 */
package de.codingdojo.stadt;

import java.util.Scanner;

/**
 * Aufruf des Programms für die Prüfung ob eine Stadt eine Metropole ist 
 *
 */
public class StadtMain {
	

	/**
	 * Entry Point
	 */
	public static void main(String[] args) {
		Stadt stadtToCheck = eingabe();
		evaluiierung(stadtToCheck);

	}
	
	/**
	 * Eingabe der Benutzer über die Daten der Stadt, die geprüft werden soll
	 * @return
	 */
	private static Stadt eingabe() {
		
		Stadt stadt =new Stadt();
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Name der Stadt? "); 
		stadt.setName(scanner.nextLine());
		
		System.out.println("Einwohner? ");
		stadt.setAnzahlEinwohner(scanner.nextInt());
		
		System.out.println("Hauptstadt? "); 
		stadt.setIstHauptstadt(isHauptstadt(scanner.nextLine()));
		
		if (scanner.nextLine().equals("false")) {
			stadt.setIstHauptstadt(false);
		}else {
			stadt.setIstHauptstadt(true);
		}
		
		System.out.println("Steuern pro Einwohner? "); 
		stadt.setSteuernProEinwohner(scanner.nextInt());
		return stadt;
		
	}
	
	/**
	 * Konvertierung der Eingabe in Textform in erwartete Parameter 
	 * @param antwort
	 * @return
	 */
	public static boolean isHauptstadt(String antwort) {
		if (antwort.equals("false")||antwort.equals("nein")) {
			return false;
		}else if (antwort.equals("true")||antwort.equals("ja")) {
			return true;
		}
		return false;
	}
	
	/**
	 * Auswertung ob der Stadt eine Metropole ist und die Ausgabe der Ergebnisse
	 * @param stadt
	 */
	private static void evaluiierung(Stadt stadt) {
		StadtAuswerter stadtAuswerter= new StadtAuswerter();
		
		if (stadtAuswerter.istStadtHauptstadt(stadt)) {
			System.out.println(stadt.getName() + "ist eine Metropole");
		} else {
			System.out.println(stadt.getName() + "ist keine Metropole");
		}
	}

}
