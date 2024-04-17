package curs12;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();  // este la fel ca map o structura redimensionabila
		// lista este ordonata, functioneaza ca un array pe baza de index
		//ArrayList<String> list = new ArrayList<>(); se poate si asa
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("Oana");
		list.add("Ion");
		list.add("Maria");
		list.add("Gabriel");
		
		System.out.println("=================");
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println(list);  // mentine ordinea inserarii si pastreaza un index
		//pot sa accesez obiectele din interior pe baza de index
		
		System.out.println("=================");
		
		System.out.println(list.get(0));
		
		System.out.println("=================");
		
		for (String nume: list) {               //for each
			//System.out.println(nume);
			System.out.println(list.indexOf(nume) + " : " +nume);
			                    //acceseaza indexul 
		}
		
		System.out.println("=================");
		
		System.out.println(list.indexOf("Maria"));
		
		System.out.println("=================");
		
		System.out.println(list);
		
		list.add("Oana");
		//Oana, Ion, Maria, Gabriel, Oana
		//   0     1    2     3         4
		System.out.println(list); //accepta duplicate, adauga in continuare cu metoda add
		
		list.add(2, "Carmen"); // nu suprascrie, shifteaza de la 2 in colo celelalte elemente
		
       System.out.println("=================");
		
		System.out.println(list);
		
		//[Oana, Ion, Carmen, Maria, Gabriel, Oana]
        // 0     1    2     3         4        5
		
		//la fel daca sterg o pozitie, se shiftuieste inapoi si se micsoreaza marimea
		//la array daca stergeam o pozitie, ramanea null, dar marimea ramanea aceeasi
		
		 System.out.println("=================");
		 
		//[Oana, Ion, Carmen, Maria, Gabriel, Oana]
	        // 0     1    2     3         4        5
		
		 System.out.println(list.size());
		 //list.add(7,"Ioana"); // da eroare pt ca e in afara listei
		 
		 list.add(6,"Ioana");// functioneaza mereu cu +1 sau -1, dar nu poti sa te duci mai mult nu merge, nu poate lasa un slot liber intre
		 System.out.println("=================");
		 System.out.println(list);
		 //[Oana, Ion, Carmen, Maria, Gabriel, Oana, Ioana]
		 // 0     1    2     3         4        5      6
		 
		 list.set(5, "Luca"); // asa suprascrii, altfel cu add doar shiftuiesti dar nu inlocuiesti
		 
		 System.out.println("=================");
		 System.out.println(list);
		 //[Oana, Ion, Carmen, Maria, Gabriel, Luca, Ioana]
		  // 0     1    2     3         4        5      6
		 
		 boolean isInTheList = list.contains("Matei"); // aflu daca este continut un element
		 
		 System.out.println(isInTheList);
		 
		 System.out.println("=================");
		 
		 list.remove(4);
		 System.out.println(list);
		 //[Oana, Ion, Carmen, Maria, Luca, Ioana]
		 list.remove("Ion");
		 System.out.println("=================");
		 System.out.println(list);
		 //[Oana, Carmen, Maria, Luca, Ioana]
		 
		 System.out.println("=================");
		 list.clear();
		 System.out.println(list);
		 
		 //list.removeAll ()  -- sterge daca ai o lista in alta lista
		 
		 
		 
		 
	     
		 
		 
	}

}
