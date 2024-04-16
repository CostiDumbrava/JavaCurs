package curs10homework;

public class ProduseExpirate extends Product{
	
	int expirat;
	
	public ProduseExpirate(int expirat, int cantitate) {
		this.expirat = expirat;
		this.cantitate = cantitate;
	}
	
    @Override
	
	public int cantitateDisponibila() {
		
		return cantitate - expirat;
	
}

	

}
