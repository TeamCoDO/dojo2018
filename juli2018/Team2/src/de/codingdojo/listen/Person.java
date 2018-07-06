package de.codingdojo.listen;

import java.util.Comparator;


public class Person {
	
	
	String name;
	int jahr;
	
	
	
	public Person() {
		super();
	}

	public Person(String str) {
		
		name = ermittleName(str);
		jahr = ermittleJahr(str);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}

	public String ermittleName(String str)  {
		String name = "";
		
		int i = str.indexOf(", ");
		name = str.substring(1, i-1);
		
		return name;
	}
	
	public int ermittleJahr(String str)  {
		jahr = 0; 
		int j = 4;
		int i = str.indexOf(", ");
		String year = str.substring(i+2,i+6);
		
		jahr = Integer.parseInt(year);
		
		return jahr;
	}

	
	
	
	class VergleichName implements Comparator {
	    public int compare(Object o1, Object o2) {
	    	Person person1 = (Person) o1;
	    	if (person1.getName().equals(person1.getName())) {
				return 1;
			} else {
				return -1;
			}
	    	
	    }
	}

}
