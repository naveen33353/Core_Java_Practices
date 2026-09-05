package Learn;

import java.util.Scanner;

public class WeightConverter {
public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	double weight;
	double newWeight;
	int choice;
	
	System.out.println("Welcome to weight coverter");
	System.out.println("You have two options");
	System.out.println("option 1: lbs to kgs");
	System.out.println("option 2: kgs to lbs");
	System.out.print("choose an option :");
	choice = scanner.nextInt();
	
	
	
	
	if(choice == 1) {
		System.out.print("Enter the weight in lbs :");
		weight = scanner.nextDouble();
	    newWeight = weight * 0.453592;
	    System.out.printf("Weight in kgs : %.2f " ,newWeight);
	}
	else if(choice == 2) {
		System.out.print("Enter the weight in kgs :");
		weight = scanner.nextDouble();
		newWeight = weight * 2.20462;
		 System.out.printf("Weight in kgs : %.2f " ,newWeight);
	}
	else {
		System.out.println("Select valid choice");
	}
	
	scanner.close();
}
}
