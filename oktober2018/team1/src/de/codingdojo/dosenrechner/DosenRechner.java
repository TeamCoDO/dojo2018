package de.codingdojo.dosenrechner;

/**
 * Klasse mit statischen Methoden zur Berechnung verschiedener Dosen-Werte 
 * @author 
 *
 */
public class DosenRechner {

	/**
	 * Durchmesser des Dosenbodens= Umfang/PI
	 * @param dose
	 * @return Durchmesser der Dose
	 */
	public static double rechneDurchmesser(final Dose dose) {
		return dose.getUmfang() / Math.PI;
	}

	/**
	 * Flaeche des Dosenbodens= PI mal (Duchmesser des Dosenbodens/2) hoch zwei
	 * @param dose
	 * @return Fläche des Bodens der Dose
	 */
	public static double rechneFlaecheDosenBoden(Dose dose) {
		double radius = rechneDurchmesser(dose) / 2.0;
		return Math.PI * (radius * radius);
	}
	/**
	 * Mantelflaeche der Dose= Umfang mal Hoehe
	 * @param dose
	 * @return Mantelfläche der Dose
	 */
	public static double rechneMantelflaeche(Dose dose) {
		return dose.getUmfang() * dose.getHoehe();
	}

	/**
	 * Gesamtfläche ist 2 * Grundfläche + Mantelfläche
	 * @param dose
	 * @return Gesamtfläche der Dose
	 */
	public static double rechneGesamtflaeche(Dose dose) {
		return 2 * rechneFlaecheDosenBoden(dose) + rechneMantelflaeche(dose);
	}

	/**
	 * Volumen ist Grundfläche mal Höhe
	 * @param dose
	 * @return Volumen der Dose
	 */
	public static double rechneVolumen(Dose dose) {
		return rechneFlaecheDosenBoden(dose) * dose.getHoehe();
	}

}
