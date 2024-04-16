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
	static int cantitate;
	
    public int cantitateDisponibila() {
		
	return cantitate;
		
		}
}


