package de.codingdojo.tresor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Generator {

	private Logger logger;
	
	public Generator() {
		logger = LogManager.getLogger();
	}
	
	public int[] getCode() {
		int[] result = new int[4];
		logger.traceEntry();

		for (int ii = 0; ii < 4; ii++) {
			result[ii] = (int)(Math.random()*9+1);
		}
		
		return result;
	}
}
