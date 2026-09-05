package Learn;
import java.util.Scanner;
public class CompoundInterestCalculator {
public static void main (String[] args) {
	
//	Compound Interest Calculator
	
//	Formula   A = p [ 1 + (r/n)]^n*t
	
//	A = Total amount
//	p = principal ampount
//	r = interest rate
//	n = number of times compounded
//	t = number of years
	
	Scanner scanner = new Scanner(System.in);
	double amount;
	double principal;
	double rate;
	int years;
	int timesCompounded;
	
	System.out.println("Enter the principal amount :");
	principal = scanner.nextDouble();
	
	System.out.println("Enter the interest rate :");
	rate = scanner.nextDouble() / 100 ;
	
	System.out.println("Enter the number of times compounded :");
	timesCompounded = scanner.nextInt();
	
	System.out.println("Enter number of years :");
	years = scanner.nextInt();
	
	amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years );
	System.out.printf("The Amount after %d year  is :  %.2f" ,years, amount );
	
	scanner.close();
}
}
