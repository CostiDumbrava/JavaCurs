package curs10homework;

public class TestProduct{

	public static void main(String[] args) {
		
		Product obj = new Product();
		ProduseDefecte obj1 = new ProduseDefecte();
		ProduseExpirate obj2 = new ProduseExpirate();
		

		obj.setNume("ciocolata");
		obj.setCantitate(100);
		obj1.setDefect(5);
		obj2.setExpirat(7);
		
		int disponibil;
		
		disponibil = obj1.rezultat() + obj2.rezultat();
	
		
		System.out.println(disponibil);
		

	}

}
