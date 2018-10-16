package de.codingdojo.gauss;

import static org.junit.Assert.*;

import org.junit.Test;

public class GaussAusgabenTest {

	@Test
	public void bildeSummeAusgabeTest() {
		String expected = "1 + 2 + 3 = 6";
		long eingabe = 3;
		
		assertEquals(expected, GaussAusgaben.bildeSummeAusgabe(eingabe));		
	}
	
	@Test
	public void berechneNachGaussAusgabeTest() {
		String expected = "3 * (3 + 1) / 2 = 6";
		long eingabe = 3;
		
		assertEquals(expected, GaussAusgaben.berechneNachGaussAusgabe(eingabe));		
	}

}
