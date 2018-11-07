package de.codingdojo.autohaus;

import static org.junit.Assert.*;

import org.junit.Test;

import de.codingdojo.autohaus.funktionen.Autovergleich;
import de.codingdojo.autohaus.model.Auto;

public class AutoVergleichTest {
	
	@Test
	public void testVergleich() {
		Auto a1 = new Auto("Ford", 125000, 7999.99, "silber metallic", false, "Diesel", 101.0);
		Auto a2 = new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Super", 137.0);
		Autovergleich vgl = new Autovergleich();
		assertEquals(1, vgl.compare(a1, a2));
	}
	
}
