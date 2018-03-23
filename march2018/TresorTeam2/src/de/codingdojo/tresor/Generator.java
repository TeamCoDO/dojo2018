package de.codingdojo.tresor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Generiert eine 4 stellige Zahl

 *
 */
public class Generator {

	private Logger logger;
	
	public Generator() {
		logger = LogManager.getLogger();
	}
	
	/**
	 * Liefert ein Array mit 4 zufaelligen einstelligen Zahlen
	 * @return
	 */
	public int[] getCode() {
		int[] result = new int[4];

		logger.traceEntry();

		for (int ii = 0; ii < 4; ii++) {
			result[ii] = (int)(Math.random()*9+1);
		}
		
		logger.traceExit("result: " + result);
		return result;
	}
}
