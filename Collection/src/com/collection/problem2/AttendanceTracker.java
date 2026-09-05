package com.collection.problem2;
import java.util.*;
public class AttendanceTracker {

	
	List<Student> attendance = new ArrayList<>();
	
	
	public void markAttendance(Student student) {
		if(attendance.contains(student)) {
			System.out.println(student.getName()+" is already present");
		}else {
			attendance.add(student);
			System.out.println(student.getName()+ " attendance marked");
		}
	}
	
	public void isPresent(String studentId) {
		for(Student s : attendance) {
			if(s.getId().equals(studentId)) {
				System.out.println(s.getName()+ " is present");
				return;
			}
				
			
		}
		System.out.println(studentId+ " is not present");
	}
	public int getTotalPresent() {
		return attendance.size();
		
	}
	public void getAttendanceList() {
		System.out.println("\n---Attendance list---\n");
		for(Student attendanceList : attendance) {
			System.out.println(attendanceList);
		}
	}
}
