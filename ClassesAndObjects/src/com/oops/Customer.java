package com.oops;

public class Customer  {
 private String name;
 private String email;
private BankAccount account;
             
        public Customer(String name, String email, BankAccount account) {
        	this.name=name;
        	this.email=email;
        	this.account=account;
        }
       
            public void displayCustomerInfo() {
            	System.out.println("Customer name :"+name );
            	System.out.println( "Customer email :"+ email);
            }
}
