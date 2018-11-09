package de.coding.august;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import org.junit.Test;

import de.coding.august.Start;

public class StartTest {

	@Test
	public void testRead1() {
		Start starter = new Start();
		try {
			BufferedReader inBr = starter.read("res/PersonenMUC.txt");
			assertNotNull(inBr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testRead2() {
		Start starter = new Start();
		try {
			BufferedReader inBr = starter.read("res/PersonenPlus.txt");
			assertNotNull(inBr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testgetMaxJahr() {
		Start start = new Start();
		String ret = start.getMaxJahrPerson("Peter Meier");
		String comp = "Peter Meier, 2015, 073487, 145, MA, N";
		assertEquals(comp , ret);
	}
	
	@Test
	public void testJahrNamen() {
		Start start = new Start();
		assertEquals("Lara Miller, Peter Meier", start.getJahrNamen("2015"));
	}
	
}
