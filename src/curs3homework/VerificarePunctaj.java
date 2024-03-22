package curs3homework;

import java.util.Scanner;

public class VerificarePunctaj {
	
	int punctaj;
	
	public void askValue() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduceti punctajul : ");
		punctaj = scan.nextInt();	
		
	}
	
	public void verificaPunctaj() {
		
		if (punctaj >= 0 && punctaj <= 65) {
			System.out.println("Ai picat. Mai incearca");
		} else { 
			System.out.println("Felicitari, Ai trecut");
		}
	}

}
