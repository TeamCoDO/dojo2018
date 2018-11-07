package de.codingdojo.stadt;

public class StadtAuswerter {
	
	/**
	 * Prüfung, ob die Stadt eine Hauptstadt ist
	 * @param stadt
	 * @return
	 */
	public boolean istStadtHauptstadt(Stadt stadt) {
		if (stadt.getAnzahlEinwohner()>=Metropole.EINWOHNERLOW&&stadt.isIstHauptstadt()) {
			return true;
		}
		else if (stadt.getAnzahlEinwohner()>=Metropole.EINWOHNERHIGH&&steuerEnnahmenCheck(stadt)) {
			return true;
		}
		return false;
	}

	/**
	 * Prüfung, ob die Steuereinnahmen den Anforderungen entsprechen
	 * @param stadt
	 * @return
	 */
	public boolean steuerEnnahmenCheck(Stadt stadt) {
		return steuerEinnahmen(stadt) >=Metropole.STEUEREINNAHMEN;
	}

	/**
	 * Berechnung der 
	 * @param stadt
	 * @return
	 */
	public double steuerEinnahmen(Stadt stadt) {
		return stadt.getSteuernProEinwohner() *stadt.getAnzahlEinwohner();
	}



}
