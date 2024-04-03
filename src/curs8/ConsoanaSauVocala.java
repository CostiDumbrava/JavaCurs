package curs8;

import java.util.Scanner;

public class ConsoanaSauVocala {

	public static void main(String[] args) {
		
		System.out.println("Te rog introdu o litera: ");
		Scanner scan = new Scanner(System.in);
		char litera = scan.next().charAt(0);
		
		litera = Character.toLowerCase(litera);
		
		//aeiou
		
		if (litera== 'a' || litera== 'e' || litera== 'i' || litera== 'o' || litera== 'u' ) {
			
			System.out.println("Este vocala.");
		} else {
			System.out.println("Este consoana");
		}
		
		System.out.println("==============");
		
		switch(litera) {
		case 'a' :
		case 'e' :	
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("Este vocala");
			break;
		default :
			System.out.println("Este consoana");
		}
		
		System.out.println("==============");
		
		switch(litera) {
		case 'a', 'e', 'i', 'o','u' ->  System.out.println("Este vocala");
		default -> System.out.println("Este consoana");
		}

	}

}
