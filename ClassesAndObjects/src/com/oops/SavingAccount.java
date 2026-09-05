package com.oops;

public class SavingAccount extends BankAccount {
          private double interestRate;
          
          
          public SavingAccount( String accountNumber,String ownerName,double balance) {
        	 super(accountNumber,ownerName,balance);
          }
          
         
           
          public void addinterest() {
        	  double interest= (getbalance()+(getbalance()*interestRate/100));
        	  System.out.println(interest);
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
