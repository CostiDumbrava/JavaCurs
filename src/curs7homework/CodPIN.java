package curs7homework;

import java.util.Scanner;

/*
 * Scriem un program care simuleaza validarea unui cod PIN.
 * Programul primeste input de la utilizator un PIN si il compara cu un PIN default care are valoarea 2244
 * Are trei incercari de acces
 * Atata timp cat incearca de trei ori si PIN este gresit programul va printa :“Maximum attempts reached. Card blocked”
 * Pentru fiecare incercare gresita programul printeaza : “Wrong PIN”
 * Daca PIN este valid programmul printeaza : “Acces granted”
 * 
 */
public class CodPIN {

	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	final int NR_INCERCARI = 3;
	final int DEFAULT_PIN = 2244;
	int cod;
	boolean flag = false;
	
	for(int i=0;i<NR_INCERCARI; i++) {
		System.out.println("Introduceti PIN-ul: ");
		cod = scan.nextInt();
		if (cod == DEFAULT_PIN) {
			System.out.println("Acces granted");
			flag = true;
			break;
		} else System.out.println("Wrong PIN");
		
	}
	if (!flag) {
		System.out.println("Maximum attempts reached. Card blocked");	
	}
	
	
	
	}
}
