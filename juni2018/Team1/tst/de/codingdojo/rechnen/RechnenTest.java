/**

 * 
 */
package de.codingdojo.rechnen;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**

 *
 */
public class RechnenTest {
	
	private Rechnen rechnen;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		rechnen=new Rechnen();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Prüfe ob das eine Zahl ist und kein String
	 * Wird von Framework erledigt
	 */
	@Test
	public void pruefeAufgabenZahlEingabeTest() {


	}
	
	/**
	 * Prüfung, ob Testzahl innerhalb des Zahlenraums
	 * Ggf Zahl anpassen!!
	 */
	@Test
	public void pruefeAufgabenZahlenrauumEingabeTest() {

		assertTrue(rechnen.pruefeZahlenraumEingabe(25)); 
		assertFalse(rechnen.pruefeZahlenraumEingabe(101)); 
	}
	
	/**
	 * Prüfung der Rechenart
	 */
	@Test
	public void pruefeAufgabenEingabeArtTest() {

		assertTrue(rechnen.pruefeAufgabenEingabeArt("++")); 
		assertFalse(rechnen.pruefeAufgabenEingabeArt("wegft"));
	}
	
	/**
	 * Prüfung der Rechenart
	 */
	@Test
	public void pruefeDifferenzGrenzen() {

		assertTrue(rechnen.pruefeAufgabenEingabeArt("++")); 
		assertFalse(rechnen.pruefeAufgabenEingabeArt("wegft"));
	}
	
	/**
	 * Prüfung der Grenzen ob Untergrenze kleiner als Obergrenze ist
	 */
	@Test
	public void pruefeGrenzenTest() {

		assertTrue(rechnen.pruefeGrenzen(20,30)); 
		assertFalse(rechnen.pruefeGrenzen(30,20));
	}
	
	/**
	 * Prüfung der Grenzen ob Untergrenze kleiner als Obergrenze ist
	 */
	@Test
	public void pruefeDifferenzGrenzenTest() {

		assertTrue(rechnen.pruefeDifferenzGrenzen(20,30,2)); 
		assertFalse(rechnen.pruefeDifferenzGrenzen(30,20,11));
	}
	
	/**
	 * Prüfung der Grenzen ob Untergrenze kleiner als Obergrenze ist
	 */
	@Test
	public void pruefeAufgabeTest() {

		assertTrue(rechnen.pruefeAufgabenergebnis(20,30,"++",10,100)); 
		assertTrue(rechnen.pruefeAufgabenergebnis(90,100,"--",10,20));
		
	}
	
}
