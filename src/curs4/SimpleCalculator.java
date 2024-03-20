package curs4;

import java.util.Scanner;

/*facem un program care simuleaza un calculator de baza
 * stie doar adunare(+), scadere(-), inmultire (*)  --x, impartire (/)  -- :
 * printam rezultatul sub forma ex: 2 + 2 = 4
 * intrebam userul primul numar
 * intrebam operatia matematica
 * intrebam al doilea numar
 * printam
 * 
 */
public class SimpleCalculator {

	int num1, num2, result;
	char operatie;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu primul numar : ");
		num1 = scan.nextInt();
		System.out.println("Introdu operatia matematica : ");
		operatie = scan.next().charAt(0);
		System.out.println("Introdu al doilea numar : ");
		num2 = scan.nextInt();
		
	}
	
	public void calculeazaValori () {
		askTheUser();
		if (operatie == '+') {
			result = num1 + num2;
			printeazaValori();
		} else if (operatie == '-') {
			result = num1 - num2;
			printeazaValori();
		}else if (operatie =='*' || operatie == 'x') {
			result = num1*num2;
			printeazaValori();
			
		}else if (operatie =='/' || operatie == ':') {
			result = num1/num2;
			printeazaValori();
		} else {System.out.println("Operatie invalida!");
			
		}
	}
	
	public void printeazaValori() {
		System.out.println(num1 + " " + operatie + " " +num2 + " = " +result);
	}
	
}
