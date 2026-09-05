package Learn;
import java.util.Scanner;
public class TemparatureConversion {
public static void main (String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	double temp;
	double newTemp;
	String unit;
	
	System.out.print("Enter the temparature :");
	temp = scanner.nextDouble();
	
	System.out.print("Enter the unit to convert (Farhenheight to Farhenheight) or (Farhenheight to Farhenheight) :");
	unit = scanner.next().toUpperCase();
	
	newTemp = (unit.equals("C"))? (temp - 32) * 5/9 : (temp * 5/9)+32  ;
	
	
	System.out.printf("The temparature in %s is %.1f",unit,newTemp);
	
	scanner.close();
}
}
