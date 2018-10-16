package de.codingdojo.oktober;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import org.junit.Test;

import de.codingdojo.oktober.BeispielGauss;

public class BeispielGaussTest {

	private int ergebnisSumme;
	private int ergebnisFormel;
	
	@Test
	public void testSumme() {
		BeispielGauss beispielGauss = new BeispielGauss();
		try {
			ergebnisSumme = beispielGauss.berechneSumme("10");
			assertEquals(55, ergebnisSumme);
			System.out.println("Ergebnis - Summe: " + ergebnisSumme);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testFormel() {
		BeispielGauss beispielGauss = new BeispielGauss();
		try {
			ergebnisFormel = beispielGauss.berechneFormel("10");
			assertEquals(55, ergebnisFormel);
			System.out.println("Ergebnis - Formel: " + ergebnisFormel);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testVergleich() {
		try {
			assertEquals(ergebnisSumme, ergebnisFormel);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
