package de.codingdojo.dojo201809.aufgabe2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SekundenRechnerTest {
	
	private SekundenRechner mySekundenRechner = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		mySekundenRechner = new SekundenRechner();
	}

	@After
	public void tearDown() throws Exception {
		mySekundenRechner = null;
	}

	@Test
	public void testZerlegung() {
		ZeitContainer myContainer = mySekundenRechner.zerlegeSekunden(158036522);
		Assert.assertNotNull(myContainer);
		Assert.assertTrue(5 == myContainer.getJahre());
		Assert.assertTrue(4 == myContainer.getTage());
		Assert.assertTrue(3 == myContainer.getStunden());
		Assert.assertTrue(2 == myContainer.getMinuten());
		Assert.assertTrue(2 == myContainer.getSekunden());
	}

	@Test
	public void testZerlegung1Sekunde() {
		ZeitContainer myContainer = mySekundenRechner.zerlegeSekunden(1);
		Assert.assertNotNull(myContainer);
		Assert.assertTrue(0 == myContainer.getJahre());
		Assert.assertTrue(0 == myContainer.getTage());
		Assert.assertTrue(0 == myContainer.getStunden());
		Assert.assertTrue(0 == myContainer.getMinuten());
		Assert.assertTrue(1 == myContainer.getSekunden());
	}

	@Test
	public void testZerlegung0Sekunden() {
		ZeitContainer myContainer = mySekundenRechner.zerlegeSekunden(0);
		Assert.assertNotNull(myContainer);
		Assert.assertTrue(0 == myContainer.getJahre());
		Assert.assertTrue(0 == myContainer.getTage());
		Assert.assertTrue(0 == myContainer.getStunden());
		Assert.assertTrue(0 == myContainer.getMinuten());
		Assert.assertTrue(0 == myContainer.getSekunden());
	}

	@Test
	public void testNegativeSekunden() {
		try {
			ZeitContainer myContainer = mySekundenRechner.zerlegeSekunden(-20);
			Assert.fail("Keine Exception trotz negativem Wert!");
		} catch (IllegalArgumentException e) {
			// Gutfall!
		} catch (Exception e) {
			// Fehler!
			Assert.fail("Unerwartete Exception " + e);
		}
		
	}
	
}
