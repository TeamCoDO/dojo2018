package de.codingdojo.dosenrechner;

/**
 * Diese Klasse kapselt die Informationen zu einer Dose
 * @author 
 *
 */
public class Dose {

	private final double umfang;
	private final double hoehe;
	
	/**
	 * Konstruktor
	 * @param umfang
	 * @param hoehe
	 */
	public Dose(double umfang, double hoehe) {
		// Prüfungen
		if (umfang < 0) {
			throw new IllegalArgumentException("Umfang darf nicht negativ sein");
		}
		if (hoehe < 0) {
			throw new IllegalArgumentException("Höhe darf nicht negativ sein");
		}
		// Werte übernehmen
		this.umfang = umfang;
		this.hoehe = hoehe;
	}

	public double getUmfang() {
		return umfang;
	}

	public double getHoehe() {
		return hoehe;
	}

}
