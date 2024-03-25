package curs5;

/*
 * facem un program care verifica daca un string este pangram
 * adica daca foloseste toate literele alfabetului
 * dupa verificare printam daca este pangram sau nu
 */

public class Pangram {

	public static void main(String[] args) {
		
		/*char caracter = 'a'; //unicode 97
		caracter++; // incrementeaza 97 + 1 si ajunge la 'b'
		System.out.println(caracter);
		*/		
		
		String text = "The quick brown fox jumps over the lazy dog";
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			
			//de fiecare data intoarce -1 daca nu gaseste caracterul
			if (text.indexOf(ch) == -1) {
				System.out.println("Nu este pangram");
				break;
							
			}
		}
	
	}

}
