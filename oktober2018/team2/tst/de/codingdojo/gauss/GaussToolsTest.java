/**
 * 
 */
package de.codingdojo.gauss;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author 
 *
 */
public class GaussToolsTest {

	@Test
	public void bildeSummeTest01() {
		long n = 3;
		long expecteds, actuals;
		
		actuals = GaussTools.bildeSumme(n);
		expecteds = 6;
		assertEquals(expecteds, actuals);
	}

	@Test
	public void bildeSummeTest02() {
		long n = 51;
		long expecteds, actuals;
		
		actuals = GaussTools.bildeSumme(n);
		expecteds = 1326;
		assertEquals(expecteds, actuals);
	}

	@Test
	public void berechneNachGaussTest01() {
		long n = 3;
		long expecteds, actuals;
		
		actuals = GaussTools.berechneNachGauss(n);
		expecteds = 6;
		assertEquals(expecteds, actuals);
	}

	@Test
	public void berechneNachGaussTest02() {
		long n = 51;
		long expecteds, actuals;
		
		actuals = GaussTools.berechneNachGauss(n);
		expecteds = 1326;
		assertEquals(expecteds, actuals);
	}

	@Test
	public void vergleicheErgebnisseTestTrue() {
		long ergebnis1, ergebnis2;
		ergebnis1 = 100;
		ergebnis2 = 100;
		boolean expecteds, actuals;
		
		actuals = GaussTools.vergleicheErgebnisse(ergebnis1, ergebnis2);
		expecteds = true;
		assertEquals(expecteds, actuals);
	}

	@Test
	public void vergleicheErgebnisseTestFalse() {
		long ergebnis1, ergebnis2;
		ergebnis1 = 100;
		ergebnis2 = 111;
		boolean expecteds, actuals;
		
		actuals = GaussTools.vergleicheErgebnisse(ergebnis1, ergebnis2);
		expecteds = false;
		assertEquals(expecteds, actuals);
	}

}
