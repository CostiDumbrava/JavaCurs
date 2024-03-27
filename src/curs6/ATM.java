package curs6;

import java.util.Scanner;

/*
 * program care simuleaza un ATM
 * are o singura functionalitate, de retragere (retrageri multiple)
 * nu permite retragere mai mare decat soldul
 * intrebam user ul dupa fiecare operatiune daca vrea sa faca exit sau nu
 * 
 * soldul initial este 4500;
 */

public class ATM {
	
	
	public static void main(String[] args) {
		
		int soldInitial = 4500;
		boolean raspuns = true;
		Scanner scan = new Scanner(System.in);	
		
		while (raspuns) {
			System.out.println("Ce suma vrei sa retragi? ");
			int sumaRetrasa = scan.nextInt();
			if (sumaRetrasa <= soldInitial && sumaRetrasa>0) {
				soldInitial = soldInitial - sumaRetrasa;
				System.out.println("Noul sold este " +soldInitial);
			}else if (sumaRetrasa > soldInitial){
				System.out.println("Suma depaseste soldul");
				
			}else {
				System.out.println("Suma invalida");
			}
			
			System.out.println("Vrei sa continui?");
			raspuns = scan.nextBoolean();
		}
		System.out.println("La revedere!");	
	}

}
