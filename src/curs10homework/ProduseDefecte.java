package curs10homework;

public class ProduseDefecte extends Product{

	int defect;
	
	public ProduseDefecte(int defect, int cantitate) {
		this.defect = defect;
		this.cantitate = cantitate;
	}
	
	
	@Override
	
	public int cantitateDisponibila() {
		
		return cantitate - defect;
			
		}
	
}
