package curs3;

import java.util.Scanner;

/*
 * facem un program care citeste un numar de la tastatura
 * daca numarul este intre 1 si 5 printeaza: este zi lucratoare
 * daca numarul este 6 sau 7 printeaza: este weekend
 * daca numarul nu este intre 1 si 7 printeaza: Numar invalid.
 * 
 */

public class VerificareZiLucratoare {
	
	int zi;
	
	public void askTheUserForANumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		zi = scan.nextInt();
		// nu mai pun int - ar fi o noua variabila si nu cea din clasa
		}
	
	public void verificaZi() {
		askTheUserForANumber();
		//daca ies din clasa, nu pot sa apelez fara obiect
		
		// && AND
		// || OR
		
		if (zi>=1 && zi<=5) {System.out.println("Este zi lucratoare");
		} else if (zi==6 || zi==7) {System.out.println("Este weekend"); 
			
		} else {System.out.println("Zi invalida");
			
		}
	}
}
