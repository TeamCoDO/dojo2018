package de.codingdojo.rechenspiel;

import static org.junit.Assert.*;

import org.junit.Test;

public class RechenspielTest {

	@Test
	public void getEingabetextTest() {
		
		assertSame("Wie viele Aufgaben möchten Sie lösen?", Rechenspiel.getEingabetext());
	}
}
