package Curs2;

public class ExempluVariabila {
	//variabila de instanta
	int age = 35; //declarare si initializare
	
	//constanta
	final int varsta = 30;
	
	public void mesaj() {
		//variabila locala
		String nume = "Ion";
		
		String mesaj;
		//declarare variabila
		mesaj= "salut";
		//initializare variabila
		
		age = 45;

	}
	
	public static void main(String[] args) {

		
		//System.out.println(age);
		
		ExempluVariabila obj = new ExempluVariabila();
		System.out.println(obj.age);
	}
	

}
