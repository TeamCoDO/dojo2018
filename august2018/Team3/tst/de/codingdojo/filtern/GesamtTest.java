
package de.codingdojo.filtern;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.codingdojo.gruppieren.PersonMUC;
import de.codingdojo.gruppieren.PersonPlus;



public class GesamtTest {

    private static String peterMeier1 = "Peter Meier, 2012, 872634, 123, MA, N";
    private static String laraMiller = "Lara Miller, 2015, 861334, 123, MA, J" ;
    private static String peterMeier2 = "Peter Meier, 2015, 872634, 123, MA, N"; 
    private static String tatjanaFrank = "Tatjana Frank, 2013, 872634, 123, MA, N";  
    private static String dannyMende = "Danny Mende, 2012, 872634, 123, MA, N";  
    private static String kathrinStorm = "Kathrin Storm, 2013, 872634, 123, MA, N";  

	@Before
	public void setUpBeforeClass() throws Exception {
		ArrayList<String> eingabe = new ArrayList<>();
		eingabe.add(peterMeier1);
		eingabe.add(laraMiller);
		eingabe.add(peterMeier2);
		eingabe.add(tatjanaFrank);
		eingabe.add(dannyMende);
		eingabe.add(kathrinStorm);
	}

	@After
	public void tearDown() throws Exception {
	}


    
	
	/**test Person Konstruktor Plus
	 * 
	 */
	@Test
	public void testPersonPlus(){
		
		PersonPlus p = new PersonPlus ("Peter Meier, 2012");
		assertEquals(2012, p.getJahr());
		assertEquals("Peter Meier",  p.getName());
	}
	
	/**test Person Konstruktor MUC
	 * 
	 */
	@Test
	public void testPersonMUC(){
		
		PersonMUC p = new PersonMUC ("Peter Meier, 2012");
		assertEquals(2012, p.getYear());
		assertEquals("Peter Meier",  p.getName());
	}
}