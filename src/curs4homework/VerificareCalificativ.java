package curs4homework;

import java.util.Scanner;

/*
* Scriem un program care intreaba utilizatorul un punctaj.
*Daca utilizatorul introduce o valoare mai mare sau egala cu 90 ii
atribuim FB
*Daca utilizatorul introduce o valoare mai mare sau egala cu 80 ii
atribuim B
*Daca utilizatorul introduce o valoare mai mica decat 80 ii atribuim S
*Daca a luat calificativ FB printam : “Ai primit : FoarteBine”
*Daca a luat calificativ FB printam : “Ai primit : Bine”
*Daca a luat calificativ FB printam : “Ai primit : Suficient”
 */

public class VerificareCalificativ {
	
	int punctaj;
	
	public void askNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti punctajul dumneavoastra: ");
		punctaj = scan.nextInt();
	}

	public void verificaPunctaj() {
		
		String calificativ = punctaj >= 90 ? "Ai primit : Foarte Bine" : punctaj >= 80 && punctaj<90 ? "Ai primit : Bine" : "Ai primit : Suficient";
	System.out.println(calificativ);
	}
}
