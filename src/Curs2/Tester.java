package curs2;

/*
 * Conventie naming Java:
 * --numele claselor este UpperCamelCase Ex: ExempluVariabila
 * --nume metode si variabile este lowerCamelCase Ex: numeTester;
 * 
 * Bad practice in Java sa scriu clasa exemplu_clasa, acest mod se numeste snake si este folosit in Phyton
 * 
 */

public class Tester {

	//variabile
	String numeTester;  //string valoare default null
	int varstaTester; //numeric au valoare default 0
	
	//metoda
	public void afiseazaDetaliiTester() {
		System.out.println("Numele testerului este: " +numeTester);
		System.out.println("Varsta testerului este: "+varstaTester);
	    System.out.println("Lungimea numelui este: "+numeTester.length());
						
	}
	
	
	//constructor default 
	public Tester() {};
	
	
	//Tester tester1 = new Tester("Monica",34);
	public Tester(String numeTester, int varstaTester) {
		this.numeTester  = numeTester;
		this.varstaTester = varstaTester;
		
	};
	   
	
	
	
	
}
