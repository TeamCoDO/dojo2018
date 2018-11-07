package de.codingdojo.autohaus.funktionen;

import java.util.Comparator;

import de.codingdojo.autohaus.model.Auto;

/**
 * Diese Klasse sortiert Autos nach dem Preis absteigend
 *
 */
public class Autovergleich implements Comparator<Auto>{

	@Override
	public int compare(Auto auto1, Auto auto2) {
		if (auto1.getPreisEur() < auto2.getPreisEur()) {
			return 1;
		} else if (auto1.getPreisEur() > auto2.getPreisEur()) {
			return -1;
		} else {
			return 0;
		}
	}

}
