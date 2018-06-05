package de.codingdojo.aufgabe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Kidscalc {

	private List<String> acceptedOperatorInputs = Arrays.asList("+","-","++","--","+-","-+");
	private int anzahlAufgaben;
	private int zahlenraum;
	private Operator operator;
	private Random rand;
	
	
	public  Kidscalc(int anzahlAufgaben, int zahlenraum, String stroperator, Random rand) {
		if(acceptedOperatorInputs.contains(stroperator)){
			this.operator = Operator.PLUSMINUS;
			switch(stroperator){
				case "++" : case "+": this.operator= Operator.PLUS ; break;
				case "--": case "-": this.operator= Operator.MINUS; break;
			}
		}else{
			throw new IllegalArgumentException("Operator: "+operator+" not supported");
		}
		this.anzahlAufgaben = anzahlAufgaben;
		this.zahlenraum = zahlenraum;
		this.rand = rand;
	}
	
	/**
	 * erzeugt eine valide Aufgabe
	 * @return
	 */
	public Aufgabe generiereAufgabe() {

		Aufgabe aufgabe;
		do {
			Operator operatorToUse = operator;
			if (operator == Operator.PLUSMINUS) {
				int oper = rand.nextInt(2);
				if (oper == 0) {
					operatorToUse = Operator.PLUS;
				} else {
					operatorToUse = Operator.MINUS;
				}
			}
			int operand1 = rand.nextInt(zahlenraum);
			int operand2 = rand.nextInt(zahlenraum);
			aufgabe = new Aufgabe(operand1, operand2, operatorToUse);
		} while (!checkAufgabe(aufgabe));

		return aufgabe;
	}

	/**
	 * validiert die übergebne Aufgabe
	 * @param aufgabe
	 * @return
	 */
	public boolean checkAufgabe(Aufgabe aufgabe){
		if(aufgabe.getOperand1()<=zahlenraum && aufgabe.getOperand1() >= 0) {
			if(aufgabe.getOperand2()<=zahlenraum  && aufgabe.getOperand2() >= 0){
				if(aufgabe.getErgebnis()<=zahlenraum  && aufgabe.getErgebnis() >= 0){
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * erzeugen einer anzahl von aufgaben
	 * @param anzahl der aufgaben die erzeugt werden sollen
	 * @return
	 */
	public List<Aufgabe> generiereAufgaben() {

		List<Aufgabe> listOfAufgaben = new ArrayList<>();
		for(int i = 0; i < this.anzahlAufgaben; i++){
			listOfAufgaben.add(generiereAufgabe());
		}
		
		return listOfAufgaben;
	}


}
