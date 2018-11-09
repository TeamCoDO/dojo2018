package de.codingdojo.filtern;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.codingdojo.gruppieren.PersonMUC;
import de.codingdojo.gruppieren.PersonPlus;

public class PersonTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

    
	
	/**test Person Konstruktor Plus
	 * 
	 */
	public void testPersonPlus(){
		
		PersonPlus p = new PersonPlus ("Peter Meier, 2012");
		assertEquals(2012, p.getJahr());
		assertEquals("Peter Meier",  p.getName());
	}
	
	/**test Person Konstruktor MUC
	 * 
	 */
	public void testPersonMUC(){
		
		PersonMUC p = new PersonMUC ("Peter Meier, 2012");
		assertEquals(2012, p.getYear());
		assertEquals("Peter Meier",  p.getName());
	}
}