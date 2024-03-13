package curs1;

public class FirstClass {
	
	String nume;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstClass obiect = new FirstClass(); // trebuie sa fie in interiorul metodei public static void main
		obiect.greetings();
	}
	
	public void greetings() {
		System.out.println ("Test"); //sysout apoi ctrl+space
	}

}

/* compilam codul
* preluat de catre JVM
*incarca membrii statici ai clasei (variabila sau metoda declarata cu cuvantul cheie static)
*initializarea obiectului/clasei
*
*/

//single line comment

/*multiple line comment
*
*
*/

