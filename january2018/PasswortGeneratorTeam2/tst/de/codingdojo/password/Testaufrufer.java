package de.codingdojo.password;

import java.util.ArrayList;
import java.util.List;

public class Testaufrufer {

	/**
	 * Testaufrufer
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PassWordGenerator pwgen = new PassWordGenerator();
		List<String> l = new ArrayList<String>();
		l.add("Mein Fahrrad fährt Tango.");
		l.add("Ein Passwort ist nur so gut , wie sein geheimer Platz .");
		l.add("Selber programmieren ist überraschen !");
		l.add("Musik bringt Ordnung in das Geräusch der Welt.");

		for (String string : l) {
			System.out.println("Für den Satz \"" +string +"\" wird das Passwort \"" +pwgen.getPassWordString(string) +"\" generiert.");
		}
	}

}
