package com.Exercise;

public class Student {
private String studentId;
private String name;
private String phoneNumber;
String emailAddress;

public Student (String studentId, String name, String phoneNumber, String emailAddress) {
	this.studentId = studentId;
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.emailAddress = emailAddress;
}

public String getstudentId() {
	return studentId;
}
public void setstudentId(String studentId) {
	this.studentId = studentId;
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name = name;
}
public String getphoneNumber() {
	return phoneNumber;
}
public void setphoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
}
