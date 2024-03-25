package curs5;

import java.util.Scanner;

/*facem un program care cere un text de la tastatura
 * cautam litera b in text;
 * daca o gasim printam : litera B exista in text
 * daca o nu gasim, printam : litera B nu exista in text
 *rezolvare 1:
 *gasesc litera B, printez si ies
 *Rezolvare 2:
 *printez numarul de aparitii al literii B in text
 *
 */



public class LetterSearch {

	
	
	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
System.out.println("Please enter a text: ");
String text = scan.next().toLowerCase(); //  .toLowerCase() pentru a nu mai cauta b mic sau B mare, ci doar b mic

System.out.println(text.length());

//masina -- lungimea este 6
//012345
//masina --> String 
//masina.charAt(index);
//masina.charAt(4) == n
boolean amGasitLiteraB = false; //folosim un flag
int nrAparitii = 0;

for(int i=0; i <= text.length()-1; i++) {
	// sau i < text.length();

	if (text.charAt(i) == 'b' || text.charAt(i) == 'B')	{
		//amGasitLiteraB = true;
		//break;
		nrAparitii++;
	}
}
//if (amGasitLiteraB) {
//System.out.println("Am gasit lietra b");
//} else {
//	System.out.println("Nu am gasit litera b");
System.out.println("Nr aparitii litera B: " +nrAparitii);
}



	
	}


