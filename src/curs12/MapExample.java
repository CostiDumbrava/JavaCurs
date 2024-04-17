package curs12;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		/*
		 * user=test
		 * cheie si valoare
		 */
		//clasa Map - eclasa parinte
		Map<String, String> map = new HashMap<>();		
		//pot fi si tipuri diferite..
		
		System.out.println(map.size());
		//intoarce marimea obiectului map
		System.out.println(map.isEmpty());
		
		map.put("T","Tester");
		map.put("D","Developer");
		map.put("M","Manager");
		map.put("S","Support");
		
		System.out.println("====================");
		
		System.out.println(map.size());
		System.out.println(map.isEmpty());	
		System.out.println(map);//map ul tine perechi de date
		
		System.out.println("====================");
		
		//get value from map
		System.out.println(map.get("M"));// asa accesam informatia din map - prin cheie
		
		System.out.println("====================");
		
		map.put("D","Director");
		System.out.println(map); // all keys in a map are unique
		                         //all keys are case sensitive
		
		System.out.println("====================");
		
		map.put("d","Developer");
		System.out.println(map);
		//values ca be duplicated, because are associated with key
		
		map.put("d","Director");
		System.out.println(map);
		
		System.out.println("====================");
		
		System.out.println(map.get("X"));
		map.put("B",null);
		System.out.println(map);
		System.out.println(map.get("B"));
		
		System.out.println("====================");
		
		for (String key: map.keySet()) {
			System.out.println(key); //asa accesez toate keile
		}
			
		System.out.println("====================");	
		
		for (String value: map.values()) {
			System.out.println(value); //asa parcurg toate valorile
		}
		System.out.println("====================");	
		
		
		boolean checkKey = map.containsKey("B");
		System.out.println(checkKey);
		
		boolean checkValue = map.containsValue("Test");
		System.out.println(checkValue);
		
		System.out.println("====================");	
		
		map.remove("d"); //daca stergem cheia se sterge si valoarea automat
		System.out.println(map);
		
		map.replace("S", "Sales"); //asa se updateaza o pereche, acelasi lucru face si put cand cheia nu este folosita deja
		System.out.println(map);
		
		map.replace("X", "Sales"); // X nu exista, si nu face nimic, dar nu da nici o eroare sau warning...
		System.out.println(map);
		
		System.out.println("====================");	
		
		//daca vrem sa stergem toate perechile din map folosim clear
		map.clear();
		System.out.println("====================");	
		
		System.out.println(map.size());
		//intoarce marimea obiectului map, acum este gol, pt ca a fost sters
		System.out.println(map.isEmpty());
		
		System.out.println("====================");	
		
		
		//map de adaugat in alt map
		Map<Integer, String> map1 = new HashMap<>(); // sintaxa map ului, set ului si listei este doar cu clase parinte pt tipurile primitive, nu pot folosi int, trebuie Integer
		map1.put(1,"Rosu");
		map1.put(2,"Alb");
		map1.put(3,"Galben");
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(8,"Violet");
		map2.put(7,"Negru");
		map2.put(6,"Verde");
		
		System.out.println("Map1 " +map1);
		System.out.println("Map2 " +map2);
		map1.putAll(map2);
		
		System.out.println("Map1 dupa putAll " +map1);
		String text; // String nu este data type primitv, este o clasa
		int number; //data type primitiv
		            //fiecare data type primitiv are o clasa parinte ca sa aduca metode in plus pentru folosirea data type ului
		
		
	}

}
