package de.codingdojo.stadt;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StadtEigenschaftenTest {
	
	private Stadt stadt;
	@Before
	public void setUp() throws Exception {
		stadt=new Stadt();
	}

	/**
	 * Hier wird gepüft ob die Stadt einen Namen hat
	 */
	@Test
	public void stadtNameTest() {
		stadt.setName("A");
		Assert.assertNotNull(stadt.getName());
	}
	
	/**
	 * Hier wird gepüft ob die Stadt nicht leer ist
	 */
	@Test
	public void stadtAnzahlEinwohnerTest() {
		stadt.setAnzahlEinwohner(1000);
		Assert.assertNotNull(stadt.getAnzahlEinwohner());
	}
	
	/**
	 * Hier wird gepüft ob die Stadt Steuer zahlt
	 */
	@Test
	public void stadtSteuernProEinwohnerTest() {
		stadt.setSteuernProEinwohner(1000);
		Assert.assertNotNull(stadt.getSteuernProEinwohner());
	}
	
	/**
	 * Hier wird gepüft ob die Stadt Steuer zahlt
	 */
	@Test
	public void stadtIstHauptstadtTest() {
		stadt.setIstHauptstadt(false);
		Assert.assertFalse(stadt.isIstHauptstadt());
	}

}
