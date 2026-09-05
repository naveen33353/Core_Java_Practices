package com.collection.problem1;

import java.util.*;

public class Domain {
public static void main(String[] args) {
	Shoppingcart item = new Shoppingcart();
	
	item.addItem("Milk");
	item.addItem("Biscuit");
	item.addItem("Bread");
	
	item.removeItem("Milk");
	
	item.printCart();
	System.out.println();
	
	System.out.println("*****************");
	
	List<String> emailList = Arrays.asList("naveen@gmail.com","akshay@gmail.com", "naveen@gmail.com", "abijith@gmail.com","akshay@gmail.com","benlin@gmail.com");

    Set<String> result = MarketingCompany.getUniqueSortedEmails(emailList);

    System.out.println("Unique & Sorted Emails:");
    for (String email : result) {
        System.out.println(email);
    }
	

	
}

}
