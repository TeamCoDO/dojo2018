package de.codingdojo.dojo201809.aufgabe1;

import org.apache.commons.lang3.StringUtils;

/**
 * Eine Klasse, die Methoden zum Spiegeln von Strings zur Verfügung stellt. Sie
 * unterstützt zwei Implementierungen: Standand mit Apache Commons und eine
 * Eigenimplementierung (default).
 * 
 *
 */
public class StringMirror {

	boolean apacheMode = false;

	public StringMirror() {
		// nix zu tun
	}

	/**
	 * Konstruktor mit Steuerung, ob Apache verwendet werden soll
	 * 
	 * @param apacheMode
	 */
	public StringMirror(boolean apacheMode) {
		this.apacheMode = apacheMode;
	}

	/**
	 * Methode zum Spiegeln eines Eingabestrings
	 * 
	 * @param eingabe
	 * @return der gespiegelte String
	 */
	public String mirror(final String eingabe) {

		if (eingabe == null) {
			return null;
		}

		StringBuilder result = new StringBuilder(eingabe);
		if (apacheMode) {
			result.append(reverseApache(eingabe));
		} else {
			result.append(reverseEigenimplementierung(eingabe));
		}
		return result.toString();
	}

	/**
	 * Liefert den Eingabestring rückwärts
	 * 
	 * @param eingabe
	 * @return der String rückwärts
	 */
	private String reverseEigenimplementierung(final String eingabe) {

		StringBuilder result = new StringBuilder();

		for (int ii = eingabe.length() - 1; ii >= 0; ii--) {
			result.append(eingabe.charAt(ii));
		}

		return result.toString();
	}

	/**
	 * Liefert den Eingabestring rückwärts mit Apache
	 * 
	 * @param eingabe
	 * @return der String rückwärts
	 */
	private String reverseApache(final String eingabe) {
		return StringUtils.reverse(eingabe);
	}

}
