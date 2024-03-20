package curs4;
/*
 * scriem un program de tip calculator care calculeaza TVA pt o suma
 * TVA ul poate avea multiple valori, o sa il atribuim cand facem obiectul
 * afisam calculul pentru valori diferite
 * afisam numarul total de calcule TVA pe care le facem
 */

public class CalculatorTVA {

	private double tvaDouble;
	private static int nrCalculTotal;
	
	public CalculatorTVA(int tva) {
		this.tvaDouble = tva/100.0;
	}
	
	public double adunaTVA ( double suma) {
		nrCalculTotal++; //nrCalculTotal = nrCalculTotal +1;
		return suma * (1+tvaDouble);
		
	}
	
	//metoda statica cum e si valoarea 
	public static int getNrCalculTotat() {
	return nrCalculTotal;
}
}
