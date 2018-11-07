package de.codingdojo.autohaus.funktionen;

import java.util.List;

import de.codingdojo.autohaus.model.Auto;

/**
 * Statistik-Funktionen
 *
 */
public class AutoStatistik {

	private final List<Auto> autos;
	
	/**
	 * Konstruktor
	 * @param autos
	 */
	public AutoStatistik(List<Auto> autos) {
		this.autos = autos;
	}
	
	/**
	 * berechne den Verkausfserlös ohne Nachlass
	 * @return Verkausfserlös
	 */
	public double berechneVerkaufserloes() {
		double result = 0.0d;
		for (Auto auto : autos) {
			result += auto.getPreisEur();
		}
		return result;
	}
	
	/**
	 * berechne den Anteil an Unfallwägen in Prozent
	 * @return
	 */
	
	public double berechneAnteiligeUnfallwaegen(){
		int anzUnfall = 0;
		for (Auto auto: autos){
			if (auto.isUnfall()){
				anzUnfall += 1;
			}
		}
		
		return ((double)anzUnfall / autos.size()) * 100;
		
	}
}
