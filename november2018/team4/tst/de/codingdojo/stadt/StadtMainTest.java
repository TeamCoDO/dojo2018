package de.codingdojo.stadt;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StadtMainTest {

	
	/**
	 * StadtMain prüft die Eingabe
	 */
	@Test
	public void eingabeHauptstadtFalseTest() {
		StadtMain stadtMain=new StadtMain();
		Assert.assertFalse(stadtMain.isHauptstadt("false"));
	}
	
	/**
	 * StadtMain prüft die Eingabe
	 */
	@Test
	public void eingabeHauptstadtNOKTest() {
		StadtMain stadtMain=new StadtMain();
		Assert.assertFalse(stadtMain.isHauptstadt("sldfhsdfh"));
	}
	
	/**
	 * StadtMain prüft die Eingabe
	 */
	@Test
	public void eingabeHauptstadtJaTest() {
		StadtMain stadtMain=new StadtMain();
		Assert.assertTrue(stadtMain.isHauptstadt("ja"));
	}

}
