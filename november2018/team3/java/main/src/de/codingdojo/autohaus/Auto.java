package de.codingdojo.autohaus;

public class Auto {

	private String hersteller;
	private long laufleistung;
	private double preis;
	private String farbe;
	private boolean unfallwagen;
	private String kraftstoff;
	private double leistung ;
	

	public Auto(String hersteller, long laufleistung, double preis, String farbe, boolean unfallwagen, String kraftstoff, double leistung) {
		this.hersteller = hersteller;
		this.laufleistung = laufleistung;
		this.preis = preis;
		this.farbe = farbe;
		this.unfallwagen = unfallwagen;
		this.kraftstoff = kraftstoff;
		this.leistung = leistung;
	}

	/**
	 * Die Methode gibt den Hersteller des Autos zurück.
	 * @return String hersteller
	 */
	public String getHersteller() {
		return hersteller;
	}
	
	public long getLaufleistung() {
		return laufleistung;
	}

	public void setLaufleistung(long laufleistung) {
		this.laufleistung = laufleistung;
	}

	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public boolean isUnfallwagen() {
		return unfallwagen;
	}

	public void setUnfallwagen(boolean unfallwagen) {
		this.unfallwagen = unfallwagen;
	}

	public String getKraftstoff() {
		return kraftstoff;
	}

	public void setKraftstoff(String kraftstoff) {
		this.kraftstoff = kraftstoff;
	}

	public double getLeistung() {
		return leistung;
	}

	public void setLeistung(double leistung) {
		this.leistung = leistung;
	}

	@Override
	public String toString() {
		String text = "";
		// Beginn der Textausgabe des Autos
		text = text + "---\n";

		// Hersteller der Textausgabe hinzufügen
		text = text + "Hersteller: " +getHersteller() +"\n";

		// Preis der Textausgabe hinzufügen
		text = text + "Preis: " +getPreis() + " EUR" + "\n";		

		// Motor (Leistung u. Kraftstoff) der Textausgabe hinzufügen
		text = text + "Motor: " +getLeistung() + " PS (" + getKraftstoff() + ")" + "\n";	

		// KM-Stand der Textausgabe hinzufügen
		text = text + "KM-Stand: " +getLaufleistung() + " km" +"\n";		

		// Farbe der Textausgabe hinzufügen
		text = text + "Farbe: " +getFarbe() +"\n";

		// unfallfrei? der Textausgabe hinzufügen	
		if (isUnfallwagen()) {
			text = text + "" + "\n";
		} else {
			text = text + "unfallfrei"  + "\n";			
		}

		// Abschluss der Textausgabe des Autos
		text = text + "---";
		
		return text;
	}
	
	
	
}
