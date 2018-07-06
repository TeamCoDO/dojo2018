package de.codingdojo.listen;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.codingdojo.listen.ExcelParser;

public class TestSelektionen {
	String excelInput = "Peter Meier, Lara Miller, Lara Miller, Lara Miller, Tatjana Frank, 2014, 2013, 2014, 2015, 2011";
	ExcelParser parser;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExcelparser(){
		//TODO die Methode pruefeInhalt() ist nicht definiert
		//assertEquals(true, parser.pruefeInhalt());
	}
}
