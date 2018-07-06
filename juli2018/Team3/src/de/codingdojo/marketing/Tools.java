package de.codingdojo.marketing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Tools {

	/**
	 * Liest eine Textdatei ein, die im tab. Format vorliegt
	 * 
	 * @param sPath
	 * @return
	 * @throws IOException
	 */
	public static ArrayList<String> readList(String sPath) throws IOException {
		File file = new File(sPath);
		ArrayList<String> txtArray = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       // process the line.
		    	txtArray.add(line);
		    }
		}
		
		return txtArray;
	}

	/**
	 * Liest eine Textdatei ein, die zwei Zeilen hat
	 * 
	 * @param sPath
	 * @return
	 * @throws IOException
	 */
	public static String readCSV(String sPath) throws IOException {
		File file = new File(sPath);
		StringBuffer inStringBuffer = new StringBuffer();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    int index = 0;
		    while ((line = br.readLine()) != null) {
		       // process the line.
		    	if (index > 0) {
					inStringBuffer.append("\n");
				}
		    	
		    	// Zeilenumbruch einfügen
		    	inStringBuffer.append(line);
		    	
		    	index++;
		    }
		}
		return inStringBuffer.toString();
	}

}
