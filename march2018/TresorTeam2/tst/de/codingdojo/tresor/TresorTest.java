package de.codingdojo.tresor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TresorTest {

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


	
	//printResult
	//tresorInit tresor.getCode
	//
	//tresor.codeCrack
	//tresorInput
	
	//MethodName_StateUnderTest_ExpectedBehavior: isAdult_AgeLessThan18_False
	@Test
	public void tresorInit_code_notNull(){
		Tresor tresor=new Tresor();
		tresor.init();
		assertNotNull(tresor.getCode());
	}
	
	@Test
	public void tresorInit_code_4Stellig(){
		Tresor tresor=new Tresor();
		tresor.init();
		assertEquals(4, tresor.getCode().length);
	}
	
	/**
	 * 
	 */
	@Test
	public void tresorCodeCrack_code_True(){
		Tresor tresor=new Tresor();
		tresor.setCode(new int[] {1,2,3,4});
		tresor.setAnzahlVersucheProZiffer(4);
		assertEquals(-1, tresor.knack(-1));
		assertEquals(1, tresor.knack(2));
		assertEquals(0, tresor.knack(1));
		assertEquals(0, tresor.knack(2));
		assertEquals(0, tresor.knack(3));
		assertEquals(0, tresor.knack(4));
	}
	
	//beim initialisieren wie viele Stellen für code 
	//wie viele Versuche er hat
	@Test
	public void tresorCode_MaximaleVersuche_vier(){
		Tresor tresor=new Tresor();
		tresor.setCode(new int[] {1,2,3,4});
		tresor.setAnzahlVersucheProZiffer(4);
		assertEquals(4, tresor.getRestversuche());
		assertEquals(-1, tresor.knack(-1));
		assertEquals(3, tresor.getRestversuche());
	}
	
	//wie meldet tresor dass kein versuch mehr gibt
	//was macht er wenn aus ist
	@Test
	public void tresorCode_MaximaleVersuche_verbraucht(){
		Tresor tresor=new Tresor();
		tresor.setCode(new int[] {1,2,3,4});
		tresor.setAnzahlVersucheProZiffer(4);
		assertEquals(4, tresor.getRestversuche());
		assertEquals(-1, tresor.knack(-1));
		assertEquals(3, tresor.getRestversuche());
		assertEquals(-1, tresor.knack(-1));
		assertEquals(2, tresor.getRestversuche());
		assertEquals(-1, tresor.knack(-1));
		assertEquals(1, tresor.getRestversuche());
		assertEquals(-1, tresor.knack(-1));
		assertEquals(0, tresor.getRestversuche());
	}
	
	
	/**
	 * Zweite Ziffer: Neue Anzahl Versuche
	 */
	@Test
	public void tresorCode_MaximaleVersuche_ZweiteZiffer(){
		Tresor tresor=new Tresor();
		tresor.setCode(new int[] {1,2,3,4});
		tresor.setAnzahlVersucheProZiffer(4);
		assertEquals(4, tresor.getRestversuche());
		assertEquals(-1, tresor.knack(-1));
		assertEquals(3, tresor.getRestversuche());
		assertEquals(0, tresor.knack(1));
		assertEquals(4, tresor.getRestversuche());
	}
	
	/**
	 * Zweite Ziffer: Neue Anzahl Versuche: 3
	 */
	@Test
	public void tresorCode_MaximaleVersuche3_ZweiteZiffer(){
		Tresor tresor=new Tresor();
		tresor.setCode(new int[] {1,2,3,4});
		tresor.setAnzahlVersucheProZiffer(3);
		assertEquals(3, tresor.getRestversuche());
		assertEquals(-1, tresor.knack(-1));
		assertEquals(2, tresor.getRestversuche());
		assertEquals(0, tresor.knack(1));
		assertEquals(3, tresor.getRestversuche());
	}
	
	@Test
	public void tresorCode_MaximaleVersuche_Exception(){
		Tresor tresor=new Tresor();
		tresor.setCode(new int[] {1,2,3,4});
		tresor.setAnzahlVersucheProZiffer(2);
		assertEquals(2, tresor.getRestversuche());
		assertEquals(-1, tresor.knack(-1));
		assertEquals(-1, tresor.knack(-1));
		assertEquals(0, tresor.getRestversuche());

		// exception wird erwartet
		try {
			tresor.knack(-1);
			fail("Exception erwartet");
		} catch (Exception e) {
			// good!
		}
	}

}
