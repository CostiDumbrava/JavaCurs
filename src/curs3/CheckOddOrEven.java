package curs3;

import java.util.Scanner;

public class CheckOddOrEven {
	
	int numar;

	public void askTheUserForANumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		numar = scan.nextInt();
		// nu mai pun int - ar fi o noua variabila si nu cea din clasa
		}
	
	
	public void checkNrIsOddOrEven() {
		
		//chem direct metoda aici pentr numar
		askTheUserForANumber();
		
		if (numar % 2 ==0) {
			System.out.println("Number is even!");
					} else {
						System.out.println("Number is odd!");
					}
		
	}
	
	
}
