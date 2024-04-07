package curs8homework;

import java.util.Scanner;

/*
 * Scriem un program care simuleaza un program de acordat bonusuri
 * 
 * Programul primeste input de la utilizator :
 * Anii de vechime in firma
 * Valoarea vanzarilor efectuate
 * Luna in care a efectuat vanzarile
 * 
 * Daca are un an vechime atunci primeste un bonus de 100
 * Daca are 2 ani vechime atunci primeste un bonus de 200
 * 
 * Daca are 3 ani vechime si valoarea vanzarilor este mai mica sau egala cu 5000 atunci primeste bonus 600
 * Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si vanzarile au fost efectuate in oricare din lunile 1-6 primeste bonus 800
 * Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si vanzarile au fost efectuate in oricare din lunile 7-11 primeste bonus 1000
 * Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si vanzarile au fost efectuate in luna 12 primeste bonus 900 si mesajul : “In decembrie se vand singure!”
 * Daca are 3 ani si valoarea vanzarilor este mai mare decat 10000 primeste bonus 1200
 * 
 */

public class Bonusuri {

	public static void main(String[] args) {
		
		final int BONUS1 = 100;
		final int BONUS2 = 200;
		final int BONUS3 = 600;
		final int BONUS4 = 800;
		final int BONUS5 = 1000;
		final int BONUS6 = 900;
		final int BONUS7 = 1200;
		
		final int VAL_VANZARI1 =5000;
		final int VAL_VANZARI2 =10000;
		int vechime;
		int vanzari;
		int luna =0;
		boolean flag1 = false;
		boolean flag2 = false;
		String result =  null;
		
		Scanner scan =new Scanner(System.in);
		
		do {
			System.out.println("Introduceti vechimea pe care o aveti in firma, valoare pozitiva: ");
			vechime = scan.nextInt();
			} while (vechime < 0);
		
		do  {
			System.out.println("Introduceti valoarea vanzarilor efectuate, valoare pozitiva: ");
			vanzari = scan.nextInt();	
			
		}while (vanzari < 0);
		
		
		do {
			System.out.println("Introduceti luna in care s-au efectuat vanzarile: ");
			luna = scan.nextInt();			
		}while (luna < 1 || luna >12);
		

			
			switch(vechime) {
			case 0 -> System.out.println("Nu primiti bonus."); 
			case 1 -> System.out.println("Felicitari, primiti bonus: " +BONUS1); 
			case 2 -> System.out.println("Felicitari, primiti bonus: " +BONUS2); 
			default -> flag1 = true;
			}
			
			if (flag1) {	
		      if (vanzari<= VAL_VANZARI1) { 
				result = "A";}
			
			if ((vanzari > VAL_VANZARI1) && (vanzari <=VAL_VANZARI2)){
				result = (luna ==12) ? "D" : (luna <= 6) ? "B" : "C"; }		
			
			if ((vanzari > VAL_VANZARI2)) { 
				result = "E";}
			
			switch(result) {
			case "A" -> System.out.println("Felicitari, primiti bonus: " +BONUS3); 
			case "B" -> System.out.println("Felicitari, primiti bonus: " +BONUS4); 
			case "C" -> System.out.println("Felicitari, primiti bonus: " +BONUS5); 
			case "D" -> System.out.println("Primiti bonus: " +BONUS6 +"." +" In decembrie se vand singure! "); 
			case "E" -> System.out.println("Felicitari, primiti bonus: " +BONUS7); 
			}
			}
	}
}

