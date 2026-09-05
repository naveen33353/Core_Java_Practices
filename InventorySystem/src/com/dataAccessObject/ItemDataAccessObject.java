package com.dataAccessObject;
import com.domain.Item;

public class ItemDataAccessObject implements DataAccessObject {

	
	@Override
	public Item[] insert() {
		Item[] items = new Item[5];
		items[0]=new Item(001,"Laptop",4000);
		items[1]=new Item(002,"Earbuds",13000);
		items[2]=new Item(003,"Mobile",7800);
		items[3]=new Item(004,"TV",1200);
		items[4]=new Item(005,"Fridge",44000);
		
		return items;
		
	}
	 
	Item [] items=insert();
	
	
	@Override
	public void list() {
		for(int i=0; i<items.length; i++) {
			System.out.println(items[i]);
		}
	}


	@Override
	public void startsWith() {
	
		
	}
	
	
	@Override
	public void greaterPrice(int price) {
		System.out.println("items that are greater than"+" "+price+" Rupees:");
		for(int i=0; i<items.length; i++) {
			if(items[i].getunitPrice()>price) {
				System.out.println(items[i]);
	
			}
			
		}
	}
}
