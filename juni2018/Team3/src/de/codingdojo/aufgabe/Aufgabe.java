package de.codingdojo.aufgabe;

public class Aufgabe {

	private int operand1;
	private int operand2;
	private Operator operator;
	
	
	public Aufgabe(int operand1, int operand2, Operator operator) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator = operator;
	}
	
	public int getOperand1() {
		return operand1;
	}
	public int getOperand2() {
		return operand2;
	}
	public Operator getOperator() {
		return operator;
	}
	public int getErgebnis() {
		switch(operator){
			case MINUS : return this.operand1 - this.operand2; 
			case PLUS : return this.operand1 + this.operand2;
			default : throw new IllegalArgumentException("Operator: "+operator+" not supported");
		}
	}

	@Override
	public String toString() {
		return "Aufgabe [operand1=" + operand1 + ", operand2=" + operand2 + ", operator=" + operator + ", ergebnis="+getErgebnis()+"]";
	}
	
	
	
}
