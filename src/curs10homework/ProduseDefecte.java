package curs10homework;

public class ProduseDefecte extends Product{
	
	int defect;
	
	public int getDefect() {
		return defect;
	}


	public void setDefect(int defect) {
		this.defect = defect;
	}


	public int rezultat() {
		
		return cantitate - defect; 
	}
	
}
