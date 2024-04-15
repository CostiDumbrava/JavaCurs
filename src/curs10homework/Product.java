package curs10homework;

/*
 *Scriem un program care simuleaza un program de gestionare a stocurilor
 *Avem o clasa parinte pe nume Product.
 *Contine 2 variabile (nume , cantitate)
 *Contine si o metoda pentru calculul cantitatii disponibile
 *Avem 2 clase copil pentru Produse Defecte si Produse care au expirat
 *In ambele clase calculam cantitatea disponibila scazand din cantitate numarul de produse defecte sau expirate
 *Avem o clasa de test unde introducem cantitatea totala, cantitatea de produse expirate si cantitatea de produse defecte.
 *Printam numarul total de produse disponibile vanzarii 
 */

public class Product {
	
	
	String nume;
	int cantitate;
	
	
	
   public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}



        //public int cantitateDisponibila() {
		
		//ProduseDefecte obj1 = new ProduseDefecte();
		//ProduseExpirate obj2 = new ProduseExpirate();
		
		//return cantitate - obj1.defect - obj2.expirat;
		}


