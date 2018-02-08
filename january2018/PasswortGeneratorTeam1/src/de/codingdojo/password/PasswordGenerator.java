package de.codingdojo.password;

/**
 * Hauptklasse für Dojo 16.01.2018
 *
 */
public class PasswordGenerator {

	/**
	 * Hauptmethode zum Ermitteln eines Passworts aus einem gegebenen Satz
	 * @param satz
	 * @return generiertes Passwort
	 */
	public String pwdgen(String satz) {
		// split in Einzelwörter
		String[] woerter = splitSatz(satz);
		// kummulieren Anfangsbuchstaben
		String anfangsbuchstaben = kummuliereAnfangsbuchstaben(woerter);
		// anhängen Länge
		String result = anfangsbuchstaben + String.valueOf(anfangsbuchstaben.length());
		// Rückgabe Ergebnis
		return result;
	}

	/**
	 * splittet den übergebenen Satz in die Teilwörter
	 * @param satz Der zu splittende Satz
	 * @return array mit den einzelnen Wörtern, nie null
	 */
	public String[] splitSatz(String satz) {
		if (satz == null) {
			return new String[0];
		} else {
			return satz.split(" ");
		}
	}	
	/**
	 * Kummuliert die Anfangsbuchstaben der übergebenen Wörter
	 * @param worter Die zu kummulierenden Wörter, nicht null
	 * @return String bestehend aus den Anfangsbuchstaben
	 */
	public String kummuliereAnfangsbuchstaben(String[] woerter) {
		StringBuilder result = new StringBuilder();
		for (String wort : woerter) {
			result.append(anfangsbuchstabeWort(wort));
		}
		return result.toString();
	}

	/**
	 * WErmittelt den Anfangsbuchstaben des übergebenen Wortes
	 * @param wort
	 * @return String bestehend aus dem Anfangsbuchstaben, nie null
	 */
	public String anfangsbuchstabeWort(String wort) {
		if (wort == null || wort.length() == 0) {
			return "";
		} else {
			return wort.substring(0, 1);
		}
	}

}