package de.codingdojo.dojo201809.aufgabe2;

/**
 * Ein einfacher unveränderbarer (immutable) Container für Zeitangaben
 * 
 */
public class ZeitContainer {

	private int jahre;
	private int tage;
	private int stunden;
	private int minuten;
	private int sekunden;

	/**
	 * @return the jahre
	 */
	public int getJahre() {
		return jahre;
	}

	/**
	 * @return the tage
	 */
	public int getTage() {
		return tage;
	}

	/**
	 * @return the stunden
	 */
	public int getStunden() {
		return stunden;
	}

	/**
	 * @return the minuten
	 */
	public int getMinuten() {
		return minuten;
	}

	/**
	 * @return the sekunden
	 */
	public int getSekunden() {
		return sekunden;
	}

	/**
	 * @param jahre the jahre to set
	 */
	public void setJahre(int jahre) {
		this.jahre = jahre;
	}

	/**
	 * @param tage the tage to set
	 */
	public void setTage(int tage) {
		this.tage = tage;
	}

	/**
	 * @param stunden the stunden to set
	 */
	public void setStunden(int stunden) {
		this.stunden = stunden;
	}

	/**
	 * @param minuten the minuten to set
	 */
	public void setMinuten(int minuten) {
		this.minuten = minuten;
	}

	/**
	 * @param sekunden the sekunden to set
	 */
	public void setSekunden(int sekunden) {
		this.sekunden = sekunden;
	}
	
	
}
