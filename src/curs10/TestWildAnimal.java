package curs10;

public class TestWildAnimal {

	public static void main(String[] args) {
		
		//Lion leu = new Lion();
		
		///leu.makesSound();// metoda suprascrisa
		//leu.eatMeat();//metoda proprie a lui Lion
		//leu.whereItLives();//metoda mostenita din clasa parinte
		
		System.out.println("==============================================");
		
		
		//Deer deer = new Deer();
		//deer.makesSound();//metoda suprascrisa
		//deer.eatGrass();//metoda proprie a lui Deer
		//deer.whereItLives();//metoda mostenita din clasa parinte
		
     WildAnimal leu = new Lion();
		
//datatype WildAnimal      clasa Lion
		
		leu.makesSound();
		
		((Lion)leu).eatMeat(); //asta e polimorfism, doar pe linia asta leu este de tip Lion si poate fi apelata metoda eatMeat
		
		leu.whereItLives();
		feedAnimal(leu);
		
		
		leu = new Deer(); //se poate si asa doar prin mostenire se poate face, fiindca sunt copii ai aceluiasi parinte
		leu.makesSound();
		((Deer) leu).eatGrass(); // cu cast, ca mai sus
		leu.whereItLives();
		feedAnimal(leu);
	}

	
	public static void feedAnimal(WildAnimal animal) {
		
		if(animal instanceof Lion) {
			//asa se poate obtine instanta din care face parte 
			System.out.println("You are getting steak");
		}else if (animal instanceof Deer) {
			System.out.println("You are getting parsely");
			
		}
	}
}
