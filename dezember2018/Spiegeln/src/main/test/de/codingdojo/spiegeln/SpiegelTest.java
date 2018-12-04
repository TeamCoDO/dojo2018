package de.codingdojo.spiegeln;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpiegelTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void testHello() {
		Spiegel spiegel = new Spiegel();
		String string = "Hello";
		String gnirts = null;
		try {
			gnirts = spiegel.spiegeln(string);
		} catch (SpiegelException e) {
			fail("Hier wird keine Exception erwartet!");
		}
		String expected = "olleH";
		String message = "";
		assertEquals(message, expected, gnirts);
	}

	@Test
	public void testHallo() {
		Spiegel spiegel = new Spiegel();
		String string = "Hallo";
		String gnirts = null;
		try {
			gnirts = spiegel.spiegeln(string);
		} catch (SpiegelException e) {
			fail("Hier wird keine Exception erwartet!");
		}
		String expected = "ollaH";
		String message = "";
		assertEquals(message, expected, gnirts);
	}

	@Test(expected = SpiegelException.class)
	public void testNull() throws SpiegelException {
		Spiegel spiegel = new Spiegel();
		String string = null;
		// Es wird hier erwartet, das eine Exception geworfen wird.
		String gnirts = spiegel.spiegeln(string);

		fail("Es sollte vorher eine Exception geworfen werden!");
	}

	@Test(expected = SpiegelException.class)
	public void testLeerstring() throws SpiegelException {
		Spiegel spiegel = new Spiegel();
		String string = "";
		// Es wird hier erwartet, das eine Exception geworfen wird.
		String gnirts = spiegel.spiegeln(string);

		fail("Es sollte vorher eine Exception geworfen werden!");
	}

}
