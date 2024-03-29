package curs6homework;


/*
 * Folosind WHILE scriem un program care cere un numar de la tastatura si il printeaza inversat.
 * Ex : daca userul introduce 1234 , vom printa 4321
 * 
 * *(Math.pow(10, i))
 */

import java.util.Scanner;

public class NumarInversat {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int numar = scan.nextInt();
		int numarInversat=0;
		
		while (numar > 0) {
			
		 numarInversat = numarInversat*10 + (numar % 10);
		 numar = numar/10;	 
		 } 
		
		System.out.println("Numarul inversat este: " +numarInversat);
		
	}

	}


