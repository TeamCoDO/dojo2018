package de.codingdojo.palindrom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PalindromTest {
	/*
	 * Evaluierung : Klein- und Großschreibung wird hierbei vernachlässigt, d.h. 'A' == 'a', 'B' == 'b', usw.
	 * Eingabe: Lagerregal, Legovogel, Rentner, Renner, sereneres, Summus   	Ausgabe: Palindrom
	 * Eingabe: Wasserfall  Ausgabe: Kein Palindrom
	 * Eingabe: Anni roch Corinna. Palindrom
	 * Test1 Evaluierung 'A' == 'A' gleich, 'A'!= 'B' ungleich, 'A' und 'a'
	 * Test2 Evaluierung 'Ana' == 'Ana' Palindrom, 'AAna'!= 'Ana' kein Palindrom
	 * Test3 Stringbehandlung Leerzeichen, Satzzeichen
	 */
	
	Palindrom palindrom;

	@Before
	public void setUp() throws Exception {
		palindrom=new Palindrom();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void zeichenVergleichenA() {
		assertTrue( palindrom.zeichenGleich('A', 'A'));
	}
	
	@Test
	public void zeichenVergleichenAB() {
		assertFalse( palindrom.zeichenGleich('A', 'B'));
	}
	@Test
	public void zeichenVergleichenAa() {
		assertTrue( palindrom.zeichenGleich('A', 'a'));
	}
	
	@Test
	public void isPalindromAna() {
		assertTrue( palindrom.isWortPalindrom("Ana"));
	}
	@Test
	public void isPalindromAAna() {
		assertFalse( palindrom.isWortPalindrom("AAna"));
	}
	@Test
	public void isPalindromWasserfall() {
		assertFalse( palindrom.isWortPalindrom("Wasserfall"));
	}
	@Test
	public void isPalindromLeerString() {
		assertFalse( palindrom.isWortPalindrom(""));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void isPalindromNullString() {
		palindrom.isWortPalindrom(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void isSatzPalindromNullString() {
		palindrom.isSatzPalindrom(null);
	}
	
	@Test
	public void leerZeichenEntfernen() {
		assertEquals( "kafhkasdlasdhlash", palindrom.zeichenfolgeBereinigen("kafhkasd lasdhlash"));
	}
	
	@Test
	public void satzZeichenEntfernen() {
		assertEquals( "kafhkasdlasdhlash", palindrom.zeichenfolgeBereinigen("kafhkasd, lasdhlash"));
	}
	
	@Test
	public void isSatzPalindromTrue() {
		assertTrue( palindrom.isSatzPalindrom("Anni roch Corinna"));
	}
	
	@Test
	public void isSatzPalindromFalse() {
		assertFalse( palindrom.isSatzPalindrom("kafhkasd, lasdhlash"));
	}

}
