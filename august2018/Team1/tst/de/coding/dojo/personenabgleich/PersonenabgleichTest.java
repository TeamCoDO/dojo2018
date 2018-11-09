package de.coding.dojo.personenabgleich;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import de.coding.dojo.personenabgleich.Personenabgleich;

public class PersonenabgleichTest {

	@Test
	// positivTest mit zwei Namen zum Jahr 2015
	public void testLiesNamenZumJahrVorhanden() {
		
		Personenabgleich zuTestendeKlasse = new Personenabgleich();
		zuTestendeKlasse.einlesenDaten(Testdaten.plusDaten, Testdaten.mucDaten);
		
		Set<String> namezumJahr = zuTestendeKlasse.liesNamenZumJahr(2015);
		assertEquals(2, namezumJahr.size());
		
		boolean nameGefunden = false;
		for (String s : namezumJahr){
			if (s.equals("Lara Miller")) {
				nameGefunden = true;
			}
		}	
		assertEquals("Name kommt nicht vor", true, nameGefunden);
		
		
	}

	@Test
	// positivTest mit fehlerhaftem Namen zum Jahr 2015
	public void testLiesNamenZumJahrVorhandenNameFalsch() {
		
		Personenabgleich zuTestendeKlasse = new Personenabgleich();
		zuTestendeKlasse.einlesenDaten(Testdaten.plusDaten, Testdaten.mucDaten);
		
		Set<String> namezumJahr = zuTestendeKlasse.liesNamenZumJahr(2015);
		assertEquals(2, namezumJahr.size());
		
		boolean nameGefunden = false;
		for (String s : namezumJahr){
			if (s.equals("Lara Miler")) {
				nameGefunden = true;
			}
		}	
		assertEquals("Name kommt vor", false, nameGefunden);
		
		
	}

	@Test
	// negativTest ohne Namen zum Jahr 2018
	public void testLiesNamenZumJahrNichtVorhanden() {
		
		Personenabgleich zuTestendeKlasse = new Personenabgleich();
		zuTestendeKlasse.einlesenDaten(Testdaten.plusDaten, Testdaten.mucDaten);
		
		Set<String> namezumJahr = zuTestendeKlasse.liesNamenZumJahr(2018);
		assertEquals(0, namezumJahr.size());
	}
}
