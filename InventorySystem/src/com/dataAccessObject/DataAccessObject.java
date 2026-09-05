package com.dataAccessObject;

import com.domain.Customer;

public interface DataAccessObject {
 
	public Object[] insert();
	
	public void list();
	
	public void startsWith();
	
	public void greaterPrice(int price);
}
