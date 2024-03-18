package curs3;

import java.util.Scanner;

public class VerificareCaracter {
	
	char character;

	//masina
	//012345 = sir de caractere -> cuvantul masina
	
	public void askTheUserForACharacter(){
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a number : ");
			character = scan.next().charAt(0);
			// nu mai pun int - ar fi o noua variabila si nu cea din clasa
			}
	
	public void verificaDacaCaracterulEsteLitera() {
		
		askTheUserForACharacter();
		
		if(Character.isLetter(character)) {
			
			System.out.println("Caracterul este o litera");
						
		}else {
			System.out.println("Caracterul nu este o litera");
		}
		
	}
}



	
	
	
