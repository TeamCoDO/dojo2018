package de.coding.august;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Start {

	static List<String> eingabe1 = new ArrayList<>();
	static List<String> eingabe2 = new ArrayList<>();
	
	static List<String> eingabeKomplett = new ArrayList<>();
	
	public static void main(String[] args) {
		Start start = new Start();
		BufferedReader br;

		try {
			br = start.read("res/PersonenMUC.txt");
			String tmp = br.readLine();
			 while (tmp != null && !tmp.isEmpty()) 
			 {
//				 System.out.println(tmp);
				 eingabe1.add(tmp);
				 tmp = br.readLine();
			 }
			 br.close();
			 
			 br = start.read("res/PersonenPlus.txt");
				String tmp2 = br.readLine();
				 while (tmp2 != null && !tmp2.isEmpty()) 
				 {
//					 System.out.println(tmp2);
					 eingabe2.add(tmp2);
					 tmp2 = br.readLine();
				 }
				 br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		eingabeKomplett = eingabe1;
		for (String string : eingabe2) {
			eingabeKomplett.add(string);
		}
		
		System.out.println("Aufgabe 1: " + start.getMaxJahrPerson("Peter Meier"));
		System.out.println("Aufgabe 2: " + start.getJahrNamen("2015"));
		
	}

	protected BufferedReader read(String string) throws FileNotFoundException {
		return new BufferedReader(new FileReader(string));
	}

	public boolean findPersonInArray(String string) {
		// TODO Auto-generated method stub
		
		return false;
	}

	public String getMaxJahrPerson(String name) {
		int maxJahr = 0;
		int zeilennummer = 0;
		int pos = -1;
		// TODO Auto-generated method stub
		for (String zeile : eingabeKomplett) {
			String[] splitResult = zeile.split(", "); 
			if (splitResult[0].equals(name)) {
				if (Integer.valueOf(splitResult[1]) > maxJahr)
				{
					maxJahr = Integer.valueOf(splitResult[1]);
					pos = zeilennummer;
				}
			}
			zeilennummer++;
		}
		if(pos == -1)
		{
			return "Vernünftige Eingabe machen!";
		}
		else{
			return eingabeKomplett.get(pos);
		}
		
	}

	public String getJahrNamen(String jahr) {
		String retString = "";
		
		// TODO Auto-generated method stub
		for (String zeile : eingabeKomplett) {
			String[] splitResult = zeile.split(", "); 
			if (splitResult[1].equals(jahr)) {
				retString.concat(splitResult[0]).concat(", ");
			}
		}
		return retString;
	}
	

}
