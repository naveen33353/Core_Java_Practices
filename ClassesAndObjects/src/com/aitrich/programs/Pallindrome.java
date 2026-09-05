package com.aitrich.programs;
import java.util.Scanner;
public class Pallindrome {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter a number");
	int num= scan.nextInt();
	int temp=num;
	int rev=0;
	while(num>0) {
	 int digit=num%10;
	 rev=(rev*10)+digit;
	 num=num/10;
	}
	if(rev==temp) {
		System.out.println("The number is Pallindrome");
	}
	else {
		System.out.println("Number is not Pallindrome");
	}
}
}
