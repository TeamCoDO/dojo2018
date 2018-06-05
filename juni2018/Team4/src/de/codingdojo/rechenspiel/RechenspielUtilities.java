package de.codingdojo.rechenspiel;

public class RechenspielUtilities {
	
	private static final String ADDITION = "++";
	private static final String SUBTRAKTION = "--";
	private static final String ADDITION_SUBTRAKTION = "+-";
	private static final String SUBTRAKTION_ADDITION = "-+";

	public static boolean isNumber(String string) {
			try {
				Integer.parseInt(string);
			} catch (NumberFormatException e) {
				return false;
			}
		return true;
	}
	
	public static int toNumber(String string) throws NumberFormatException {
		return Integer.parseInt(string);
	}

	/**
	 * @param numberEingabe
	 * @param range
	 * @return
	 */
	public static boolean isRange(int numberEingabe, int range) {
		return numberEingabe  <= range;
	}

	/**
	 * @param operationEingabe
	 * @return
	 */
	public static boolean isOperationValidate(String operationEingabe) {
		
		boolean rc = false;
		
		if (operationEingabe != null && operationEingabe.length() == 2){
			switch (operationEingabe) {
			case ADDITION:
			case SUBTRAKTION:
			case ADDITION_SUBTRAKTION:
			case SUBTRAKTION_ADDITION:
				rc = true;

			}
			
		}
		return rc;
	}

	/**
	 * @param range
	 * @return
	 */
	public static int generateNumber(int range) {		
		
		return (int)((Math.random()) * range + 1);
	}

}
