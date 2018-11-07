import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class AutoTest {

	@Test
	public void Aufgabe1() {

		Auto auto1 = new Auto("Ford", 125000, 79999.99, "silber metallic", false, "Diesel", 101.0);
		Auto auto2 = new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Super", 137.0);
		Auto auto3 = new Auto("Daihatsu", 12000, 3099.99, "green dynamize", true, "Benzin", 75.0);
		
		Assert.assertNotNull(auto1);
		Assert.assertNotNull(auto2);
		Assert.assertNotNull(auto3);
		
		auto1.zeigeEigenschaften();
		auto2.zeigeEigenschaften();
		auto3.zeigeEigenschaften();
	}
	
	@Test
	public void Aufgabe2() {

		// Methodenliste, die Auto zu Preise zuordnet
		HashMap<Integer,Auto> autoUndPreis = new HashMap<Integer,Auto>();

		// Erstelle eine Liste der Auto-Objekte
		Auto[] autos = {
			new Auto("Ford", 125000, 79999.99, "silber metallic", false, "Diesel", 101.0),
			new Auto("Mercedes", 63000, 22999.99, "blue silver", true, "Super", 137.0),
			new Auto("Daihatsu", 12000, 3099.99, "green dynamize", true, "Benzin", 75.0)
		};
		
		// Erstelle eine Liste der Preis-Objekte in Integer Format
		int[] autoPreisListe = {
				(int) autos[0].preis,
				(int) autos[1].preis,
				(int) autos[2].preis
		};
		
		// Assertiere die erstellte Objekte
		Assert.assertNotNull(autos);
		Assert.assertNotNull(autoPreisListe);
		
		// Vermerke Auto-Objekte u. -Preise in einer Liste (Zweck Sortierung)
		autoUndPreis.put(((Double)autos[0].preis).intValue(), autos[0]);
		autoUndPreis.put(((Double)autos[1].preis).intValue(), autos[1]);
		autoUndPreis.put(((Double)autos[2].preis).intValue(), autos[2]);
		
		// Sortiere die Auto-Objekte anhand der Preise
		Auto.bubbleSort(autoPreisListe);
		for (Integer autoEintrag : autoPreisListe) {
			Auto sortiertesAuto = (Auto) autoUndPreis.get(autoEintrag);
			sortiertesAuto.zeigeEigenschaften();
		}
	}
}
