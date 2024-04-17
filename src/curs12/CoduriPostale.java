package curs12;

import java.util.HashMap;
import java.util.Map;

public class CoduriPostale {
	
	Map<Integer, String> map = new HashMap<>();
	
	public CoduriPostale() { //popularea mapului prin constructor
		
		map.put(100, "Pitesti");
		map.put(222, "Iasi");
		map.put(300, "Bacau");
		map.put(555, "Brasov");
		map.put(700, "Craiova");
			
	}
	
	// sau prin bloc de cod anonim, se executa si daca am mai multe map uri la fel, dar nu pot sa l apelez:
	//{
	//	map.put(100, "Pitesti");
	//	map.put(222, "Iasi");
	//	map.put(300, "Bacau");
	//	map.put(555, "Brasov");
	//	map.put(700, "Craiova");
	//}

	public String gasesteOras(int cod) throws PostalCodeException {
		
		if (map.containsKey(cod)) {
			
			return map.get(cod);
			
		}else {
			
			throw new PostalCodeException("Codul postal cautat nu exista!");
		}
	}
}
