package curs6homework;

/*
 * Scriem un program care intreaba utilizatorul 2 numere. Va printa doar numerele pare aflate intre acele 2 numere.
 * Folosind: while
 */

import java.util.Scanner;

public class NumerePareWhile {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter first number: ");
		int numar1 = scan.nextInt();
		System.out.println("Please enter second number: ");
		int numar2 = scan.nextInt();
		
		int i,n;
		
		if (numar1<numar2) {
			i= numar1;
			n= numar2;
		} else {
			i=numar2;
			n=numar1;
		}
				
		while (i<n) {
			i++;
			if (i % 2 ==0) {
				System.out.println(i);
			}
		}
	}
}
