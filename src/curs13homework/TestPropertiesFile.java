package curs13homework;

import java.util.Scanner;

public class TestPropertiesFile {

	public static void main(String[] args) {
		
		PropertiesFileCalories obj = new PropertiesFileCalories();
		
		obj.writePropertiesFile();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Scrieti ce leguma doriti: ");
		
		String cheie = scan.next(); 
		
	     if (obj.readPropertiesFile(cheie) != null) {
	    	
	    	 System.out.println("Leguma aleasa de tine are " + obj.readPropertiesFile(cheie) +" calorii.");
	    	 	    	 
	     }else System.out.println("Nu vindem aceasta leguma");
		
	}

}
