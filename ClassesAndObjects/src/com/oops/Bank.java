package com.oops;

public class Bank {
private Customer[] customers;
private String[] accounts;

public String addCustomers(Customer[] customer) {
	return "Customer added successfully";
}

public void  findAccount(String accountnumber) {
	for(int i=0; i<customers.length;i++) {
		System.out.println("customer");
	}
	System.out.println(customers);
	
}

public void displayAllAccounts(){
	System.out.println(accounts);

}
}
