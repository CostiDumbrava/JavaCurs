package curs11;

import java.util.Scanner;

public class ExceptionExample4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1,num2, result;
		
		while (true) {
			
			System.out.println("Te rog introdu numarul 1 : ");
			//clasa Interger este clasa parinte pentru data type int 
			
			try {
				
			num1 = Integer.parseInt(scan.next());
			} catch(NumberFormatException e) {
				System.out.println("Please enter only numeric values");
				continue;
				//continue te arunca inapoi in bucla, este ca un reset - o ia de la capat
				//breack te scoate din bucla
			}
			
			if (num1==0) {
				System.out.println("Un numar este zero");
				continue;
			}
			
			//Integer.parseInt()
			
			while(true) {
				try {
					System.out.println("Te rog introdu numarul 2 : ");
					num2 = Integer.parseInt(scan.next());
					} catch(NumberFormatException e) {
						System.out.println("Please enter only numeric values");
						continue;
					}
				break;
				
			}
			
			
			if (num2==0) {
				System.out.println("Un numar este zero");
				continue;
			}
			
			result = num1/num2; 
			System.out.println("Result: " +result);
			
			break;
			
		}
		
		
		
		
	}	
		
	}	
		

	


