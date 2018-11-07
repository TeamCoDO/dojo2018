package de.codingdojo.autohaus.start;

import java.util.Arrays;
import java.util.List;

import de.codingdojo.autohaus.funktionen.AutoStatistik;
import de.codingdojo.autohaus.funktionen.Autovergleich;
import de.codingdojo.autohaus.model.Auto;

public class Autoherstellung {
	public static void main(String[] args) {

		// Aufgabe 1: formatierte Ausgabe Autos
		Auto a1 = new Auto("Ford", 125000, 7999.99, "silber metallic", false, "Diesel", 101.0);
		Auto a2 = new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Super", 137.0);
		Auto a3 = new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true, "Benzin", 75.0);
		
		System.out.println("vorhandene Autos");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		// Aufgabe 2: Sortierung nach Preis
		System.out.println("==============================");
		System.out.println("Sortiert nach Preis absteigend");
		List<Auto> autos = Arrays.asList(a1, a2, a3);
		autos.sort(new Autovergleich());
		for (Auto auto : autos) {
			System.out.println(auto);
		}

		// Aufgabe 3: Statistik
		System.out.println("==============================");
		System.out.println("Statistik");
		AutoStatistik statistik = new AutoStatistik(autos);
		System.out.println("Erlös ohne Nachlass: " + statistik.berechneVerkaufserloes() + " EUR");
		System.out.println("Anteil an Unfallwagen: " + statistik.berechneAnteiligeUnfallwaegen() + " %");
	}
}
