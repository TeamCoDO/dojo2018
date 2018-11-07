package de.codingdojo.autohaus;

import static org.junit.Assert.*;

import org.junit.Test;

import de.codingdojo.autohaus.model.Auto;

public class AutoTest {
	
	@Test
	public void testHersteller() {
		Auto a = new Auto("Ford", 125000, 7999.99, "silber metallic", false, "Diesel", 101.0);
		assertEquals("Ford", a.getHersteller());
	}
	
	@Test
	public void testFarbe() {
		Auto a = new Auto("Ford", 125000, 7999.99, "silber metallic", false, "Diesel", 101.0);
		assertEquals("silber metallic", a.getFarbe());
	}		

}
