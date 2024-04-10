package curs10;

public class Deer extends WildAnimal{

// te ajuta adnotarea @Override pt ca in cazul in care scrii gresit metoda, iti apare eroare	
@Override	
public void makesSound() {
		
		System.out.println("Meee!");
	}

public void eatGrass() {
	
	System.out.println("I eat grass!");
}

}
