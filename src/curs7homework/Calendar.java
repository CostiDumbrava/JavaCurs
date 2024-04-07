package curs7homework;

import java.util.Scanner;

/*
 * Scriem un program care printeaza in consola numele unei luni a anului bazandu-se pe inputul utilizatorului.
 * Intreba untilizatorul un numar si pe baza numarului va printa numele lunii. Ex : utilizatorul introduce 1 si printeaza Ianuarie
 * Folosim un array pentru numele lunilor
 * Daca ultilzatorul introduce un numar invalid, intreaba din nou pana numarul introdus este valid
 * Pentru numar invalid informeaza utilizatorul print-un mesaj ca numarul este invalid.
 */

public class Calendar {

	public static void main(String[] args) {
		
String [] calendar = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};
Scanner scan = new Scanner(System.in);
int luna;

System.out.println("Introduceti numarul: ");
luna = scan.nextInt();

while (luna < 1 || luna >12) {
	System.out.println("Numar invalid!");
	System.out.println("Introduceti din nou numarul: ");
	luna = scan.nextInt();
	
};

for (int i=0;i<=calendar.length; i++) {
if (luna-1 == i) {
	System.out.println(calendar[i]);
}
}

	}

}
