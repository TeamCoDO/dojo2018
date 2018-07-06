package de.codingdojo.listen;

public class VergleichName {
	public int compare(Object o1, Object o2) {
    	Person person1 = (Person) o1;
    	if (person1.getName().equals(person1.getName())) {
			return 1;
		} else {
			return -1;
		}
    	
    }
}
