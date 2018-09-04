/**
 * 
 */
package de.condingdojo.sekunden;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.codingdojo.sekunden.Ergebnis;
import de.codingdojo.sekunden.Rechner;

/**
 *
 */
public class TestSekunden {
	
	private Rechner rechner;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() {
		 rechner =new Rechner();
	}

	@Test
	public void testBerechneEinJahr() {
		assertEquals(1, rechner.berechneJahre(31536000));
	}
	
	@Test
	public void testBerechneJahrMitRest() {
		rechner.berechneJahre(31536001);
		assertEquals(1, rechner.getRest());
	}
	
	@Test
	public void testBerechneEinTag() {
		assertEquals(1, rechner.berechneTage(86400));
	}
	
	@Test
	public void testBerechneTageMitRest() {
		rechner.berechneTage(86401);
		assertEquals(1, rechner.getRest());
	}
	
	@Test
	public void testBerechneEineStunde() {
		assertEquals(1, rechner.berechneStunden(3600));
	}
	
	@Test
	public void testBerechneStundenMitRest() {
		rechner.berechneStunden(3601);
		assertEquals(1, rechner.getRest());
	}
	@Test
	public void testBerechneEineMinute() {
		assertEquals(1, rechner.berechneMinuten(60));
	}
	
	@Test
	public void testBerechneMinutenMitRest() {
		rechner.berechneMinuten(61);
		assertEquals(1, rechner.getRest());
	}
	
	@Test
	public void testBerechneGrosseZahl() {
		assertNotNull(rechner.berechneEingabe(65465));
	}
	
	@Test
	public void testBerechneGrosseZahlJahre() {
		Ergebnis ergebnis =rechner.berechneEingabe(158036522);
		assertEquals(5, ergebnis.getJahre());
	}
	
	@Test
	public void testBerechneGrosseZahlTage() {
		Ergebnis ergebnis =rechner.berechneEingabe(158036522);
		assertEquals(4, ergebnis.getTage());
	}
	@Test
	public void testBerechneGrosseZahlStunden() {
		Ergebnis ergebnis =rechner.berechneEingabe(158036522);
		assertEquals(3, ergebnis.getStunden());
	}
	
	@Test
	public void testBerechneGrosseZahlMinuten() {
		Ergebnis ergebnis =rechner.berechneEingabe(158036522);
		assertEquals(2, ergebnis.getMinuten());
	}
	
	@Test
	public void testBerechneGrosseZahlSekunden() {
		Ergebnis ergebnis =rechner.berechneEingabe(158036522);
		assertEquals(2, ergebnis.getSekunden());
	}
	

}
