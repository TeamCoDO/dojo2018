package de.codingdojo.listen;

public class Personen implements Comparable<Personen> {
	String name;
	String jahr;
	
	public Personen(){
		
	}

	@Override
	public int compareTo(Personen pers) {
		int result = 0;
		if (Integer.parseInt(this.jahr) > Integer.parseInt(pers.jahr)){
			result = 1;
		}
		else if (Integer.parseInt(this.jahr) < Integer.parseInt(pers.jahr)){
			result = -1;
		}
		
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJahr() {
		return jahr;
	}

	public void setJahr(String jahr) {
		this.jahr = jahr;
	}
	
}
