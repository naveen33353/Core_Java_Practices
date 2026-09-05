package com.exercise;

public class Address {
  public String roomNumber;
  public String building;
  public String street;
  public City city;
  public Country country;
  public String phone;
  public String email;
  
  public Address(String roomNumber, String building, String street,  City city,Country country, String phone, String email  ) {
	  this.roomNumber = roomNumber;
	  this.building = building;
	  this.street = street;
	  this.city = city;
	  this.country= country;
	  this.phone = phone;
	  this.email = email;
	  
	  
  }
  
  
  
  @Override
  public String toString() {
	  return " roomNumber : "+ roomNumber +", building : "+ building +
				", street : "+ street +", city :"+ city +
				", phone : "+ email + ", email";
  }
}
