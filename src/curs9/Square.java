package curs9;

public class Square extends Shape {

	public Square(String nume, String culoare) {
		super(nume, culoare);// super este referinata catre clasa parinte deaorece clasa parinte are constructor
		                     // atunci si clasa copil are nevoie de constructor
	}
	
	String nume = "oval";
	String culoare = "verde";
	
	public void printDetails() {
		
		System.out.println("Numele este " +super.nume + " si culoarea este " +super.culoare);
	}
	

}
