package de.codingdojo;

import java.util.Scanner;

/**

 *
 */
public class Mirror {

	/**
	 * @param text
	 * @return the last index of a string
	 */
	public int getLastIndex(String text) {
		int lastIndex = -1;
		
		if ((text != null) && (text.isEmpty() == false)) {
			lastIndex = text.length()-1;
		}
		return lastIndex;
	}
	
	/**
	 * @param text
	 * @return a mirrored string
	 */
	public String getMirrorText(String text) {
		String mirrorText = "";
		
		if ((text != null) && (text.isEmpty() == false)) {
			for (int index = (this.getLastIndex(text)); index >= 0; index--) {
				
				mirrorText = mirrorText + getReplaceChar(text.charAt(index));
			}
		}
		return mirrorText;
	}
	
	/**
	 * @param text
	 * @return a mirrored string
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		Mirror mirror = new Mirror();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte einen Text eingeben, um ihn zu spiegeln");
		System.out.println("\"exit\" eingeben, um das Programm zu beenden");
		
		boolean isExit = false;
		do
		{
			String textEingabe = scanner.nextLine();
			if ((textEingabe != null) && (textEingabe.isEmpty() == false)) {
				
				if (textEingabe.equalsIgnoreCase("exit")) {
					isExit = true;
				}
				else {
					System.out.print(textEingabe);
					String mirrorText = mirror.getMirrorText(textEingabe);
					System.out.println(mirrorText);
					
					isExit = false;
				}
			}
			else {
				mirror.getClass().wait(2000);
			}
		} while (isExit == false);

	}

	/**
	 * Returns replaced (inverted) parenthesis 
	 * @param c
	 * @return
	 */
	public String getReplaceChar(char c) {
		
		String charToReplace = String.valueOf(c);
		if ((charToReplace != null) && (charToReplace.isEmpty() == false)) {
			switch (charToReplace) {
			case "(":
				charToReplace = ")";
				break;

			case ")":
				charToReplace = "(";
				break;
				
			case "[":
				charToReplace = "]";
				break;

			case "]":
				charToReplace = "[";
				break;

			case "{":
				charToReplace = "}";
				break;

			case "}":
				charToReplace = "{";
				break;

			default:
				break;
			}
		}
		return charToReplace;
	}
}
