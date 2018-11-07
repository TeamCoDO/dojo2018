package de.codingdojo.stadt;

/**
 * Entity Klasse für eine Stadt
 *
 */
public class Stadt {
	
	private String name;
	private boolean istHauptstadt;
	private int anzahlEinwohner;
	private double steuernProEinwohner;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean isIstHauptstadt() {
		return istHauptstadt;
	}

	public void setIstHauptstadt(boolean istHauptstadt) {
		this.istHauptstadt = istHauptstadt;
	}

	public int getAnzahlEinwohner() {
		return anzahlEinwohner;
	}

	public void setAnzahlEinwohner(int anzahlEinwohner) {
		this.anzahlEinwohner = anzahlEinwohner;
	}

	public double getSteuernProEinwohner() {
		return steuernProEinwohner;
	}

	public void setSteuernProEinwohner(double steuernProEinwohner) {
		this.steuernProEinwohner = steuernProEinwohner;
	}
	
	
	
	

}
