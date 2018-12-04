package de.codingdojo.spiegeln;

/**
 *
 */
public class Spiegel {
	
	/**
	 * 
	 */
	String test;

	/**
	 * Die Methode gibt den übergebenen String gespiegelt zurück.
	 * 
	 * @param string
	 * @return
	 * @throws SpiegelException
	 */
	public String spiegeln(String string) throws SpiegelException {
		if(string == null || string.isEmpty()) {
			throw new SpiegelException("Der String darf nicht NULL oder leer sein!");
		}
		StringBuffer reverse = new StringBuffer();
		int length = string.length() - 1;
		for (; length >= 0; length--) {
			reverse.append(string.charAt(length));			
		}
		return reverse.toString();
	}

}
