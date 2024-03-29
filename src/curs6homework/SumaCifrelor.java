package curs6homework;

import java.util.Scanner;

/*
 * Scriem un program care calculeaza suma cifrelor unui numar.
 * Numarul in primim de la tastatura.
 * Ex; Daca user-ul introduce numarul : 334
 * Suma numerelor este 10
 * 
 */

public class SumaCifrelor {
	
	

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int numar = scan.nextInt();
		int sum = 0;
		
		do {
			sum += numar % 10;
			numar = numar/10; 
			
		}while (numar > 0);
		
		System.out.println("Suma cifrelor numarului este: " +sum);
	}

}
