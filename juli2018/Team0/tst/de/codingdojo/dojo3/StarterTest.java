package de.codingdojo.dojo3;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StarterTest {

	@Test
	public void testRead() {
		Starter starter = new Starter();
		try {
			BufferedReader inBr = starter.read("input.txt");
			assertNotNull(inBr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	@Test
	public void testColumnSizes() {
		Starter starter = new Starter();
		String[] testdaten = new String[] {"xyz"};
		int[] expextedSizes  = new int[] {3};
		List<String[]> testlist = new ArrayList<String[]>();
		testlist.add(testdaten);
		int[] columnSizes = starter.getColumnnSizes(testlist);
		assertNotNull(columnSizes);
		assertArrayEquals(expextedSizes, columnSizes);
	}

	@Test
	public void testConvert() throws FileNotFoundException, IOException {
		Starter starter = new Starter();
		
		List<String[]> result = starter.convertInput(starter.read("input.txt"));
		assertEquals("Name", result.get(0)[0]);
		
	}
	
}
