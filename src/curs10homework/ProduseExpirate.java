package curs10homework;

public class ProduseExpirate extends Product{

	
	int expirat;
	
	public int getCantitate() {
		return cantitate;
	}

	public int getExpirat() {
		return expirat;
	}


	public void setExpirat(int expirat) {
		this.expirat = expirat;
	}


	public int rezultat() {
		
		return cantitate - expirat; 
		
	}
}
