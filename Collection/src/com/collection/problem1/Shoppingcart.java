package com.collection.problem1;

import java.util.ArrayList;

public class Shoppingcart {
	ArrayList<String> cart = new ArrayList<>();
public void addItem(String item) {
	if(cart.contains(item)) {
		System.out.println("Item already in cart");
	}
	else {
		cart.add(item);
		System.out.printf( "%s added to cart \n",item);
	}
	
}
public void removeItem(String item) {
	if(cart.isEmpty()) {
		System.out.println("No items in cart");
	}
	else if(cart.contains(item)){
		cart.remove(item);
		System.out.printf("%s removed from cart \n",item);
	}
}
public void printCart() {
	System.out.println(cart);
}
}
