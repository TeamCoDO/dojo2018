/**
 * 
 */
package de.codingdojo.autohaus;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 */
public class AutoTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	private Auto a,b;


	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a = new Auto("Ford", 125000, 7999.99, "silber metallic", false, "Diesel", 101.0);
		b = new Auto("Opel", 55000, 4999.99, "rot", true, "Benzin", 170.0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertNotNull(a);
	}

	/**
	 * Das Auto wird in setUp() erzeugt und der Test testet den Constructor, nicht die set()-Methode.
	 */
	@Test
	public void testGetHerstellerViaConstructor() {
		String hersteller = a.getHersteller();
		assertEquals("Ford", hersteller);
	}

	/**
	 * Das Auto wird in setUp() erzeugt und der Test testet den Constructor, nicht die set()-Methode.
	 */
	@Test
	public void testGetLaufleistungViaConstructor() {
		long laufleistung = a.getLaufleistung();
		assertEquals(125000, laufleistung);
	}

	/**
	 * Das Auto wird in setUp() erzeugt und der Test testet den Constructor, nicht die set()-Methode.
	 */
	@Test
	public void testGetPreisViaConstructor() {
		double preis = a.getPreis();
		assertEquals(7999.99, preis,0);
	}

	/**
	 * Das Auto wird in setUp() erzeugt und der Test testet den Constructor, nicht die set()-Methode.
	 */
	@Test
	public void testGetFarbeViaConstructor() {
		String farbe = a.getFarbe();
		assertEquals("silber metallic", farbe);
	}

	/**
	 * Das Auto wird in setUp() erzeugt und der Test testet den Constructor, nicht die set()-Methode.
	 */
	@Test
	public void testIsUnfallwagenViaConstructorFalse() {
		boolean unfallwagen = a.isUnfallwagen();
		assertEquals(false, unfallwagen);
	}
	/**
	 * Das Auto wird in setUp() erzeugt und der Test testet den Constructor, nicht die set()-Methode.
	 */
	@Test
	public void testIsUnfallwagenViaConstructorTrue() {
		boolean unfallwagen = b.isUnfallwagen();
		assertEquals(true, unfallwagen);
	}

	@Test
	public void testIsUnfallwagenViaSetMethodeTrue() {
		a.setUnfallwagen(true);
		boolean unfallwagen = a.isUnfallwagen();
		assertEquals(true, unfallwagen);
	}

	@Test
	public void testIsUnfallwagenViaSetMethodeFalse() {
		b.setUnfallwagen(false);
		boolean unfallwagen = b.isUnfallwagen();
		assertEquals(false, unfallwagen);
	}

	/**
	 * Das Auto wird in setUp() erzeugt und der Test testet den Constructor, nicht die set()-Methode.
	 */
	@Test
	public void testGetKraftstoffViaConstructor() {
		String kraftstoff= a.getKraftstoff();
		assertEquals("Diesel", kraftstoff);
	}

	/**
	 * Das Auto wird in setUp() erzeugt und der Test testet den Constructor, nicht die set()-Methode.
	 */
	@Test
	public void testGetLeistungViaConstructor() {
		double leistung= a.getLeistung();
		assertEquals(101.0, leistung,0);
	}

	/**
	 * Das Auto wird in setUp() erzeugt und der Test testet den Constructor, nicht die set()-Methode.
	 */
	@Test
	public void testToString() {
		String text = a.toString();
		assertEquals("---\nHersteller: Ford\nPreis: 7999.99 EUR\nMotor: 101.0 PS (Diesel)\nKM-Stand: 125000 km\nFarbe: silber metallic\nunfallfrei\n---", text);
	}

}
