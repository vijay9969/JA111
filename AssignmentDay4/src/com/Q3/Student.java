package com.Q3;

public class Student {

	int roll;
	
	String name;
	
	int marks;
	
	void displayStudentDetails(int roll, String name, int marks) {
		
		System.out.println("Roll is "+roll);
		
		System.out.println("Name is "+name);
		
		System.out.println("Marks is "+marks);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Student().displayStudentDetails(12, "Vijay", 91);
		
		new Student().displayStudentDetails(31, "Akash", 92);

	}

}
