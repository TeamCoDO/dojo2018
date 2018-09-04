package de.codingdojo.September;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class Beispiel2Test {

	@Test 
	//1.Testfall - korrekte Rückgabe
	public void testZeit1() {
		double dou = 1234455;
		Beispiel2 beisp = new Beispiel2(dou);
		assertEquals("1234", beisp.getJahr());
		
	}
	
	@Test 
	//2.Testfall - fehlerhafte Ausgabe
	public void testZeit2() {
		double dou1 = 1234455;
		Beispiel2 beisp1 = new Beispiel2(dou1);
		assertEquals("1234", beisp1.getJahr());
		
	}
}