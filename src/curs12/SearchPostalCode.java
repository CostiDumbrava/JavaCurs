package curs12;

import java.util.Scanner;

/*
 * Facem un program care cauta pe baza unui cod postal si printeaza orasul aferent codului (fictiv)
 * avem o clasa care inca de la initializarea obiectului initializeaza si ea o serie de coduri postale si orase
 * avem o functionalitate care cauta pe baza codului si printeaza orasul: 
 * daca codul nu exista arunc o exceptie: PostalCodeException
 * si intreb din nou utilizarorul pana primesc cod postal corect
 */

public class SearchPostalCode {

	public static void main(String[] args) throws PostalCodeException {
		
		Scanner scan = new Scanner(System.in);
	
	CoduriPostale cp = new CoduriPostale();
	
	String oras = "";
	
	 while (oras.equals("")) {
		
		System.out.println("Introdu un cod postal: ");
		int codPostal = scan.nextInt();
				try {
			oras =cp.gasesteOras(codPostal);
			System.out.println(oras);
		
			
		} catch(PostalCodeException e) {
			System.out.println(e.getMessage());
			
		}
	}
	}
}


