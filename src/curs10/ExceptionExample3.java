package curs10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample3 {

	public static void main(String[] args) {
		
		try {
		
Scanner scan = new Scanner(System.in);
	
System.out.println("Enter number 1: ");

int number1 = scan.nextInt();

System.out.println("Enter number 2: ");

int number2 = scan.nextInt();
number2 = (Integer) null;

System.out.println("rezultatul impartirii este " +number1/number2);
		}catch(ArithmeticException e) {
			
			System.out.println("Nu mai imparti la zero ca nu merge");// e bloc de cod, poti pune orice logica 
			
		} catch(InputMismatchException e) {
			
			System.out.println("Nu mai introduce caractere ca nu merge");// e bloc de cod, poti pune orice logica 
			//cand spui nu a fost tratada exceptia nu a fost catch ul programat corect
			//poti pune cate catch uri vrei
		} catch(NullPointerException e) {
			
			System.out.println("A aparut null pointer");
			
		}catch (Exception e) {
			//acest catch cu Exception general este ultimul, pt a urmari mai intai erorile unde pot pune mecanisme de retry
		}

	}

}
