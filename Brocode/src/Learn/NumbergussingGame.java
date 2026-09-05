package Learn;
import java.util.Random;
import java.util.Scanner;

public class NumbergussingGame {
public static void main (String[] args) {
	
	
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	int guess;
	int attempts=0;
	int min =1;
	int max =100;
	int randomNumber = random.nextInt(min, max+1);
	
	
	System.out.println("Wecome to number guessing game");
	System.out.println("Enter number between 1 - 100");
	
	do {
		System.out.print("Enter a guess :");
		guess = scanner.nextInt();
		attempts++;
		if(guess < randomNumber ) {
			System.out.println("To Low! Try again");
		}
		else if(guess>randomNumber) {
			System.out.println("To High! Try Again");
		}
		else {
			System.out.println("You are CORRECT");
		}
	}while(guess != randomNumber );
	
	System.out.println("you have Won!");
	System.out.printf("number of Attempts : %d",attempts);
	scanner.close();
}
}
