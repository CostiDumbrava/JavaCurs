package curs11;

public abstract class Product {
	
	//public abstract String numeProdus; la variabile nu se aplica povestea abstracta
	
	public abstract int calculatePrice();
	// se bazeaza pe clasele copil pt implementare
	
	
	public void productRating() {
		
		System.out.println("The best price");
		
	}

}
