package com.aitrich.programs;

public class DivisorOfNum {
   public void Divisor( int num1) {
	 for(int i=1; i<=num1; i++) {
		 if(num1 % i==0) {
			 System.out.println("The divisors are:"+i);
		 }
	 }
	  
   }
}
