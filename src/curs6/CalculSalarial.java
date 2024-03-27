package curs6;

import java.util.Scanner;

/*
 * facem un program care calculeaza salariul pe o saptamana
 * intrebam ultilizatorul cate ore a lucrat 
 * calculam doar daca a lucrat maxim 40 si minim 1
 * daca introduce un numar invalid il rugam sa introduca din nou
 * facem asta pana introduce un numar valid
 * 
 * calculam cu formula :
 * Salariu = nr ore lucrate*rate per hour
 * 
 *ratePerHour = 35
 *
 */
public class CalculSalarial {
	
	static final int RATE_PER_HOUR = 35; //constantele le scriem mereu cu caps

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		int oreLucrate;
		System.out.println("Cate ore ai lucrat? ");
		oreLucrate=scan.nextInt();
		
	while (oreLucrate<1 || oreLucrate>40)	{
		System.out.println("Numar invalid. Introdu numarul de ore:");
		oreLucrate=scan.nextInt();
	}
		
		System.out.println("Salariul tau este: " +oreLucrate*RATE_PER_HOUR);

		//int i=3;
		//while (i>0) {
			
			//System.out.println("Programul se inchide in " +i + " secunde");
			//Thread.sleep(1000);
						
		//}
		
		for (int i=3; i>0; i--) {
			System.out.println("Programul se inchide in " +i + " secunde");
			Thread.sleep(1000);	
		}
	}

}
