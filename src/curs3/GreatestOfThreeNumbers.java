package curs3;

import java.util.Scanner;

/*facem un program care citeste 3 numere de la tastatura
 * verifica care dintre ele este cel mai mare si printeaza in consola (ex: Num1 este cel mai mare)
 * verifica si daca numerele sunt egale (cele mai mari) "Numerele sunt egale"
 */
public class GreatestOfThreeNumbers {
	
	int nr1, nr2, nr3;
	
	public void askThreeNumbers() {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		nr1 = obj.nextInt();
		System.out.println("Please enter second number: ");
		nr2 = obj.nextInt();
		System.out.println("Please enter third number: ");
		nr3 = obj.nextInt();
	}
	
	public void compareTheNumbers () {
		askThreeNumbers();
		
		  if (nr1 > nr2 && nr1 > nr3 ) {
			System.out.println("Nr1 is the greatest");	
		} else if (nr2 > nr1 && nr2 > nr3 ) {
			System.out.println("Nr2 is the greatest");
		} else if (nr3 > nr1 && nr3 > nr1 ) {
			System.out.println("Nr3 is the greatest");
		} else { System.out.println("Numbers are equal");
			
		}
	}

}
