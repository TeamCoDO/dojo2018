package de.codingdojo.password;

import org.apache.commons.lang.StringUtils;

public class PassWordGenerator {

	/**
	 * liefert zu der eingegebenen passphrase den den Regeln von Frau Master entsprechenden PasswortText
	 * @param passphrase
	 * @return PassWord not null
	 */
	public String getPassWordString(String passphrase) {
		// NULL-Prüfung
		if (passphrase != null) {
			//Splitt
			String[] splitt = splitWords(passphrase);
			StringBuffer sb = new StringBuffer();
			
			//von jedem Element den ersten Buchstaben nehmen
			for (int i = 0; i < splitt.length; i++) {
				String string = splitt[i];
				sb.append(string.substring(0, 1));
			}
			
			//die Anzahl der Elemente im Array ans Ende packen
			if (splitt.length > 0) {
				sb.append(splitt.length);
			}
			
			return sb.toString();
		}
		return "";
	}
	
	/**
	 * splittet die Worte aus der passphrase auf
	 * ! mehrere Leerzeichewn wie eines, Satzzeichen werden nur gesplittet, wenn nicht direkt am Wort  
	 * @param passphrase
	 * @return wenn passphrase NULL, dann leeres Array
	 */
	protected String[] splitWords(String passphrase) {
		String[] stringArray = new String[]{};
		
		//Null-Prüfung
		if (passphrase != null) {
			stringArray = StringUtils.split(passphrase);
		}
		
		return stringArray;
	}
	
	
	/** 
	 * liefert die Anzahl der gesplitteten Woerter
	 * @param gesplitteteWoerter
	 * @return
	 */
	protected int countWords(String[] gesplitteteWoerter) {
		if (gesplitteteWoerter != null) {
			return gesplitteteWoerter.length;
		}
		return 0;
	}
}
