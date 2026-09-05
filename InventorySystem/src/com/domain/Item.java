package com.domain;

public class Item {
private int itemNo;
private String itemName;
private int unitPrice;

public Item (int itemNo,String itemName,int unitPrice) {
	this.itemNo=itemNo;
	this.itemName=itemName;
	this.unitPrice=unitPrice;
}
public int getitemNo() {
	return itemNo;
}
public void setitemNo(int itemNo) {
	this.itemNo=itemNo;
}
public String getitemName() {
	return itemName;
}
public void setitemName(String itemName) {
	this.itemName=itemName;
}
public int getunitPrice() {
	return unitPrice;
}
public void setunitPrice(int unitPrice) {
	this.unitPrice=unitPrice;
}
@Override
public String toString() {
	return "Item No:"+itemNo+" | Item Name:"+itemName+" | Unit Price:"+unitPrice;
}
}
