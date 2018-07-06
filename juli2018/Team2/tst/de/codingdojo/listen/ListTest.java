package de.codingdojo.listen;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ListTest {
	Person person;
	

	@After
	public void tearDown() throws Exception {
	}
	@Before
	public void setUp() throws Exception {
		person  = new Person();
	}
	
	@Test
	public void getMaxJahr() {
		
		String [] arrayExcel = null;
		
		String [] array = {"Peter Meier",
						   "Lara Miller",
						   "Lara Miller",
						   "Lara Miller",
						   "Tatjana Frank"};
		
		String [] arrayJahr = {"2014",
						   "2013",
						   "2014",
						   "2015",
						   "2011"};

		for(int i=0; i<5; i++) {
		    	
		   arrayExcel[i] = array[i] + ", " + arrayJahr[i];
		
		}
		
		String[] nameArray = new String[] { "Peter Meier, 2012\n", "Lara Miller, 2015\n",
		        "Peter Meier, 2015\n", "Tatjana Frank, 2013\n", "Danny Mende, 2010\n",
		        "Kathrin Storm, 2013\n" };
		
		
		List<String> excelList = Arrays.asList(arrayExcel); 
		
		Collections.addAll(excelList, nameArray);
		
		//TODO The Method is not applicable
		//Collections.sort( excelList, new VergleichName());       
		

		
	}
}
	
	
	