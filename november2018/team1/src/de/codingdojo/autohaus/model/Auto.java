package de.codingdojo.autohaus.model;

public class Auto {
	private final String  hersteller;
	private final long laufleistungKm;
	private final double preisEur;
	private final String farbe;
	private final boolean unfall;
	private final String kraftstoff;
	private final double leistungPs;
	
	public Auto(String hersteller, long laufleistung, double preisEur, String farbe, boolean unfall, String kraftstoff, double leistungPs) {
		this.hersteller = hersteller;
		this.laufleistungKm = laufleistung;
		this.preisEur = preisEur;
		this.farbe = farbe;
		this.unfall = unfall;
		this.kraftstoff = kraftstoff;
		this.leistungPs = leistungPs;
	}
	public String getHersteller() {
		return hersteller;
	}
	public long getLaufleistungKm() {
		return laufleistungKm;
	}
	public double getPreisEur() {
		return preisEur;
	}
	public String getFarbe() {
		return farbe;
	}
	public boolean isUnfall() {
		return unfall;
	}
	public String getKraftstoff() {
		return kraftstoff;
	}
	public double getLeistungPs() {
		return leistungPs;
	}
	
	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("---" + "\n");
		buffer.append("Hersteller: " + getHersteller() + "\n");
		buffer.append("Preis: " + getPreisEur() + " EUR" + "\n");
		buffer.append("Motor " + getLeistungPs() + " PS (" + getKraftstoff() + ")" + "\n");
		buffer.append("KM-Stand: " + getLaufleistungKm() + " km" + "\n");
		buffer.append("Farbe: " + getFarbe() + "\n");
		if (!isUnfall()){
			buffer.append("unfallfrei" + "\n");
			
		}
		buffer.append("---");
		
		return buffer.toString();
	}
}
