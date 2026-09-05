package Learn;

import java.util.Scanner;

public class BankingProject {
	static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
	
	double amount;
	double balance = 0;
	boolean isRunning = true;
	int choice;
	
	
	while(isRunning) {
		System.out.println("****************");
		System.out.println("Welcome");
		System.out.println("****************");
		System.out.println("What you want to do?");
		System.out.println("1.Check balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		System.out.println("****************");
		
		System.out.print("Enter your choice (1-4):");
		choice = scanner.nextInt();
		switch(choice) {
		case 1 ->  System.out.println(checkBalance(balance));
		case 2 -> balance += deposit(balance);
		case 3 -> balance -= withdraw(balance); 
		case 4 -> isRunning = false;
		default -> System.out.println("Please enter a valid choiceS");
	}
	
	
	}
	System.out.println("you are Exited");
	
}

//check balance

static double checkBalance(double balance) {
	return balance;
}

//Deposit Amount

static double deposit(double balance) {
	
	System.out.println("Enter amount you want to deposit");
	 double amount = scanner.nextDouble();
	 if(amount<100) {
		 System.out.println("Minimum deposit amount is 100rps");
		 return 0;
	 }else {
		 System.out.println("Amount added!");
		 return amount;
	 }
	
}

// Withdraw amount
static double withdraw(double balance) {
	System.out.println("Enter amount you want to withdraw :");
	double amount = scanner.nextDouble();
	amount = scanner.nextDouble();
	if(amount>balance) {
		System.out.println("INSUFFICIENT BALANCE!");
		return 0;
	}else if(amount<0) {
		System.out.println("Amount can't be negative");
		return 0;
	}else {
		System.out.println("Amount added SUCCESSFULLY!!!");
		return amount;
	}
	
}



}
