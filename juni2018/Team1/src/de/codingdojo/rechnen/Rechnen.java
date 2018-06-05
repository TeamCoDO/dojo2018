package de.codingdojo.rechnen;

public class Rechnen {

	public static boolean pruefeAufgabenEingabeArt(String art){
		switch (art) {
		case "++":
		case "+-":
		case "-+":
		case "--":
			return true;

		default:
			return false;
		}
	}

	public static boolean pruefeGrenzen(int unter, int ober){
		if(unter < ober)
		{
			return true;
		}
		else{
			return false;
		}

	}

	public boolean pruefeZahlenraumEingabe(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean pruefeDifferenzGrenzen(int untergrenze, int obergrenze, int anzahlAufgaben) {
		if(obergrenze - untergrenze > anzahlAufgaben)
		{
			return true;
		}
		else{
			return false;
		}

	}

	public static boolean pruefeAufgabenergebnis(int i, int j, String string, int untergrenze, int obergrenze) {
		int erg;
		switch (string) {
		case "+":
			erg = i + j;
			if(erg >= untergrenze && erg <= obergrenze)
			{
				return true;
			}
			break;

		default:
			break;
		}
		return false;
	}

}
