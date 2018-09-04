/**
 * 
 */
package de.codingdojo.sekunden;

/**
 * 
 * Objekt zum Erfassen von Jahren, Tagen, Stunden, Minuten und Sekunden
 *
 */
public class Ergebnis {

	private int jahre = 0;
	private int tage = 0;
	private int stunden = 0;
	private int minuten = 0;
	private int sekunden = 0;
	
	public int getSekunden() {
		return sekunden;
	}
	public void setSekunden(int sekunden) {
		this.sekunden = sekunden;
	}
	public int getJahre() {
		return jahre;
	}
	public void setJahre(int jahre) {
		this.jahre = jahre;
	}	
	
	public int getTage() {
		return tage;
	}
	public void setTage(int tage) {
		this.tage = tage;
	}
	public int getStunden() {
		return stunden;
	}
	public void setStunden(int stunden) {
		this.stunden = stunden;
	}
	public int getMinuten() {
		return minuten;
	}
	public void setMinuten(int minuten) {
		this.minuten = minuten;
	}
	

}
