package de.codingdojo.aufgabe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;

public class TestKidcalc {

	@Test
	public void testAufgabeNotNull() {
		Random rand = new Random();
		
		Kidscalc kc = new Kidscalc(1, 100, "+", rand);
		assertNotNull(kc.generiereAufgabe());
	}

	@Test
	public void testAufgabeOperatorKorrekt() {
		Random rand = new Random();
		Kidscalc kc = new Kidscalc(1, 100, "--", rand);
		assertEquals(Operator.MINUS, kc.generiereAufgabe().getOperator());
		
	}
	
	@Test
	public void testAufgabeZahlenbereich() {
		Random rand = new Random();
		Kidscalc kc = new Kidscalc(1, 10, "+-", rand);
		Aufgabe aufgabe = kc.generiereAufgabe();
		assertTrue(aufgabe.getOperand1() < 10);
		assertTrue(aufgabe.getOperand2() < 10);
		assertTrue(aufgabe.getErgebnis() < 10);
	}


}
