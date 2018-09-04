package de.codingdojo.September;

public class Beispiel2 {
	
	static double  zahl = 158036522;
	static double sec = 0;
	static double min = 0;
	static double std = 0;
	double tage = 0;
	double jahr = 0;
	
	public Beispiel2 (double dou) {
		ermittleZeit(dou);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Rest in Sekunden	
		sec = (zahl%60);
		//Ermittlung der Minuten
		min = zahl / 60;
		
		
		
		//Ermittlung Stunden
		std = (min / 60);
		min = min + (min / 60);
		

	}
	
public void ermittleZeit(double input) {
		
			//Rest in Sekunden	
			sec = (zahl%60);
			//Ermittlung der Minuten
			min = zahl / 60;
			
			
			//Ermittlung Stunden
			std = (min / 60);
			min = min + (min / 60);
			System.out.println("min: " + min);
			
	}
	
	public double getJahr() {
		return (jahr);
	}

}
