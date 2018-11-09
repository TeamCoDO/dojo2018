package de.coding.dojo.personenabgleich;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import de.coding.dojo.personenabgleich.Testdaten;

public class Personenabgleich {
	Map<Integer, Set<String>>  nameZumJahr;
	
	public static void main(String[] args){
		Personenabgleich personenabgleich = new Personenabgleich();
		personenabgleich.einlesenDaten(Testdaten.plusDaten, Testdaten.mucDaten);
		personenabgleich.ausgebenNamenZumJahr();
		personenabgleich.ausgebenJahreZumNamen();
	}

	/**
	 * Einlesen der Eingabebestände
	 * @param ospDaten
	 * @param mucDaten
	 */
	public void einlesenDaten(String[] ospDaten, String[] mucDaten) {
		nameZumJahr  = new TreeMap<>();
		
		for (String s : ospDaten){
			einlesenNameZumJahr(s);
			einlesenJahreZumNamen(s);
		}
		
		for (String s : mucDaten){
			einlesenNameZumJahr(s);
			einlesenJahreZumNamen(s);
		}
	}

	private void einlesenJahreZumNamen(String s) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Split des Eingabesatzes auf Name und Jahr und befüllen  Hashtable nameZumJahr
	 * 
	 * @param eingabesatz
	 */
	private void einlesenNameZumJahr(String eingabesatz) {
		Integer jahr = getJahrFromString(eingabesatz);
		String name = getNameFromString(eingabesatz);
		Set<String> setNamen = nameZumJahr.get(jahr); 
		if (setNamen == null) {
			// jahr noch nicht vorhanden
			setNamen = new HashSet<>();
			setNamen.add(name);
			nameZumJahr.put(jahr, setNamen);
		} else {
			setNamen.add(name);
		}
	}
	
	/**
	 * Ermitteln Name aus Eingabesatz
	 * @param eingabesatz
	 * @return
	 */
	private String getNameFromString(String eingabesatz) {
		String[] teile = eingabesatz.split(",");
		String name = teile[0];
		return name;
	}

	/**
	 * Ermitteln Jahr aus Eingabesatz
	 * @param eingabesatz
	 * @return
	 */
	private Integer getJahrFromString(String eingabesatz) {
	
		String[] teile = eingabesatz.split(",");
		String jahreszahl = teile[1];
		Integer jahr = Integer.valueOf(jahreszahl.trim());
		return jahr;
	}

	/**
	 * Ausgabe der Namen zum Jahr, nach Jahreszahl sortiert 
	 */
	public void ausgebenNamenZumJahr() {
		System.out.println("Gruppieren der Namen zum Jahr:");
		for (Integer jahr : nameZumJahr.keySet()) {
			Set<String> namen = liesNamenZumJahr(jahr);
			System.out.print(jahr + ": ");
			for (String name : namen) {
				System.out.print(name + ",");
			}
			System.out.println();
		}
	}

	/**
	 * Ausgabe der Jahre zum Namen 
	 */
	public void ausgebenJahreZumNamen() {
		System.out.println("Dublikat mit Jahr:");
		// TODO
	}
	
	/**
	 * Rückgabe Namen zum Jahr
	 * @param jahr
	 * @return
	 */
	public Set<String> liesNamenZumJahr(int jahr) {
		Set<String> setNamen = nameZumJahr.get(jahr);
		if (setNamen == null){
			setNamen = new HashSet<>();
		}
		return setNamen;
	}

}
