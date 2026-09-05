package Learn;
import java.util.Scanner;
public class LogicalOperators {
public static void main(String[] args) {
	
//	logical OR ||
//	Logical AND &&
//	Not !
	String userName;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the username :");
	userName = scanner.nextLine();
	
	if(userName.length()<4 && userName.length()>12) {
		System.out.println("Username must be between 4-12 characters ");
	}
	else if(userName.contains(" ") || userName.contains("_")) {
		System.out.println("Username cannot contain space or underscore ");
	}
	else {
		System.out.println("Hello " + userName);
	}
	scanner.close();
}
}
