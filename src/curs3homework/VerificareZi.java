package curs3homework;

import java.util.Scanner;

/*Scriem un program care intreaba utilizatorul ce zi este astazi.
* Utilizatorul trebuie sa introduca un numar de la 1 -7
* Daca introduce zero – printam “Te rog sa introduci un numar mai mare ca 0”
* Daca introduce 1 – printam “Astazi este luni”
* Daca introuce 2 – Printam ”Astazi este marti”
* Si tot asa pana duminica
* Daca introduce un numar mai mare ca 7 printam : ”Saptamana are doar 7 zile te rog sa introduci un numar valid”
 */

public class VerificareZi {
	
	int num;
	
	public void askDay() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Ce zi este astazi? ");
	num = scan.nextInt();
	}
	
    public void verificaZi() {
    	if (num == 0) {
    		System.out.println("Te rog sa introduci un numar mai mare ca 0");
    		}else if (num == 1) {
    			System.out.println("Astazi este luni");
    		}else if (num == 2) {
    			System.out.println("Astazi este marti");
    		}else if (num == 3) {
    			System.out.println("Astazi este miercuri");
    		}else if (num == 4) {
    			System.out.println("Astazi este joi");
    		}else if (num == 5) {
    			System.out.println("Astazi este vineri");
    		}else if (num == 6) {
    			System.out.println("Astazi este sambata");
    		}else if (num == 7) {
    			System.out.println("Astazi este duminica");
    		}else {
    			System.out.println("Saptamana are doar 7 zile, te rog sa introduci un numar valid");
    		}
    }
	

}
