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
		assertEquals(-1, tresor.knack(-1));
		assertEquals(1, tresor.knack(2));
		assertEquals(0, tresor.knack(1));
		assertEquals(0, tresor.knack(2));
		assertEquals(0, tresor.knack(3));
		assertEquals(0, tresor.knack(4));
	}

}
