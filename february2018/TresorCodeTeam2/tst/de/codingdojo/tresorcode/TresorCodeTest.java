/**
 * 
 */
package de.codingdojo.tresorcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author 
 *
 */
public class TresorCodeTest {
	TresorCode tc;

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

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link de.codingdojo.tresorcode.TresorCode#versucheZiffer(int)}.
	 */
	@Test
	public void testVersucheZifferGROESSER() {
		//fail("Not yet implemented");
		tc = new TresorCode(new int[]{1,2,3,4}, 3);
		assertEquals(VergleichErgebnis.GROESSER, tc.versucheZiffer(5));
	}

	@Test
	public void testVersucheZifferGLEICH() {
		//fail("Not yet implemented");
		tc = new TresorCode(new int[]{1,2,3,4}, 3);
		assertEquals(VergleichErgebnis.GLEICH, tc.versucheZiffer(1));
	}
	
	@Test
	public void testVersucheZifferKLEINER() {
		//fail("Not yet implemented");
		tc = new TresorCode(new int[]{1,2,3,4}, 3);
		assertEquals(VergleichErgebnis.KLEINER, tc.versucheZiffer(0));
	}

	/**
	 * Test method for {@link de.codingdojo.tresorcode.TresorCode#getAnzahlRestversuche()}.
	 */
	@Test
	public void testGetAnzahlRestversuche() {
		//fail("Not yet implemented");
		
		tc = new TresorCode(new int[]{1,2,3,4}, 3);
		
		// vor dem ersten Versuch
		assertEquals(3, tc.getAnzahlRestversuche());
		
		// der erste Versuch
		tc.versucheZiffer(2);
		
		// nach dem ersten Versuch
		assertEquals(2, tc.getAnzahlRestversuche());
	}

}
