package com.DataAccesObject;

public class ItemsDAO implements DataAccessObject {
	
		 
		
		@Override
		void insert(Object object) {
			Item[] items=new Item[5];
			items[0]= new Item(001,"Laptop",1785.22);
			items[1]= new Item(002,"Mobile",56448.56);
			items[2]= new Item(003,"Headphones",89445.87);
			items[3]= new Item(004,"Earbuds",5649.23);
			items[4]= new Item(005,"Controller",1254.98);
			
		
}
