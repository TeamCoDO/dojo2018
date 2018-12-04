package de.codingdojo.spiegeln;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Starter {

	public static void main(String[] args) {
		
		String textEins = "Hallo dies ist ein Test!";
		
		Spiegel spiegel = new Spiegel();
		Logger log = Logger.getAnonymousLogger();
		
		try {
			System.out.println(textEins +spiegel.spiegeln(textEins));
		} catch (SpiegelException e) {
//			e.printStackTrace();
			log.log(Level.WARNING, "Bla Fehler");
		}

	}

}



	
		