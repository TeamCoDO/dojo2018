package de.codingdojo.dosenrechner;

import static org.junit.Assert.*;

import org.junit.Test;

public class DosenRechnerTest {
	private Dose dose;
	
	
	/**
	 * Ein Test für die Dose mit Höhe 1 und Umfang  PI, um eine Dose mit Duchmesser 1 zu bekommen
	 */
	@Test
	public void rechneDurchmesser(){
		dose=new Dose(3.1415, 1 );
		assertEquals(1.0, DosenRechner.rechneDurchmesser(dose), 0.01);
	}
	
	/**
	 * Ein Test für eine Dose mit Durchmesser 0, weil Umfang 0 ist
	 */
	@Test
	public void rechneDurchmesserNull(){
		dose=new Dose(0, 1 );
		assertEquals(0, DosenRechner.rechneDurchmesser(dose), 0.01);
	}
	
	/**
	 * Ein Test für eine Dose mit Durchmesser 0, weil Umfang UND Höhe 0 ist
	 */
	@Test
	public void rechneDurchmesserDoseNull(){
		dose=new Dose(0, 0);
		assertEquals(0, DosenRechner.rechneDurchmesser(dose), 0.01);
	}
	
	/**
	 * Ein Test für Negative Werte: Höhe
	 */
	@Test(expected = IllegalArgumentException.class)  
	public void rechneDurchmesserMitHoeheNegativeException(){
		dose=new Dose(3.1415, -1 );
		DosenRechner.rechneDurchmesser(dose);
	}
	
	/**
	 * Ein Test für Negative Werte: Umfang
	 */
	@Test(expected = IllegalArgumentException.class)  
	public void rechneDurchmesserMitUmfangNegativeException(){
		dose=new Dose(-3.1415, 1 );
		DosenRechner.rechneDurchmesser(dose);
	}
	
	/**
	 * Ein Test für Berechnung des Dosenbodens mit Umfang 2*PI
	 */
	@Test
	public void rechneFlaecheDosenBoden(){
		dose=new Dose(6.283, 1 );
		assertEquals(3.14, DosenRechner.rechneFlaecheDosenBoden(dose), 0.01);
	}
	
	/**
	 * Ein Test für Berechnung des Dosenbodens mit Umfang und Höhe 0
	 */
	@Test
	public void rechneFlaecheDosenBodenDoseNull(){
		dose=new Dose(0, 0 );
		assertEquals(0, DosenRechner.rechneFlaecheDosenBoden(dose), 0.01);
	}
	
	/**
	 * Ein Test für Berechnung der Mantelfläche mit Umfang und Höhe 1
	 */
	@Test
	public void rechneMantelflaeche(){
		dose=new Dose(1, 1 );
		assertEquals(1, DosenRechner.rechneMantelflaeche(dose), 0.01);
	}
	
	/**
	 * Ein Test für Berechnung der Mantelfläche mit Umfang und Höhe 0
	 */
	@Test
	public void rechneMantelflaecheDoseNull(){
		dose=new Dose(0, 0 );
		assertEquals(0, DosenRechner.rechneMantelflaeche(dose), 0.01);
	}
	
	/**
	 * Ein Test für Berechnung der Gesamtfläche  mit Umfang 2*PI
	 */
	@Test
	public void rechneGesamtflaeche(){
		dose=new Dose(6.283, 1);
		assertEquals(12.56, DosenRechner.rechneGesamtflaeche(dose), 0.01);
	}
	
	/**
	 * Ein Test für Berechnung der Gesamtfläche mit Umfang und Höhe 0
	 */
	@Test
	public void rechneGesamtflaecheDoseNull(){
		dose=new Dose(0, 0 );
		assertEquals(0, DosenRechner.rechneGesamtflaeche(dose), 0.01);
	}
	
	/**
	 * Ein Test für Berechnung des Volumens mit Umfang 2*PI
	 */
	@Test
	public void rechneVolumen(){
		dose=new Dose(6.283, 1  );
		assertEquals(3.14, DosenRechner.rechneVolumen(dose), 0.01);
	}
	
	/**
	 * Ein Test für Berechnung des Volumens mit Umfang und Höhe 0
	 */
	@Test
	public void rechneVolumenDoseNull(){
		dose=new Dose(0, 0 );
		assertEquals(0, DosenRechner.rechneVolumen(dose), 0.01);
	}

}
