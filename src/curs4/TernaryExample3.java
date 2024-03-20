package curs4;


/*
 * verific daca cosul este gol si printam cos gol sau nu
 * verific daca total cos este peste 100
 * verific daca numarul de produse este mai mare ca 5 si total cos este mai mare 120
 * printez numarul de produse este mare si total cos este mare
 * printez numar de produse este mai mic si totalul este mic
 */

public class TernaryExample3 {
	
	public static void main(String[] args) {
		
		int totalCosCumparaturi = 120;
		int numarProduseInCos = 3;
		
		 //verific daca cosul este gol si printam cos gol sau nu
		String mesaj = (numarProduseInCos == 0) ? "Cosul este gol" : "Cosul nu este gol";
		System.out.println(mesaj);
		
		//verific daca total cos este peste 100
		mesaj = (totalCosCumparaturi > 100) ? "Total cumparaturi peste 100" : "Total cumparaturi sub 100";
		System.out.println(mesaj);
	}

}
