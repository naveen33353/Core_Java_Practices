package com.oops;

public class CurrentAccount extends BankAccount {
 private double overdraftLimit;
 
     
	CurrentAccount(String accountNumber, String ownerName, double balance) {
		super(accountNumber, ownerName, balance);
	}
    
	
	@Override
	public void withdraw(double amount) {
		if(amount>0 && amount<=getbalance()) {
        	setbalance(getbalance()-amount);
        	System.out.println("Withdraw amount"+amount);
        }
        else {
        	System.out.println("insufficient amount"+amount);
        }
		
	}
         
}
