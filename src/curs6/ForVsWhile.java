package curs6;

import java.util.Scanner;

/*
 * avem un program care cere numere in continuu de la user
 * le inmulteste cu 10 si le printeaza
 * faca asta pana cand userul introduce 0
 * cand userul a introdus 0 iese din bucla
 * 
 */



public class ForVsWhile {

	static int numar;
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//rezolvareCuFor();	
		//rezolvareCuFor2();	
		rezolvareCuWhile();


	}

	
	public static void rezolvareCuFor() {
		System.out.println("Introdu un numar:");
		
		for (numar = scan.nextInt(); numar !=0; numar = scan.nextInt()) {
			
			numar = numar*10;
			System.out.println(numar);
			System.out.println("Introdu un numar:");
			
		}			
		
	}
	
	public static void rezolvareCuFor2() {
		
		System.out.println("Introdu un numar:");
		//pot sa scriu un for cu 1,2,3 sau nici o conditie, trebuiesc doar delimitatoarele ;
		for(;;) {
			numar = scan.nextInt();
			if (numar==0) {
				break;
			}
			numar=numar*10;
			System.out.println(numar);
			System.out.println("Introdu un numar:");
		}
			
	}
	
	
	public static void rezolvareCuWhile() {
		System.out.println("Introdu un numar:");
		numar = scan.nextInt();
		
		while (numar !=0) {
			numar=numar*10;
			System.out.println(numar);
			System.out.println("Introdu un numar:");	
			numar = scan.nextInt();
		}
		
	}
}
