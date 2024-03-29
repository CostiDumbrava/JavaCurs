package curs5homework;

import java.util.Scanner;

public class SumaNumere {
	
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		double sum = 0;
		
		for (int i=1; i<=10; i++) {
			
			System.out.println("Please enter number " +i + ":");
			sum += scan.nextDouble();
			
						
		}
		System.out.println("Suma celor 10 numere este: " +sum);

	}

}
