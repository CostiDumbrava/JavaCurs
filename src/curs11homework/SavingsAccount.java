package curs11homework;

/*
 * Clasa SavingsAccount care mosteneste Account
 * Seteaza in constructor accountOwner, balance si accountNumber
 * Suprascrie metoda withdraw unde implementeaza:
 * - daca suma ce urmeaza a fi retrasa este mai mare decat balanta curenta, arunca InsuficientFundsException
 * - altfel scade suma ce urmeaza a fi retrasa din balanta
 */

public class SavingsAccount extends Account {
	
	@Override
    public double withdraw(double amount) throws InsufficientFundsException {
		
		if(amount>balance) {
			throw new InsufficientFundsException("Insufficient funds for transaction");
		}else {
			return  balance = balance - amount;	
		}
}
	
}
