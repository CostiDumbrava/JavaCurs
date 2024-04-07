package curs8homework;

import java.util.Scanner;

/*
 * Scriem un program care ii cere userului 10 numere. Va pune acele numere intr-un array si va calcula suma lor.
 * La final va printa suma numerelor
 * 
 */

public class SumaArray {

	public static void main(String[] args) {
		final int ARRAY_LENGHT = 10;
		int [] numbers = new int[ARRAY_LENGHT]; 
		Scanner scan = new Scanner(System.in);
		int sum=0;
		
		System.out.println("Introduceti numerele de la tastatura: ");
		
		for(int i=0; i<numbers.length; i++) {
			
			System.out.print("Numarul " +i +" este: ");
			numbers[i]=scan.nextInt();
			sum+=numbers[i];
			
			
		}
		
		System.out.println("Suma numerelor este: " +sum);
	}

}
