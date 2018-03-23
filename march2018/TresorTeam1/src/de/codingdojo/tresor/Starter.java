package de.codingdojo.tresor;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.experimental.theories.Theories;

public class Starter {
	private static Logger logger;
	int[] code = new int[]{-1,-1,-1,-1};
	
	public Starter() {
		logger = LogManager.getLogger(Starter.class);

	}
	
	public static void main(String[] args) {
		String sMsg;
		Tresor tc = new Tresor();
		tc.init(3);
		
		Starter starter = new Starter();
		logger.info("(gelb) " +starter.getCodeString(starter.code));

		
		
		//Input
		Scanner sc = new Scanner(System.in); 
		//Logging
		Logger log = LogManager.getLogger(Starter.class.getName());

		do {
			int eingabeZiffer = sc.nextInt();
			int result = tc.knack(eingabeZiffer);
			sMsg = "";
			switch (result) {
			case 1:
				if (tc.getAnzahlVersuche() == tc.getMaxVersuche()) {
					starter.code[tc.getAktuelleStelle()] = -2;
					sMsg = "(rot) " +starter.getCodeString(starter.code);
					tc.setAktuelleStelle(tc.getAktuelleStelle() + 1);
					tc.setAnzahlVersuche(0);
				} else {
					sMsg = "(gelb) " +starter.getCodeString(starter.code) +" - Zahl ist größer. Anzahl der Versuche: " + tc.getAnzahlVersuche();
				}
				break;

			case 0:
				starter.code[tc.getAktuelleStelle()-1] = eingabeZiffer;
				sMsg = "(gruen) " +starter.getCodeString(starter.code) +" - Zahl ist richtig";
				break;
			case -1:
				if (tc.getAnzahlVersuche() == tc.getMaxVersuche()) {
					starter.code[tc.getAktuelleStelle()] = -2;
					sMsg = "(rot) " +starter.getCodeString(starter.code);
					tc.setAktuelleStelle(tc.getAktuelleStelle() + 1);
					tc.setAnzahlVersuche(0);
				} else {
					sMsg = "(gelb) " +starter.getCodeString(starter.code) +" - Zahl ist kleiner. Anzahl der Versuche: " + tc.getAnzahlVersuche();
				}
				break;

			default:
				break;
			}
			log.info(sMsg);
		} while (   tc.getAktuelleStelle() < tc.getCode().length
				 && tc.getAnzahlVersuche() <= tc.getMaxVersuche());
		sMsg = "(gruen) - Der Code vom Tresor lautet: " + starter.getCodeString(tc.getCode());
		log.info(sMsg);
		
	}

	/**
	 * Liefert den eratenen Code als String zurueck
	 * @return
	 */
	private String getCodeString(int[] code) {
		StringBuilder codeBuffer = new StringBuilder();
		for (int i = 0; i < code.length; i++) {
			int num = code[i];
			if (num < 0) {
				if (num == -2) {
					codeBuffer.append("_X_");
				} else {
					codeBuffer.append("___");
				}
			} else {
				codeBuffer.append("_" +num +"_");
			}
			codeBuffer.append(" ");
		}
		return codeBuffer.toString();
	}

}
