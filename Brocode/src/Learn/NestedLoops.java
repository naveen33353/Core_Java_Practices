package Learn;

import java.util.Scanner;

public class NestedLoops {
public static void main (String[] args) throws InterruptedException {
	Scanner scanner = new Scanner(System.in);
	
	int rows;
	int colomns;
	char symbol;
	
	System.out.print ("Enter number of rows : ");
	rows = scanner.nextInt();
	
	System.out.print("Enter number of colomns : ");
	colomns = scanner.nextInt();
	
	System.out.print("Enter a symbol to print :");
	symbol = scanner.next().charAt(0);
	
	
	for(int i = 0; i < rows; i++) {
		for(int j = 0; j < colomns; j++) {
			System.out.print(symbol+ " ");
			Thread.sleep(1000);
		}
	    System.out.println();
    	Thread.sleep(1000);
	}
	scanner.close();
}
}
