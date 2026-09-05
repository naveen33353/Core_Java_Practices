package Learn;

import java.util.Scanner;


public class Madlimb {

	public static void main(String[] args) {
		String place;
		String person;
		String name;
		String character;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter place :");
	    place = scanner.nextLine();
	   
	    System.out.print("Enter a person who you are in relation:");
	    person = scanner.nextLine();
	  
	    System.out.print("Enter "+person+" 's name :");
	    name = scanner.nextLine();
	    
	    System.out.print("Enter character of"+name);
	    character = scanner.nextLine();
		
		System.out.println("Yesterday i visited  "+place);
		System.out.println("and i saw my "+person+" there.");
		System.out.println("His name is " + name);
		System.out.println("He was a "+character+" person");
		
		
	}
	

	
}
