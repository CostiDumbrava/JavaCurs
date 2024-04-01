package curs7;

/*
 * avem un array
 * ne trebuie o metoda pentru a afla indexul unui element
 * rezolvam cu FOR
 * rezolvam cu FOR EACH - nu este foarte practic aici
 * rezolvam cu WHILE - nu este foarte practic aici
 * rezolvam cu DO WHILE - nu este foarte practic aici
 */

public class FindIndexOfElementInArray {
	
	static int[] numbers = {8, 9, 2, 5, 1, 20, 7};
	//index                 0  1  2  3  4  5   6 
	
	
	public static void main(String[] args) {
		rezolvareCuFor(5);
		rezolvareCuForEach(5);
		rezolvareCuWhile(5);

	}
	
	public static void rezolvareCuFor (int numarCautat) {
		
		for (int i=0; i<numbers.length; i++) {
			
			if(numbers[i]== numarCautat) {
				System.out.println("Index pentru element " +numarCautat + " este " +i);
				
			}
		}
	}
	
	public static void rezolvareCuForEach (int numarCautat) {
		int i =0;
		for (int nr : numbers) {
			
			if(nr == numarCautat) {
				System.out.println("Index pentru element " +numarCautat + " este " +i);
			}
			i++;
		}
	}
	
	public static void rezolvareCuWhile (int numarCautat) {
		
		int i=0;
		while (i<numbers.length) {
			
			if(numbers[i]== numarCautat) {
				System.out.println("Index pentru element " +numarCautat + " este " +i);
				
			}
			i++;
		}
	}

}
