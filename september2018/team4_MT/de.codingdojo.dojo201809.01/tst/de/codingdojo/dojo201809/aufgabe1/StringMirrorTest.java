package de.codingdojo.dojo201809.aufgabe1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Testfälle für den fabelhaften StringMirror
 * 
 */
public class StringMirrorTest {
	
	private static StringMirror myTestMirror = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		myTestMirror = new StringMirror(true);  
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSpiegelungKorrekt() {
		Assert.assertEquals("Coding Dojo SpiegellegeipS ojoD gnidoC", myTestMirror.mirror("Coding Dojo Spiegel"));
	}
	
	@Test
	public void testSpiegelungNull() {
		Assert.assertNull(myTestMirror.mirror(null));
	}

	@Test
	public void testSpiegelungLeer() {
		Assert.assertEquals("", myTestMirror.mirror(""));
	}
	

	@Test
	public void testSpiegelungSingleChar() {
		Assert.assertEquals("CC", myTestMirror.mirror("C"));
	}

	@Test
	public void testSpiegelungKorrektMitApache() {
		Assert.assertEquals("Coding Dojo SpiegellegeipS ojoD gnidoC", new StringMirror(true).mirror("Coding Dojo Spiegel"));
	}
	
}
