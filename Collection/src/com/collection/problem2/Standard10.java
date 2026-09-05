package com.collection.problem2;

public class Standard10 {
public static void main(String[] args) {
	AttendanceTracker attendance = new AttendanceTracker();
	Student student1 = new Student("101","Naveen","Maths");
	Student student2 = new Student("102","Akshay","IT");
	Student student3 = new Student("103","Abijith","Maths");
	Student student4 = new Student("104","Aswin","B.tech");
	Student student5 = new Student("105","Benlin","IT");
	Student student6 = new Student("106","Edwin","CS");
	
	attendance.markAttendance(student1);
	attendance.markAttendance(student2);
	attendance.markAttendance(student3);
	attendance.markAttendance(student4);
	attendance.markAttendance(student5);
	
	
	System.out.println();
	
	attendance.isPresent("101");
	attendance.isPresent("106");
	
	System.out.println();
	
	System.out.println("Total present :"+ attendance.getTotalPresent());
	
	System.out.println();
	
	attendance.getAttendanceList();
	
	
	
	
}
}
