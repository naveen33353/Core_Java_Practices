package com.Exercise;

public class Course {
private String courseId;
private String courseName;
private String fees;

public Course(String courseId, String courseName, String fees) {
	this.courseId = courseId;
	this.courseName = courseName;
	this.fees = fees;
}
public String getcourseId() {
	return courseId;
}
public void  setcourseId(String courseId) {
	this.courseId = courseId;
}
public String getcourseName() {
	return courseName;
}
public void setcourseName(String courseName) {
	this.courseName = courseName;
}
public String getfees() {
	return fees;
}
public void setfees(String fees) {
	this.fees = fees;
}


}


