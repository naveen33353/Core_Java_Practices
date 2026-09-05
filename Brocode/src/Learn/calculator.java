package Learn;
import java.util.Scanner;
public class calculator {
public static void main (String[] args) {
	
	double num1;
	double num2;
	char operator;
	double result = 0 ;
	boolean validOperator=true;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the first number : ");
	num1 = scanner.nextDouble();
	
	
	System.out.println("Enter the opertor (+, -, *, /, ^) : ");
	operator = scanner.next().charAt(0);
	
	System.out.println("Enter the Second number :");
	num2 = scanner.nextDouble();
	
	switch(operator) {
	case '+' ->result=num1+num2;
	case '-' -> result=num1-num2;
	case '*' -> result=num1*num2;
	case '/' -> {
		if(num2==0) {
			System.out.println("division by zero is not posiible!");
			validOperator=false;
		}
		else {
			result=num1/num2;
		}
	}
	case '^' -> System.out.println(Math.pow(num1, num2));
	default -> {
		System.out.println("Invalid operator");
		validOperator=false;
	}
	}
	
	if(validOperator) {
		System.out.println(result);
	}
	
	scanner.close();
}
}
