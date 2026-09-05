package com.collection.problem1;

import java.util.*;


public class MarketingCompany {

	 public static Set<String> getUniqueSortedEmails(List<String> emails) {

	       
	        HashSet<String> uniqueEmails = new HashSet<>(emails);

	       
	        TreeSet<String> sortedEmails = new TreeSet<>(uniqueEmails);

	        return sortedEmails;
    }
	 
	 
	
}
