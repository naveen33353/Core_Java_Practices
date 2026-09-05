package com.aitrich;

public class ClassObjectDemo {

	public static void main(String[] args) {
//	     System.out.println("Hello World");
//	     System.out.println(1+2);
		
		// Object 
		Student student1 = new Student();
		student1.name = "Suraj";
		student1.contactNumber = "8281312945";
		System.out.println(student1);
		
		
		Student student2 = new Student();
		student2.name="Aswin";
		student2.contactNumber = "99000997887";
		System.out.println(student2);
		
		College college = new College();
		
	     

	}
//public class Student{
//		int id;
//		String Name;
//		String Address;
//		String Email;
//		long Phone;
//		
//		public static void main(String[] args) {
//			System.out.println("");
//		}
////	}
//class College{
//		String Name;
//		String Address;
//		String Email;
//		long Phone;
//	}
	 
}
