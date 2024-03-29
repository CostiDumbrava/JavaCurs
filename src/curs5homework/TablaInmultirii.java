package curs5homework;

import java.util.Scanner;

public class TablaInmultirii {

	public static void main(String[] args) {
				
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int numar = scan.nextInt();
		for (int i=1; i<=10; i++) {
			
			System.out.println(numar + "*" +i + "=" + numar*i);
			
		}

	}

}
