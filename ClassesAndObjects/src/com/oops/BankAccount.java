package com.oops;


public abstract class BankAccount {
	
	private String accountNumber;
	private String ownerName;
	private double balance;
	
       
	BankAccount (String accountNumber,String ownerName,double balance ){
		this.accountNumber=accountNumber;
		  this.ownerName=ownerName;	
		 this.balance=balance;
	}
	
	public String getaccountNumber() {
		return accountNumber;
	}
	public void  setaccountNumber(String accountNumber) {
		this.accountNumber=accountNumber;
	}
	public String getownerName() {
		return ownerName;
	}
	public void setownerName(String ownerName) {
	    this.ownerName=ownerName;	
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	

	 public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Deposited"+amount);
		}
		else{
			System.out.println("Invalid Deposit Amount");
		}
		
		
	 } 
	 public abstract void withdraw(double amount);
	 
	 public void getbalance(double balance) {
		System.out.println("Current balance :"+ balance);
	 }
	 public void displayAccountInfo() {
		 System.out.println("Account holder:"+ownerName);
		 System.out.println("Account Number:"+accountNumber);
		 System.out.println("Account balance:"+balance);
	 }

}
