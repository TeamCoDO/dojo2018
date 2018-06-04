package de.coding.dojo;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class BuchstabenPruefungTest {

	// Tests der Einlesen-Methode
	@Test public void testEinlesenLeer() {
		Scanner scanner = new Scanner("");
		BuchstabenPruefung bp = new BuchstabenPruefung(scanner);
		assertNull("nicht null", bp.einlesenZeichenkette());
	}
	@Test public void testEinlesenZiffer() {
		Scanner scanner = new Scanner("mit 1 Ziffer");
		BuchstabenPruefung bp = new BuchstabenPruefung(scanner);
		assertEquals("ohne Ziffer", "mit 1 Ziffer", bp.einlesenZeichenkette());
	}
	@Test public void testEinlesenX() {
		Scanner scanner = new Scanner("X");
		BuchstabenPruefung bp = new BuchstabenPruefung(scanner);
		assertEquals("kein x", "X", bp.einlesenZeichenkette());
	}

	// Tests der Prüfen-Methode
	@Test public void testPruefenZeichenketteMitZiffer() {
		Scanner scanner = new Scanner("mit 1 Ziffer");
		BuchstabenPruefung bp = new BuchstabenPruefung(scanner);
		assertFalse(bp.pruefenZeichenkette("mit 1 Ziffer"));
	}
	@Test public void testPruefenZeichenketteOhneZiffer() {
		Scanner scanner = new Scanner("ohne Ziffer");
		BuchstabenPruefung bp = new BuchstabenPruefung(scanner);
		assertTrue(bp.pruefenZeichenkette("ohne Ziffer"));
	}

	// Tests der Zählen-Methode
	@Test public void testZaehlenNichtVorhanden() {
		Scanner scanner = new Scanner("Ein Zebra");
		BuchstabenPruefung bp = new BuchstabenPruefung(scanner);
		assertEquals(0, bp.zaehleAbsolut('y', 7, "Ein Zebra"));
	}
	@Test public void testZaehlenVorhandenKleinbuchstabe() {
		Scanner scanner = new Scanner("Ein Zebra");
		BuchstabenPruefung bp = new BuchstabenPruefung(scanner);
		assertEquals(1, bp.zaehleAbsolut('z', 7, "Ein Zebra"));
	}
	@Test public void testZaehlenVorhandenGrossbuchstabe() {
		Scanner scanner = new Scanner("Ein Zebra");
		BuchstabenPruefung bp = new BuchstabenPruefung(scanner);
		assertEquals(1, bp.zaehleAbsolut('Z', 7, "Ein Zebra"));
	}
	@Test public void testZaehlenVorhandenMehrere() {
		Scanner scanner = new Scanner("Ein Zebra");
		BuchstabenPruefung bp = new BuchstabenPruefung(scanner);
		assertEquals(2, bp.zaehleAbsolut('e', 7, "Ein Zebra"));
	}
}
