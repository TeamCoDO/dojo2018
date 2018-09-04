/**
 * 
 */
package de.codingdojo.sekunden;

/**
 * Die Klasse Rechner rechnet den übergebenen Sekundenwert um in 
 * Jahre
 * Tage
 * Stunden
 * Minuten
 * Sekunden
 * und speichert das Ergebnis in einer eigenen Ergebnis-Klasse
 */
public class Rechner {
	
	private static final int EIN_JAHR = 31536000;
	private static final int EIN_TAG = 86400;
	private static final int EINE_STUNDE = 3600;
	private static final int EINE_MINUTE = 60;
	
	private int rest = 0;
	
	
	/**
	 * Der eingegeben Wert wird umgerechnet und in der Klasse Ergebnis gespeichert
	 * @param eingabe
	 * @return ergebnis
	 */
	public Ergebnis berechneEingabe(int eingabe) {
		Ergebnis ergebnis = new Ergebnis();
		ergebnis.setJahre(berechneJahre(eingabe));
		
		ergebnis.setTage(berechneTage(rest));
		ergebnis.setStunden(berechneStunden(rest));
		ergebnis.setMinuten(berechneMinuten(rest));
		ergebnis.setSekunden(rest);
		
		return ergebnis;
		
	}

	/**
	 * Wieviele Jahre sind im eingegebenen Sekundenwert enthalten?
	 * @param eingabe
	 * @return int
	 */
	public int berechneJahre(int eingabe) {
		
		rest = eingabe % EIN_JAHR;
		return eingabe / EIN_JAHR;
	}

	/**
	 * Wieviele Tage sind im eingegebenen Sekundenwert enthalten?
	 * @param eingabe
	 * @return int
	 */
	public int berechneTage(int eingabe) {

		rest = eingabe % EIN_TAG;
		return eingabe / EIN_TAG;
	}

	/**
	 * Wieviele Stunden sind im eingegebenen Sekundenwert enthalten?
	 * @param eingabe
	 * @return int
	 */
	public int berechneStunden(int eingabe) {

		rest = eingabe % EINE_STUNDE;
		return eingabe / EINE_STUNDE;
	}

	/**
	 * Wieviele Minuten sind im eingegebenen Sekundenwert enthalten?
	 * @param eingabe
	 * @return int
	 */
	public int berechneMinuten(int eingabe) {

		rest = eingabe % EINE_MINUTE;
		return eingabe / EINE_MINUTE;
	}
	

	/**
	 * Was bleibt als Rest nach der Teilung des eingegebenen Sekundenwertes?
	 * @param eingabe
	 * @return int
	 */
	public int getRest() {
		return rest;
	}
	
	
}
