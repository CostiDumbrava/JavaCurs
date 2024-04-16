package curs11homework;

import java.util.Scanner;

/*
 * Clasa de executie TestSavingsAccount care simuleaza ATM –ul.
 * Creaza un obiect de tip Customer
 * Creaza un obiect de tip SavingsAccount
 * Saluta userul “Hi ” + name
 * Intreaba userul ” Please enter the amount to widraw”
 * Executa logica descrisa in pozele din primele 2 slide-uri.
 * 
 */

public class TestSavingAccount extends Account{

	public static void main(String[] args) {
		
		double retragere;
		double test;
		boolean flag=false;
		
		
		Customer client = new Customer();
		SavingsAccount economii = new SavingsAccount();
		
		
		client.setName("Ion");
		client.setAddress("Iasi");
		client.setEmail("ion@iasi");
		
		economii.setBalance(150);
		economii.setAccountNumber(123456789);
		economii.setAccountOwner(client);
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Hi " + client.getName());
		
		do {
			System.out.println("Please enter the amounth you want to withdraw");
			retragere = scan.nextDouble();
			} while (retragere <= 0);
		
		
		try {
			economii.withdraw(retragere);
		} catch (InsufficientFundsException e) {
			System.out.println(" The amount you entered is grater than the available balance: " +economii.balance + "." + "\n Thank you for using our ATM!");
			e.printStackTrace();
			flag=true;
		} 
		
		if (!flag) {
		System.out.println(" Please pick your money! Your new balance is : " +economii.balance + "\n Thank you for using our ATM!");
		} 
	}

}
