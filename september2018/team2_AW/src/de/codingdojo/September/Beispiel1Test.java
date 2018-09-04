package de.codingdojo.September;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class Beispiel1Test {

	@Test 
	//1.Testfall - korrekte Rückgabe
	public void testString1() {
		Beispiel1 beisp = new Beispiel1("HelloWorld");
		assertEquals("HelloWorlddlroWolleH", beisp.getErgebnis());
		
	}
	
	@Test 
	//2.Testfall - fehlerhafte Ausgabe
	public void testString2() {
		Beispiel1 beisp1 = new Beispiel1("aber");
		//assertEquals("HelloWorldxxxxx",beisp1.getErgebnis());
		assertEquals("reba", beisp1.getErgebnis());
	}
}
