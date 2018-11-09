package de.codingdojo.gruppieren;

import java.util.HashMap;
import java.util.Map;

public class PersonPlus {
  private String name;
  private int jahr;
  private int id;
  private int abteilung;
  private String tarif;
  private String leitung;
  
  
  /** leerer Konstruktor
   * 
   */
  
  private PersonPlus () {
	  Map <String, Integer> osPlusPersonen = new HashMap<String, Integer>();
	  osPlusPersonen.put("Peter Meier", 2012);
	  osPlusPersonen.put("Lara Miller", 2015);
	  osPlusPersonen.put("Peter Meier", 2015);
	  osPlusPersonen.put("Tatjana Frank", 2013);
	  osPlusPersonen.put("Danny Mende", 2011);
	  osPlusPersonen.put("Kathrin Storm", 2013);
  }
  
  /** Konstruktor füllen Klassenvariable
   * 
   */
  public PersonPlus (final String person) {
	  String[] teile = person.split(",");
	  name = teile[0].trim();
	  jahr = Integer.parseInt(teile[1].trim());
	  id = Integer.parseInt(teile[2].trim());
	  abteilung = Integer.parseInt(teile[3].trim());
	  tarif = teile[4].trim();
	  leitung = teile[5].trim();
  }
  
  /** Konstruktor füllen Klassenvariable
   * 
   */
  public PersonPlus (final String name, int jahr) {
	  this.name = name;
	  this.jahr = jahr;
  }
  
  public String getName() {
	  return name;
  }
  
  public int getJahr() {
	  return jahr;
  }
  
}
