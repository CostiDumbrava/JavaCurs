package curs8;

import java.util.Scanner;

/*
 * intrebam userul un calificativ
 * in functie de calificativ printam:
 * A-->Felicitari!
 * B-->Destul de bine!
 * C-->Suficient!
 * D-->Insuficient!
 * Daca introduce alt calificati, printam : calificativ invalid
 * 
 */

public class SwitchExample {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu un calificativ: ");
		String calificativ = scan.next().toUpperCase();
		                 //intru cu el direct transformat in litere mari
		
		// if 
		
		if (calificativ.equals("A") || calificativ.equals("a") ) {
			    //nu e oprit in felul asta sa adaugam ambele variante 
			System.out.println("Felicitari!");
		}else if (calificativ.equalsIgnoreCase("B")) {
			   //ignora literele mari sau mici
			System.out.println("Destul de bine!");
		}else if (calificativ.equals("C")) {
			System.out.println("Suficient!");
		}else if (calificativ.equals("D")) {
			System.out.println("Insuficient!");
		}else if (calificativ.equals("D")) {
			System.out.println("Calificativ invalid");
		}
		
			System.out.println("================================");
		
		//switch
		switch(calificativ) {
		case "A" : 
			System.out.println("Felicitari!");
			break;
		case "B" : 
			System.out.println("Destul de bine!");
			break;
		case "C" : 
			System.out.println("Suficient!");
			break;
		case "D" : 
			System.out.println("Insuficient!");
			break;
		default:
			System.out.println("Calificativ invalid");
		}
System.out.println("================================");
		
		//enhanced switch

       switch(calificativ) {
       
       case "A" -> System.out.println("Felicitari!");
       case "B" -> System.out.println("Destul de bine!");
       case "C" -> System.out.println("Suficient!");
       case "D" -> System.out.println("Insuficient!");
       default -> System.out.println("Calificativ invalid");
       
       }
		
		}	
		
	
		
}



