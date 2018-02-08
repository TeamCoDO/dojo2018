package de.codingdojo.tresorcode;

public class TresorCode implements ITresorCode {

	private final int anzahlVersucheJeIndex;
	private int anzahlRestversuche;
	private int[] code;
	private int codeIndex;
	
	
	public TresorCode(int[] code, int anzahlVersuche) {
		this.anzahlVersucheJeIndex = anzahlVersuche;
		this.anzahlRestversuche = anzahlVersuche;
		this.code = code;
		this.codeIndex = 0;
	}
	
	@Override
	public VergleichErgebnis versucheZiffer(int iZiffer) {
		// init result
		VergleichErgebnis result = null;
		
		if (codeIndex < code.length) {
			int diff = iZiffer - code[codeIndex];
			if (diff > 0) {
				result = VergleichErgebnis.GROESSER;
			} else if (diff < 0) {
				result = VergleichErgebnis.KLEINER;
			} else {
				result = VergleichErgebnis.GLEICH;
			}
			// Anzahl Restversuche reduzieren
			anzahlRestversuche--;
			// falls dies der letzte Versuch war oder bei Treffer: vorrücken auf nächste Stelle
			if (anzahlRestversuche < 0 || result == VergleichErgebnis.GLEICH) {
				nextDigit();
			}
		}
		return result;
	}

	@Override
	public int getAnzahlRestversuche() {
		return anzahlRestversuche;
	}
	
	@Override
	public int getAktuelleStelle() {
		return codeIndex + 1;
	}
	
	/**
	 * Rest
	 */
	private void nextDigit() {
		codeIndex++;
		anzahlRestversuche = anzahlVersucheJeIndex;
	}

}
