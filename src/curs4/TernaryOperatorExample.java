package curs4;
/*
 * intrebam doua numere de la tastatura
 * verificam fiecare numar daca este pozitiv si printa nr este pozitiv sau numarul nu este pozitiv
 * verificam daca ambele numere sunt pozitive
 * verificam care este cel mai mic sau daca sunt egale
 */

import java.util.Scanner;

public class TernaryOperatorExample {

	public static void main(String[] args) {
		
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = scan.nextInt();
		System.out.println("Enter first number: ");
		num2 = scan.nextInt();
		
		//verificam daca primul nr este pozitiv
		
		if (num1>0) {
			System.out.println("Num1 este pozitiv");
		} else {
			System.out.println("Num1 este negativ");
		}
		
		//conditie ? expresie true : expresie false
		
		String result = (num1>0) ? "Num1 este pozitiv" : "Num1 este negativ";
		System.out.println(result);
		
		//verificam daca al doilea numar este pozitiv
		
		result = (num2>0) ? "Num2 este pozitiv" : "Num2 este negativ";
		System.out.println(result);
		
		//daca ambele nr sunt popzitive 
		
		result = (num1>0) && (num2>0) ? "Ambele numere sunt pozitive" : "Cel putin un numar este negativ";
		System.out.println(result);
		
		//verificam care este mai mic sau daca sunt egale
		result = (num1>num2) ? "Num1 este mai mare" : (num1<num2) ? "Num1 este mai mic" : "Sunt egale";
			System.out.println(result);
	}

}
