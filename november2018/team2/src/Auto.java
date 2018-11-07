
public class Auto {

	public String hersteller;
	public long laufleistung;
	public double preis;
	public String farbe;
	public boolean unfallwagen;
	public String kraftstoff;
	public double leistung;
	
	// Konstruktor fuer Klasse Auto
	public Auto(
			String hersteller,
			long laufleistung,
			double preis,
			String farbe,
			boolean unfallwagen,
			String kraftstoff,
			double leistung) {
		
		this.hersteller = hersteller;
		this.laufleistung = laufleistung;
		this.preis = preis;
		this.farbe = farbe;
		this.unfallwagen = unfallwagen;
		this.kraftstoff = kraftstoff;
		this.leistung = leistung;
	}
	
	// Methode zur Anzeige der Eigenschaften eines Auto-Objekts
	protected void zeigeEigenschaften() {
		
		System.out.println("---");
		System.out.println("Hersteller: " + this.hersteller);
		System.out.println("Preis: " + this.preis + " EUR");
		System.out.println("Motor: " + this.leistung + " PS");
		System.out.println("Kraftstoff: " + this.kraftstoff);
		System.out.println("KM-Stand: " + this.laufleistung + " km");
		System.out.println("Farbe: " + this.farbe);
		if (this.unfallwagen == false) {
			System.out.println("unfallfrei");
		}
		System.out.println("---");
	}
	
	// Methode zur Sortierung (absteigend)
	public static void bubbleSort(int[] autos) {
		boolean unsorted = true;
		while (unsorted) {
			unsorted = false;
			for (int i=0; i < autos.length-1; i++) {
				if ((autos[i] <= autos[i+1])) {
					int dummy = autos[i];
					autos[i] = autos[i+1];
					autos[i+1] = dummy;
					unsorted = true;
				}
			}
		}
	}
	
}
