package de.codingdojo.listen;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ExcelParser {	
	HashMap<String, List<String>> jahreMap;
	HashMap<String, List<String>> namenMap;
	
	private List<Personen> parseExcel(String excelInput){
		String array[] = excelInput.split(",");
		List<Personen> perslist = new ArrayList<Personen>();
		for (String obj: array){
			if (!Character.isDigit(obj.charAt(0))){
				Personen pers = new Personen();
				pers.setName(obj);
				perslist.add(pers);
			}			
		}
		
		int j = -1;
		for (int i = 0; i < array.length; i++){
			if (Character.isDigit(array[i].charAt(0))){
				Personen p = perslist.get(++j);				
				p.setJahr(array[i]);								
			}			
		}
		
		return perslist;
	}
	
	private void createPersListen(ArrayList<Personen> perslist){
		jahreMap = new HashMap<String, List<String>>();
		namenMap = new HashMap<String, List<String>>();	
		Collections.sort(perslist);		
		
		for (Personen p: perslist){
			
			//alle Namen zum Jahr
			if (!jahreMap.containsKey(p.getJahr())){
				List<String> namen = new LinkedList<String>();
				namen.add(p.getName());
				jahreMap.put(p.getJahr(), namen);	
			}
			else{
				List<String> namen = jahreMap.get(p.getJahr());
				namen.add(p.getName());
				
			}
			
			//alle Jahre zum Namen
			if (!namenMap.containsKey(p.getName())){
				List<String> jahre = new LinkedList<String>();
				jahre.add(p.getJahr());
				namenMap.put(p.getName(), jahre);	
			}
			else{
				List<String> jahre = namenMap.get(p.getName());
				jahre.add(p.getJahr());
			}
		}
		
	}
	
	
	private  HashMap<String, List<String>> createDuplikatListe(HashMap<String, List<String>> jahresliste){
		HashMap<String, List<String>> dupList = new HashMap<String, List<String>>();
		for (String s: jahresliste.keySet()){
			if (jahresliste.get(s).size() > 1){
				dupList.put(s, jahresliste.get(s));
			}
		}
		return dupList;
	}
	
	private String gibHoechstesJahrZumNamen(String name){
		List<String> jahre = getJahreMap().get(name);		
		return jahre.get(jahre.size()-1);
		
	}
	
	private List<String> gibNamenZumjahr(String jahr){
		return getNamenMap().get(jahr);
	}
	
//	public static boolean pruefeInhalt(String excelString, List<Personen> parseList){
//		
//	}

	public HashMap<String, List<String>> getJahreMap() {
		return jahreMap;
	}

	public void setJahreMap(HashMap<String, List<String>> jahreMap) {
		this.jahreMap = jahreMap;
	}

	public HashMap<String, List<String>> getNamenMap() {
		return namenMap;
	}

	public void setNamenMap(HashMap<String, List<String>> namenMap) {
		this.namenMap = namenMap;
	}
}
