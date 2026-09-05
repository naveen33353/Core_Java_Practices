package Learn;

import java.util.Scanner;

public class Methods {
public static void main(String[] args) {
	String name;
	int age;
	Scanner scanner = new Scanner(System.in);
	
	 System.out.print("Enter Your Name : ");
	 name = scanner.nextLine();
	 
	 System.out.print("Enter Your age : ");
	 age = scanner.nextInt();
	 
	 happyBirthday(name, age);
	 System.out.println();
	 if(ageCheck(age)) {
		 System.out.println("You are eligible to vote!");
	 }
	 else {
		 System.out.println("You must be 18+ to vote");
	 }
	 
	scanner.close();
}

static void happyBirthday(String name,int age) {
	System.out.printf("Happy Birthday dear %s.\n You are %s years old",name,age);
}


static boolean ageCheck(int age) {
	if(age>18) {
		return true;
	}
	else {
		return false;
	}
}
}
