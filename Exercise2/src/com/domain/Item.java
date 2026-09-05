package com.domain;

public class Item {
	 private int itemNo;
	 private String itemName;
	 private double unitPrice;
	 
	 
	 Item (int itemNo, String itemName, double unitPrice ){
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
	public double getunitPrice() {
		return unitPrice;
	}
	public void setunitPrice(double unitPrice) {
		this.unitPrice=unitPrice;
	}
}

}
