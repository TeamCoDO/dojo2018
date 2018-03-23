package de.codingdojo.tresor;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Starter {


	private static Scanner sc;

	public static void main(String[] args) {

		
		Tresor tresor=new Tresor();
		tresor.init();


		sc = new Scanner(System.in); 
		
		//Logging
		Logger log = LogManager.getLogger(Starter.class.getName());

		do {
			log.info(tresor.getStatus());
			int iEingabeZiffer = sc.nextInt();
			int result = tresor.knack(iEingabeZiffer);
			String sMsg = "";
			switch (result) {
			case 1:
				sMsg = "Zahl ist groesser. Anzahl der Versuche: " + tresor.getRestversuche();
				break;

			case 0:
				sMsg = "Zahl ist richtig";
				break;
			case -1:
				sMsg = "Zahl ist kleiner. Anzahl der Versuche: " + tresor.getRestversuche();
				break;

			default:
				break;
			}
			log.info(sMsg);
		} while (true);




	}

}
