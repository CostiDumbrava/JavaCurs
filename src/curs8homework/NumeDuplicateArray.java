package curs8homework;
/*
 * Scriem un program care verifica daca avem nume duplicate in urmatorul array :
 * String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana","Bogdan", "Oana", "Ion"};
 * Daca le gaseste , printeaza :
 * Nume duplicat Ion
 * Nume duplicat Oana
 * 
 */

public class NumeDuplicateArray {

	public static void main(String[] args) {
		
		String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana","Bogdan", "Oana", "Ion"};
		
		
		for (int i=0; i<myStringArray.length; i++) {
			for (int j=i+1; j<myStringArray.length; j++) {
				if (myStringArray[i] == myStringArray[j]) {
					System.out.println("Nume duplicat " + myStringArray[i]);
					
				}
				
			}
		}
		

	}

}
