package de.coding.dojo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BuchstabenTest {
	
	Buchstaben buchstaben;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 buchstaben = new Buchstaben();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testZeichenketteNotLeer(){
		String zeichenKette="test";
		assertNotSame("",buchstaben.getZeichenkette(zeichenKette));
	}

	
	@Test(expected=Exception.class)
	public void testZeichenketteFehlermeldung(){
		String zeichenKette="";
		buchstaben.getZeichenkette(zeichenKette);
	}
	@Test
	public void testAnzahlBuchstaben(){
		String zeichenkette="test test";
		assertEquals(9, buchstaben.getGesamtlaenge(zeichenkette));
	}
	
	@Test
	public void testGetBuchstabeA(){
		String zeichenkette="sdfsdfa";
		assertEquals(1, buchstaben.getAnzahl(zeichenkette, 'a'));
	}
	
	@Test
	public void testGetBuchstabeE(){
		String zeichenkette="Effen quer";
		assertEquals(3, buchstaben.getAnzahl(zeichenkette, 'e'));
	}	


	@Test
	public void testGetScore(){

		String zeichenkette="Ein Zebra";
		String result = "11,1111";
		assertEquals(result, buchstaben.getScore(zeichenkette, 'a'));
	}
	
	
	
	

}
