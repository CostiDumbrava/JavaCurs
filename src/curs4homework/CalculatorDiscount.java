package curs4homework;

/*Scriem un program care aplica un discount unei facturi.
 * Daca factura este mai mare decat 100 aplica un discount de 10%
 * Daca factura este mai mica decat 100 aplica un discount de 5%
 * Printam rezultatul
 */

public class CalculatorDiscount {
	
private double discount;
private double result;

public void CalculatorDiscount(double factura) {
	
	double discount = factura >100 ? factura*0.1 : factura*0.05; 
	result = factura - discount;
	
	System.out.println("Reducerea aplicata este de: " +discount);
	System.out.println("Noua valoare a facturii cu discountul aplicat este: " + result);
	
}
}
