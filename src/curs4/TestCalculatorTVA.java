package curs4;

public class TestCalculatorTVA {

	public static void main(String[] args) {
		
		CalculatorTVA calc1= new CalculatorTVA(5);
		CalculatorTVA calc2= new CalculatorTVA(9);
		CalculatorTVA calc3= new CalculatorTVA(19);
		
		double rezult1 = calc1.adunaTVA(70.0);
		double rezult2 = calc2.adunaTVA(30);
		double rezult3 = calc3.adunaTVA(45.0);
		
		System.out.println("Rezultat adunare 1 : " + rezult1);
		System.out.println("Rezultat adunare 2 : " + rezult2);
		System.out.println("Rezultat adunare 3 : " + rezult3);
		
		System.out.println("Nr total de calcule: " + CalculatorTVA.getNrCalculTotat());  //apelam direct pe clasa
	}
}
