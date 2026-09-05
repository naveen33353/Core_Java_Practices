package com.dataAccessObject;

import com.domain.Customer;

public  class CustomerDataAccessObject implements DataAccessObject {

	@Override
	public Customer[] insert() {
		Customer[] customers = new Customer[5];
		customers[0]=new Customer("Naveen","Thrissur","naveen@gmail.com");
		customers[1]=new Customer("Abijith","Thrissur","abijith@gmail.com");
		customers[2]=new Customer("Benlin","Thrissur","benlin@gmail.com");
		customers[3]=new Customer("Akshay","Thrissur","akshay@gmail.com");
		customers[4]=new Customer("Aswin","Palakkad","aswin@gmail.com");
		
		return customers;
	}
	
	
	Customer[] customer=insert();
	
	
	
	@Override
	public void list() {
		for(int i=0; i<customer.length; i++) {
			System.out.println(customer[i]);
		}
	}



	@Override
	public void startsWith() {
		System.out.println("Customer whoes name starts with A:");
		for(int i=0; i<customer.length; i++) {
			if(customer[i].getcustomerName().startsWith("A")) {
				System.out.println(customer[i]);
			}
		}
		
	}



	@Override
	public void greaterPrice(int price) {
		
		
	}
	
}
