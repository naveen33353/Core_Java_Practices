package com.aitrich.programs;

public class BuzzNum {
	public void checkBuzz( int num) {
		if(num%10==7 || num%7==0) {
			System.out.println("It is a Buzz number");
		}
		else {
			System.out.println("It is not Buzz number");
		}
		
	}
	
}
