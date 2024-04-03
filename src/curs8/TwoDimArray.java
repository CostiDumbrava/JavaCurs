package curs8;

import java.util.Arrays;

public class TwoDimArray {
             //matrice
	public static void main(String[] args) {
		
		int [][] array = { {1,2,5,9}, {5,8,4,6} };
		//                 |    0  |   |   1  |
		//                  0 1 2 3     0 1 2 3
		
		System.out.println(array[0][3]);
		
		/*                      coloana 0            coloana 1            coloana 2
		 * 
		 * textArray -->row 0    brasov               iasi                  cluj
		 * 
		 *              row 1    paris                viena                 genova
		 * 
		 * 
		 */
	
		String [][] textArray = {{"Brasov", "Iasi", "Cluj"}, {"Paris", "Viena", "Genova"}};
		
		System.out.println(textArray[1][0]);
		
		System.out.println(textArray.length);
		//va afisa 2, adica lungime array ului principal
		
		System.out.println(textArray[0].length);
		//va afisa 3, adica lungime array ului 0
		
		
		for (int i=0; i<textArray.length; i++) {
			
			System.out.println("Row");
			
			for (int j=0; j<textArray[i].length; j++) {
				
				System.out.println();
				System.out.println("Column: " +textArray[i][j]);
			}
		}
		
		System.out.println("===============================");
		
		for (String[] rand : textArray) {
			//avem array pt ca iterez lista de array uri
			System.out.println("Row: " +Arrays.toString(rand));
			
			for( String col : rand) {
				System.out.println(col);
			}
		}
	}

}
