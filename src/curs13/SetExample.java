package curs13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
	
		Set<String> set = new HashSet<>();
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		set.add("mov");
		set.add("galben");
		set.add("alb");
		set.add("rosu");
		set.add("verde");
		set.add("negru");
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		System.out.println("=====================");
		System.out.println(set); //set ul nu are index
		
		//set.get -- nu exista, nu poti accesa direct un element din el
		
		for(String x: set) {
			System.out.println(x); // asa accesam toate elementele din structura
			
		}
		
		System.out.println("=====================");
		
		System.out.println(set.contains("maro"));
		System.out.println(set.contains("rosu"));
		
		//set ul nu accepta duplicate, de aceia e folosit mai ales, in rest e limitat
		
		System.out.println("=====================");
		
		set.add("mov");
		
		System.out.println(set); // nu l a adaugat pt ca deja exista acolo
		
		//[mov, galben, alb, rosu, verde, negru]
		
		set.remove("mov");
		System.out.println(set);
		//[galben, alb, rosu, verde, negru]
		
		System.out.println("=====================");
		
		//toate din clasa colections vin si cu iterator, este varianta cea mai folosita de a itera prin structura
		
		Iterator<String> iterator = set.iterator(); // este acelasi lucru cu for each ul de mai sus, doar ca e varianta mai veche decat for each
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
			set.clear();
			System.out.println(set.size());
			
		}
		
		

	}

}
