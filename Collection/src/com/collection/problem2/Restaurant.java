package com.collection.problem2;

public class Restaurant {
public static void main(String[] args) {
	
	RestaurantOrderQueue order = new RestaurantOrderQueue();
	
	order.addOrder("Burger");
	order.addOrder("Parotta");
	order.addOrder("Pizza");
	order.addOrder("shavarma");
	
	order.processNextOrder();
	
	order.addVipOrders("Chicken Roast", 0);
	
	System.out.println();
	
	order.viewAllOrders();
	
	System.out.println();
   
	order.cancelOrder("shavarma");
    
	System.out.println();
    
    order.viewAllOrders();
}
}
