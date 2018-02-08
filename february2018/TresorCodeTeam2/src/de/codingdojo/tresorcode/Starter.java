package de.codingdojo.tresorcode;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;

public class Starter {

	private static int[] code = new int[]{1,2,3,4};
	private static int anzahlVersuche = 3;
	private static TresorCode tc;

	public static void main(String[] args) {
		tc = new TresorCode(code, anzahlVersuche );
		
		
		
		
		//Anfang der Metadaten 


		//Input
		Scanner sc = new Scanner(System.in); 
		//Logging
		Logger log = LogManager.getLogger(Starter.class.getName());

		do {
			int iEingabeZiffer = sc.nextInt();
			VergleichErgebnis result = tc.versucheZiffer(iEingabeZiffer);
			String sMsg = "";
			switch (result) {
			case GROESSER:
				sMsg = "Zahl ist größer. Anzahl der Versuche: " + tc.getAnzahlRestversuche();
				break;

			case GLEICH:
				sMsg = "Zahl ist richtig";
				break;
			case KLEINER:
				sMsg = "Zahl ist kleiner. Anzahl der Versuche: " + tc.getAnzahlRestversuche();
				break;

			default:
				break;
			}
			log.info(sMsg);
		} while (true);

		//Random
		//java.util.Random;
		//int rand=(int) Math.random();


	}

}
