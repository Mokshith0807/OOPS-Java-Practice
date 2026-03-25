package com.mokshith.oops;

class Student1 {
	String name;
	int rollNumber;
	double marks;
	
	void displayDetails() {
		System.out.println("Name: "+ name);
		System.out.println("RollNumber: "+ rollNumber);
		System.out.println("Marks: "+ marks);
		
	}
	
	void isPassed() {
		if(marks >= 40) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
		
		System.out.println("---------------------------");
	}
}
public class StudentManagement {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.name = "Mokshith";
		s1.rollNumber = 101;
		s1.marks = 98;
		
		Student1 s2 = new Student1();
		s2.name = "Manoj";
		s2.rollNumber = 102;
		s2.marks = 35;
		
		s1.displayDetails();
		s1.isPassed();
		s2.displayDetails();
		s2.isPassed();
	}
}
