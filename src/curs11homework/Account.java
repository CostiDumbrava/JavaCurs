package curs11homework;

import curs11.InvalidAgeException;

/*
 * Clasa Account care contine:
 * 3 variabile : 1 variabila private de tip int “accountNumber”
 * 1 variabila publica de tip double “balance”
 * 1 variabila publica de tip Customer pe nume ‘accountOwner’
 * Valoarea variabilelor se va seta la chemarea constructorului in clasa de executie
 * O metoda withdraw care primeste ca argument suma ce trebuie retrasa si arunca exceptia InsufficientFundsException
 *
 */

public class Account {

	private int accountNumber; 
	double balance;
	Customer accountOwner = new Customer();
	
	
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
	this.balance = balance;
	}

	public Customer getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(Customer accountOwner) {
		this.accountOwner = accountOwner;
	}

	
	public double withdraw(double amount) throws InsufficientFundsException {
		
		if(amount>balance) {
			throw new InsufficientFundsException("The amount you entered is grater than the available balance: " +balance + ". "+ "\n Thank you for using our ATM!");
		}
		return 0;
}
}
