package de.codingdojo.gruppieren;

import java.util.HashMap;
import java.util.Map;

public class PersonMUC {
	  private String name;
	  private int year;
	  private int id;
	  private String department;
	  private String manager;
	  private int salary;
	  private String vacation;
	  
	  
	  /** leerer Konstruktor
	   * 
	   */
	  
	  private PersonMUC () {
		  Map <String, Integer> mucPersonen = new HashMap<String, Integer>();
		  mucPersonen.put("Peter Meier", 2012);
		  mucPersonen.put("Lara Miller", 2015);
		  mucPersonen.put("Peter Meier", 2014);
		  mucPersonen.put("Tatjana Frank", 2013);
		  mucPersonen.put("Danny Mende", 2010);
		  mucPersonen.put("Kathrin Storm", 2013);
	  }
	  
	  /** Konstruktor füllen Klassenvariable
	   * 
	   */
	  public PersonMUC (final String person) {
		  String[] teile = person.split(",");
		  name = teile[0].trim();
		  year = Integer.parseInt(teile[1].trim());
		  id = Integer.parseInt(teile[2].trim());
		  department = teile[3].trim();
		  manager = teile[4].trim();
		  salary = Integer.parseInt(teile[5].trim());
		  vacation = teile[6].trim();
	  }
	  
	  /** Konstruktor füllen Klassenvariable
	   * 
	   */
	  public PersonMUC (final String name, int jahr) {
		  this.name = name;
		  this.year = jahr;
	  }

	  public String getName() {
		  return name;
	  }
	  
	  public int getYear() {
		  return year;
	  }
	  
}
