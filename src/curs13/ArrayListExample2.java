package curs13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		
		//clasa Arrays, clasa parinte
		
		List<String> list = new ArrayList<>(Arrays.asList("Iasi","Cluj","Pitesti","Constanta","Ploiesti","Arad"));
		System.out.println(list.size());

		list.add("Oradea");
		
		System.out.println(list.size());
		
		System.out.println(list);
		
		//[Iasi, Cluj, Pitesti, Constanta, Ploiesti, Arad, Oradea]
		//  0      1       2         3         4       5      6		
		//metoda subList din Java
		
		System.out.println(list.subList(0, 3));
		
		//[Iasi, Cluj, Pitesti] - indexul de sfarsit nu este inclus, printeaza doar pana la index 2
		
		List<String> subLista = list.subList(0, 0); // asa creem o sublista mai mica dintr o lista mai mare
		
		list.subList(0, 5).get(3); // poti folosi clasa subList si ai toate metodele unei subliste
		list.subList(0, 5).clear(); //sterge toate elementele pana la 5
		
	}

}
