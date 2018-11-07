package de.codingdojo.stadt;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StadtAuswerterTest {
	
	private Stadt stadt;
	private StadtAuswerter stadtAuswerter;

	@Before
	public void setUp() throws Exception {
		stadt=new Stadt();
		stadtAuswerter=new StadtAuswerter();
		
	}

	/**
	 * Prüfung, ob die Stadt den anforderungen von einer Hauptstadt entsprechen
	 * Steuereinnahmen sind null, Stadt ist leer
	 */
	@Test
	public void istStadtHauptstadtSteuerEinnahmenNullTest() {
		stadt.setAnzahlEinwohner(0);
		stadt.setSteuernProEinwohner(0);
		Assert.assertEquals(false, stadtAuswerter.istStadtHauptstadt(stadt));
	}
	

	/**
	 * Prüfung, ob die Stadt den anforderungen von einer Hauptstadt entsprechen
	 * Steuereinnahmen sind 2000000000, Stadt ist leer
	 */
	@Test
	public void istStadtHauptstadtSteuerEinnahmenOKTest() {
		stadt.setAnzahlEinwohner(0);
		stadt.setSteuernProEinwohner(2000000000);
		Assert.assertEquals(false, stadtAuswerter.istStadtHauptstadt(stadt));
	}
	
	/**
	 * Prüfung, ob die Stadt den anforderungen von einer Hauptstadt entsprechen
	 * Steuereinnahmen sind 2000000000, Stadt ist voll
	 */
	@Test
	public void istStadtHauptstadtSteuerEinnahmenAnzahlOKTest() {
		stadt.setAnzahlEinwohner(1000000);
		stadt.setSteuernProEinwohner(2000000000);
		Assert.assertEquals(true, stadtAuswerter.istStadtHauptstadt(stadt));
	}
	
	/**
	 * Prüfung, ob die Stadt den anforderungen von einer Hauptstadt entsprechen
	 * Steuereinnahmen sind 0, Stadt ist Hauptstadt
	 */
	@Test
	public void istStadtHauptstadtSteuerEinnahmenNullHauptstadtTest() {
		stadt.setIstHauptstadt(true);
		stadt.setSteuernProEinwohner(0);
		Assert.assertEquals(false, stadtAuswerter.istStadtHauptstadt(stadt));
	}
	
	/**
	 * Prüfung, ob die Stadt den anforderungen von einer Hauptstadt entsprechen
	 * Stadt ist voll, Stadt ist Hauptstadt
	 */
	@Test
	public void istStadtHauptstadtSteuerEinnahmenOKHauptstadtTest() {
		stadt.setIstHauptstadt(true);
		stadt.setAnzahlEinwohner(1000000);
		Assert.assertEquals(true, stadtAuswerter.istStadtHauptstadt(stadt));
	}
	
	/**
	 * Prüfung, ob die Steuereinnahmen entsprechen der Hauptstadt 
	 */
	@Test
	public void steuerEnnahmenCheckTest() {
		Assert.assertEquals(false, stadtAuswerter.steuerEnnahmenCheck(stadt));
	}
	
	/**
	 * Berechnen die Steuereinnahmen pro Stadt
	 */
	@Test
	public void steuerEnnahmenproEinwohnerTest() {
		stadt.setAnzahlEinwohner(10);
		stadt.setSteuernProEinwohner(10.00);
		Assert.assertEquals(100.00, stadtAuswerter.steuerEinnahmen(stadt), 0.0);
	}
	

}
