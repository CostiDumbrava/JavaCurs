package curs8;

import java.util.Random;

/*
 * facem un program care genereaza 6 numere intre 0 - 9
 * numerele le tine intr un array
 * nu tine numere duplicate
 * printam array ul la final
 * impartim tot programul in metode care fac un singur lucru
 */

public class RandomNumberGenerator {
	final int ARRAY_LENGHT = 6;
	final int MAX_NUMBERS = 10;
	int [] numbers = new int[ARRAY_LENGHT];
	int randomNr;
	
	public int generateNumbers() {
		Random random = new Random();
		//clasa din java care reurneaza random ce numere vrem de la 0 pana la un numar specificat
		randomNr = random.nextInt(MAX_NUMBERS);
		
		return randomNr;
	}
	
	public boolean compareNumbers(int randomNr) {
		
		for(int nr : numbers) {
			
			if (nr == randomNr) {
				
				return true;
			}
		}
		return false;
	}

	public void addNrToArray() {
		
		for (int i=0; i<ARRAY_LENGHT; i++) {
			randomNr = 0;
			
			do {
				randomNr = generateNumbers();
			}		
			while (compareNumbers(randomNr));
			
			numbers[i] = randomNr;
				
			}
		
		}
	
	
	public void printArray() {
		
		for (int nr : numbers) {
			System.out.print(nr + "|");
			
		}
	}
}
