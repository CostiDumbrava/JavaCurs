package curs12homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Scriem un program care reprezinta un catalog.
 * Contine Numele si Notele unor elevi (un nume, o nota de fiecare)
 * Intrebam elevul cum il cheama si ce nota a luat.
 * Daca elevul nu se regaseste in catalogul existent il adaugam cu tot cu nota si printam “Nu aveai nota, ti-am trecut acum!”
 * Daca elevul se regaseste si nota este mai mica decat nota existenta in catalog, printam “Nu ai nevoie de alta nota”
 * Daca elevul se regasete si noua nota este mai mare decat nota din catalog, facem update catalogului cu noua nota.
 * La final indiferent de situatie printam catalogul.
 */

public class Catalog {
	
	public static void main(String[] args) {
	
		Map <String, Integer> elev = new HashMap<>();
		
		elev.put("Matei",7);
		elev.put("Andrei",10);
		elev.put("Carmen",5);
		elev.put("Oana",9);
		elev.put("Mihai",8);
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Cum te numesti?");
		String nume = scan.next();
		
		int nota=0;
		boolean flag = true;
		
		while ((nota <= 0) || (nota > 10)) {
			
		System.out.println("Ce nota ai primit? Introdu valori intre 1 si 10!");
		
		do {
		try {	
			nota = Integer.parseInt(scan.next());
			flag = false;
			
			} catch(NumberFormatException e) {
				System.out.println("Introdu numai valori numerice!");
				continue;
			}	
		}
		while(flag);
		
		}
		
		
		boolean prezent = elev.containsKey(nume);
		
		if (!prezent) {
	        elev.put(nume,nota);
			System.out.println("Nu aveai nota, ti-am trecut acum!");
			
					
		} else if ((prezent) && (nota <= elev.get(nume))) {
			System.out.println("Nu ai nevoie de alta nota!");
			
		} else {
			 elev.put(nume,nota);
	    }
		System.out.println(elev);
		}
	}


