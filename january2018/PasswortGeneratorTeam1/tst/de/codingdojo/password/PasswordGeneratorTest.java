package de.codingdojo.password;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Testklasse für Dojo 16.01.2018 für die Klasse PasswordGenerator
 *
 */
public class PasswordGeneratorTest {
	
	private PasswordGenerator passwortGen; 

	/**
	 * Setup für Tests. 
	 * Initialisierung der Haupttestklasse PasswordGenerator.
	 */
	@Before
	public void setup() {
		passwortGen = new PasswordGenerator();
	}

	/**
	 * Testet die Methode splitSatz mit einem Wort
	 */
	@Test
	public void testSplit1Wort() {
		assertEquals(1, passwortGen.splitSatz("Mein").length);
	}

	/**
	 * Testet die Methode splitSatz auf Ergebnis not null
	 */
	@Test
	public void testSplitNotNull() {
		assertNotNull(passwortGen.splitSatz(null));
	}

	/**
	 * Testet die Methode splitSatz auf Ergebnis 0 mit Eingabe null
	 */
	@Test
	public void testSplitNull() {
		assertEquals(0, passwortGen.splitSatz(null).length);
	}
	
	/**
	 * Testet die Methode splitSatz mit 2 Wörtern
	 */
	@Test
	public void testSplit2Woerter() {
		assertEquals(2, passwortGen.splitSatz("Mein Fahrrad").length);
	}
	

	/**
	 * Testet die Methode splitSatz mit 0 Wörtern
	 */
	@Test
	public void testSplit0Woerter() {
		assertEquals(1, passwortGen.splitSatz("").length);
	}


	/**
	 * Testet die Methode kummuliereAnfangsbuchstaben mit 1 Wort
	 */
	@Test
	public void testKummuliereAnfangsbuchstaben() {		
		String[] zeichenfolge = new String []{"Mein"};
		assertEquals("M", passwortGen.kummuliereAnfangsbuchstaben(zeichenfolge));
	}
	

	/**
	 * Testet die Methode kummuliereAnfangsbuchstaben mit 1 Wort
	 */
	@Test
	public void testAnfangsbuchstabeWort() {		
		String wort = "Mein";
		assertEquals("M", passwortGen.anfangsbuchstabeWort(wort));
	}
	
	/**
	 * Testet die Methode kummuliereAnfangsbuchstaben null
	 */
	@Test
	public void testAnfangsbuchstabeWortNull() {		
		assertEquals("", passwortGen.anfangsbuchstabeWort(null));
	}

	/**
	 * Testet die Methode kummuliereAnfangsbuchstaben mit Array.Length = 0
	 */
	@Test
	public void testAnfangsbuchstabeWortLength0() {		
		assertEquals("", passwortGen.anfangsbuchstabeWort(""));
	}
	

	/**
	 * Testet die Methode pwdgen mit 1 Wort
	 */
	@Test
	public void testPwdgen() {		
		String zeichenfolge = "Mein";
		assertEquals("M1", passwortGen.pwdgen(zeichenfolge));
	}
	
	/**
	 * Testet die Methode pwdgen mit Satz laut Vorgabe
	 */
	@Test
	public void testPwdgenFahrrad() {		
		String zeichenfolge = "Mein Fahrrad fährt Tango.";
		assertEquals("MFfT4", passwortGen.pwdgen(zeichenfolge));
	}	

	/**
	 * Testet die Methode pwdgen mit Satz laut Vorgabe
	 */
	@Test
	public void testPwdgenPasswort() {		
		String zeichenfolge = "Ein Passwort ist nur so gut , wie sein geheimer Platz .";
		assertEquals("EPinsg,wsgP.12", passwortGen.pwdgen(zeichenfolge));
	}
	
	/**
	 * Testet die Methode pwdgen mit Satz laut Vorgabe
	 */
	@Test
	public void testPwdgenPasswortSatzzeichen() {		
		String zeichenfolge = "Ein Passwort ist nur so gut, wie sein geheimer Platz.";
		assertEquals("EPinsgwsgP10", passwortGen.pwdgen(zeichenfolge));
	}
	

	/**
	 * Testet die Methode pwdgen mit Satz laut Vorgabe
	 */
	@Test
	public void testPwdgenProgrammieren() {		
		String zeichenfolge = "Selber programmieren ist überraschend !";
		assertEquals("Spiü!5", passwortGen.pwdgen(zeichenfolge));
	}	

	/**
	 * Testet die Methode pwdgen mit Satz laut Vorgabe
	 */
	@Test
	public void testPwdgenRegen() {		
		String zeichenfolge = "Wenn es regnet, dann wird es nass .";
		assertEquals("Werdwen.8", passwortGen.pwdgen(zeichenfolge));
	}
	

	/**
	 * Testet die Methode pwdgen mit Satz laut Vorgabe
	 */
	@Test
	public void testPwdgenFinal() {		
		String zeichenfolge = "Kombinieren Sie das Passwort mit einer Webseite !";
		assertEquals("KSdPmeW!8", passwortGen.pwdgen(zeichenfolge));
	}
	
	/**
	 * Testet die Methode pwdgen mit 1 Wort
	 */
	@Test
	public void testPwdgenEmpty() {		
		String zeichenfolge = "";
		assertEquals("", passwortGen.pwdgen(zeichenfolge));
	}
	
	/**
	 * Testet die Methode pwdgen mit 1 Wort
	 */
	@Test
	public void testPwdgenBlanks() {		
		String zeichenfolge = "Wenn es   regnet, dann wird es nass .";
		assertEquals("Werdwen.8", passwortGen.pwdgen(zeichenfolge));
	}
	
}
