package com.exercise;

import java.util.HashSet;

public class NewAddressBook {
HashSet <Person> uniquePerson;

public NewAddressBook() {
	uniquePerson = new HashSet<>();
}

public void addPerson(Person p) {
	if(uniquePerson.add(p)) {
		System.out.println("Added Successfully!!!");
	}else {
		System.out.println("Persons must be unique by their address");
	}
	
	
}
}
