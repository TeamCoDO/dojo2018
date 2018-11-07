package de.codingdojo.autohaus;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import de.codingdojo.autohaus.funktionen.AutoStatistik;
import de.codingdojo.autohaus.model.Auto;

public class AutoStatistikTest {
	@Test
	public void testVerkauferloes() {
		Auto a1 = new Auto("Ford", 125000, 7999.99, "silber metallic", false, "Diesel", 101.0);
		Auto a2 = new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Super", 137.0);
		Auto a3 = new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true, "Benzin", 75.0);
		List<Auto> autos = Arrays.asList(a1, a2, a3);
		AutoStatistik statistik = new AutoStatistik(autos);
		assertEquals(34099.97, statistik.berechneVerkaufserloes(), 0.0001);
	}
	
	@Test
	public void testAnteilUnfallwagen() {
		Auto a1 = new Auto("Ford", 125000, 7999.99, "silber metallic", false, "Diesel", 101.0);
		Auto a2 = new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Super", 137.0);
		Auto a3 = new Auto("Daihatsu", 12000, 3099.99, "green dynamite", true, "Benzin", 75.0);
		List<Auto> autos = Arrays.asList(a1, a2, a3);
		AutoStatistik statistik = new AutoStatistik(autos);
		assertEquals(66.6666, statistik.berechneAnteiligeUnfallwaegen(), 0.0001);
	}
}
