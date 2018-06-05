package de.codingdojo.aufgabe;

import java.util.List;
import java.util.Random;

public class TheMain {

	public static void main(String[] args) {
		Kidscalc kc = new Kidscalc(5, 100, "+-", new Random());
//		Aufgabe aufgabe = kc.generiereAufgabe();
		List<Aufgabe> listOfAufgaben = kc.generiereAufgaben();
		for(Aufgabe aufgabe: listOfAufgaben){
			printAufgabe(aufgabe);
		}
	}

	private static void printAufgabe(Aufgabe aufgabe) {
		System.out.println(aufgabe);
	}

}
