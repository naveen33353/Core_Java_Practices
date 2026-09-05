package com.inventorySystem;

import com.dataAccessObject.CustomerDataAccessObject;
import com.dataAccessObject.DataAccessObject;
import com.dataAccessObject.ItemDataAccessObject;

public class Main {
public static void main (String[] args) {
	
//	customer list
	DataAccessObject customerList = new CustomerDataAccessObject();
	customerList.list();
	
	System.out.println();
	
//	item list
	DataAccessObject itemList =new ItemDataAccessObject();
	itemList.list();
	
	
	System.out.println();
	
//	Startwith
	customerList.startsWith();
	
	
	System.out.println();
//	greater price
	itemList.greaterPrice(9000);
}
}
