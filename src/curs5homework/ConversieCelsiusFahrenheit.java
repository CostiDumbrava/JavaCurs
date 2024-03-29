package curs5homework;

import java.util.Scanner;

//°F = (°C × 1,8) + 32


public class ConversieCelsiusFahrenheit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Scanner temperatura = new Scanner(System.in);
		System.out.println("Introduceti numarul de valori ce vor fi transformate din grade Celsius in grade Fahrenheit :");
		int numarValori = scan.nextInt();
		
		if (numarValori != 0) {
			System.out.println("Introduceti o valoare de temperatura : ");
		       } else {System.out.println("La revedere!");}
		
		for (int i= 1; i<= numarValori; i++) {
			double x;
			
			x = temperatura.nextDouble();
			System.out.println("Temperatura Celsiu de " +x + " grade este in Fahrenheit " + (x*1.82+32) + " grade." + "\n");
			
			
			if (i<numarValori) {
				System.out.println("Introduceti urmatoarea valoare de temperatura : ");
				} else {System.out.println("La revedere!");}
		}

	}

}
