package com.collection.problem2;

import java.util.*;

/*linked list are better for this scenario.Because we can add and remove
 * item to any position of a linked list.
 * 
 * but in arrayList we can add or remove item based on index.
 */
public class RestaurantOrderQueue {
	Scanner scanner = new Scanner(System.in);
	
	List<String> orders = new LinkedList<>();;
	
public void addOrder(String orderDetails) {
	
	orders.add(orderDetails);
}


public String processNextOrder() {
	if(orders.isEmpty()) {
		return "No order to process";
	}
	return orders.remove(0);
	}

public void addVipOrders(String orderDetails, int position) {
	if(position < 0 || position > orders.size()) {
		System.out.println("Please enter valid position");
		return;
	}
	orders.add(position,orderDetails);
}
public void viewAllOrders() {
	System.out.println("Current oreders are : ");
	for(String orders : orders) {
		System.out.println(orders);
	}
}
public void cancelOrder(String OrderDetails) {
	if(orders.remove(OrderDetails)) {
		System.out.println(OrderDetails+" removed successfully!");
	}else {
		System.out.println("Order not found");
	}
}
	
}


