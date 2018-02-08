package de.codingdojo.tresorcode;

public interface ITresorCode {
	/**
	 * Prüft die angegebene Ziffer auf Übereinstimmuing mit der aktuellen Position im Code
	 * @param iZiffer zu prüfende Ziffer
	 * @return
	 */
	VergleichErgebnis versucheZiffer(int iZiffer);
	
	/**
	 * 
	 * Liefert die Anzahl Restversuche für die aktuelle Position im Code zurück
	 * @return
	 */
	int getAnzahlRestversuche();
	
	/**
	 * Liefert die aktuelle Position im Code zurück
	 * @return
	 */
	int getAktuelleStelle();
}
