package de.codingdojo.marketing;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

public class ToolsTest {

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

	@Test
	public void testReadList() {
		String sPath = "res/DatenbestandArrayList.txt";
		ArrayList<String> expectedsArray = new ArrayList<>();
		expectedsArray.add("Peter Meier, 2012");
		expectedsArray.add("Lara Miller, 2015");
		expectedsArray.add("Peter Meier, 2015");
		expectedsArray.add("Tatjana Frank, 2013");
		expectedsArray.add("Danny Mende, 2010");
		expectedsArray.add("Kathrin Storm, 2013");
		
		ArrayList<String> arrayList = null;
		try {
			arrayList = Tools.readList(sPath);
		} catch (IOException e) {
			fail("IOException!");
		}
		
		assertEquals(expectedsArray, arrayList);
	}

	@Test(expected=IOException.class)
	public void testReadListFileNotFound() throws IOException {
		String sPath = "res/DatenbestandArrayListXXXX.txt";
		ArrayList<String> expectedsArray = new ArrayList<>();
		
		ArrayList<String> arrayList = null;
		arrayList = Tools.readList(sPath);
		
		fail("Die erwartete Exception wurde nicht geworfen!");
	}

	
	@Test
	public void testReadCSV() {
		String sPath = "res/DatenbestandCSV.csv";
		String expectedsString = "Peter Meier, Lara Miller, Lara Miller, Lara Miller, Tatjana Frank\n2014, 2013, 2014, 2015, 2011";

		String inString = null;
		try {
			inString = Tools.readCSV(sPath);
		} catch (IOException e) {
			fail("IOException!");
		}
		
		assertEquals(expectedsString, inString);
	}

	
	@Test(expected=IOException.class)
	public void testReadCSVFileNotFound() throws IOException {
		String sPath = "res/DatenbestandCSVXXX.csv";
		String expectedsString = "Peter Meier, Lara Miller, Lara Miller, Lara Miller, Tatjana Frank\n2014, 2013, 2014, 2015, 2011";

		String inString = null;
		inString = Tools.readCSV(sPath);
		
		fail("Die erwartete Exception wurde nicht geworfen!");	}

	
	@Test
	@Ignore
	public void test() {
		fail("Not yet implemented");
	}

}
