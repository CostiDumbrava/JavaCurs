package curs10homework;

import java.util.Scanner;

public class TestProduct extends Product {
	
	
	public static void main(String[] args) {
		
		int defect;
		int expirat;
		
		Scanner scan = new Scanner(System.in);
		
		do {
		System.out.println("Introduceti numarul total al produselor = ");
		cantitate = scan.nextInt();
		} while (cantitate <= 0);
		
		
		do {
		System.out.println("Introduceti numarul produselor defecte = ");
		defect = scan.nextInt(); 
		} while (defect < 0 || defect > cantitate );
		

		do {
		System.out.println("Introduceti numarul produselor expirate = ");
		expirat = scan.nextInt();
		} while (expirat < 0 || expirat > (cantitate-defect)); // am continuat pe cazul in care nu se introduce un numar mai mare de produse expirate decat ce a ramas disponibil
		
		
		
		ProduseDefecte obj1 = new ProduseDefecte(defect,cantitate);
		
       		
		cantitate = obj1.cantitateDisponibila(); 
		
	
		ProduseExpirate obj2 = new ProduseExpirate(expirat,cantitate);
		
		
		System.out.println("Numarul produselor disponibile este : " +obj2.cantitateDisponibila() + ".");
		
}
}
