package com.domain;

public class Customer {
private String customerName;
private String billingAddress;
private String emailAddress;


public Customer (String customerName, String billingAddress, String emailAddress){
	this.customerName=customerName;
	this.billingAddress=billingAddress;
	this.emailAddress=emailAddress;
}
public String getcustomerName() {
	return customerName;
}
public void setcustomerName(String customerName ) {
	this.customerName=customerName;
}
public String getbillingAddress() {
	return customerName;
}
public void setbillingAddress(String billingAddress) {
	this.billingAddress=billingAddress;
}
public String getemailAddress() {
	return emailAddress;
}
public void setemailAddress(String emailAddress) {
	this.emailAddress=emailAddress;
}
@Override
public String toString() {
	return "Customer Name:"+customerName+" | Billing Address:"+billingAddress+" | Email:"+emailAddress;
}
}
