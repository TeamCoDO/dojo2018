package de.codingdojo.tresor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratorTest {

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



	
	//MethodName_StateUnderTest_ExpectedBehavior: isAdult_AgeLessThan18_False

	//Es wird geprueft, ob der Tresor Code 4 Stellig ist
	@Test
	public void getCode_4array_sizeEquals() {
		int testCode[]={0, 0, 0, 0};
		assertEquals(testCode.length, new Generator().getCode().length);
	}
	
	//Es wird geprueft, ob TresorCode NICHT groesser als 4 stellig ist
	@Test
	public void getCode_6array_sizeNotEquals(){
		int testCode[]={0, 0, 0, 0, 0, 0}; 
		assertNotEquals(testCode.length, new Generator().getCode().length);
	}
	
	
	//es wird gripft ob generierte Zaheln zwischen 0 und 9 sind
	@Test
	public void getCode_number0to9_True(){
		int testCode[]=new Generator().getCode();
		assertTrue(testCode[0] < 10);
		assertTrue(testCode[1] < 10);
		assertTrue(testCode[2] < 10);
		assertTrue(testCode[3] < 10);
	}
	
	//es wird gripft ob generierte Zaheln zwischen 0 und 9 sind
	@Test
	public void getCode_number0to9_True2(){
		int testCode[]=new Generator().getCode();
		assertTrue(testCode[0] > -1);
		assertTrue(testCode[1] > -1);
		assertTrue(testCode[2] > -1);
		assertTrue(testCode[3] > -1);
	}
	
	

}
