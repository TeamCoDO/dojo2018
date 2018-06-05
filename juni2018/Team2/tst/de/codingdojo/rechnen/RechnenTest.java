/**
 * 
 */
package de.codingdojo.rechnen;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**

 *
 */
public class RechnenTest {

	private static Rechnen rechnen;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		rechnen = new Rechnen();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

//	@Test 
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	/**
	 * Prüfung, ob Zahl eingegeben wurde 
	 */
	@Test 
	public void zahlEingabeTest() {
		
		assertEquals(true, rechnen.istZahl(5));
		
		
	}
	
	/**
	 * Prüfung Rechenarten
	 */
	@Test 
	public void rechenartenTest() {
		
		assertEquals(true, rechnen.pruefeRechenart("++"));
		assertEquals(true, rechnen.pruefeRechenart("--"));
		assertEquals(true, rechnen.pruefeRechenart("+-"));
		assertEquals(true, rechnen.pruefeRechenart("-+"));
		
	}
	
	/**
	 * Prüfung Zahlenraum
	 */
	@Test 
	public void zahlenraumTest() {
		
		assertEquals(true, rechnen.pruefeZahlenraum(3,100));
		
	}
	
	/**
	 * Prüfung Zahlenraum
	 */
	@Test 
	public void ergebnisTest() {
		
		assertEquals(true, rechnen.pruefeErgebnis(2));
		
	}
	

}
