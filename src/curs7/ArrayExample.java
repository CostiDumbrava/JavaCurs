package curs7;

import java.util.Arrays;

//array cu o singura dimensiune

public class ArrayExample {

	public static void main(String[] args) {
	String[] textArray = new String[4]; // am creat un array nou cu marimea de 4, trebuie declarat de la inceput marimea in totdeauna nu este redimensionabil
  //String[]  textArray = {null, null, null, null}
 //index - mereu de la zero 0     1     2     3
	System.err.println(textArray[0]);
	textArray[0] = "Acesta";
//String[]  textArray = {Acesta, null, null, null}
//index                     0     1     2     3
	textArray[1] = " este ";
	
	//String[]  textArray = {Acesta, este, null, null}
	//index                     0     1     2     3
	textArray[2] = " un ";
	textArray[3] = " aray ";
	//String[]  textArray = {Acesta, este, un, array}
	
	System.out.println(textArray);
	
	System.out.println(Arrays.toString(textArray));
	                    //din Java
	
	System.out.println("-------------------------");
	
	for (int i=0; i<textArray.length; i++) {
		System.out.print(textArray[i]);
		
	}
	
	System.out.println("\n-------------------------");
	
	
	//for each - pentru ca ia fiecare element in parte
	for(String element : textArray) {
		System.out.print(element);
		
	}
}
}
