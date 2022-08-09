package com.Q1;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentBean s1 = new StudentBean();
		
		
		
		s1.setName("Saurabh");
		
		s1.setAge(22);
		
		s1.setMarks(450);
		
		s1.setRoll(9);
		
		System.out.println("Roll no: "+s1.getRoll());
		
		System.out.println("Name: "+s1.getName());
		
		System.out.println("Age: "+s1.getAge());
		
		System.out.println("Marks: "+s1.getMarks());
		
		System.out.println();
		
		StudentBean s2 = new StudentBean( 10,"Sumit",21,490);
		
		System.out.println("Roll no: "+s2.getRoll());
		
		System.out.println("Name: "+s2.getName());
		
		System.out.println("Age: "+s2.getAge());
		
		System.out.println("Marks: "+s2.getMarks());
		
		System.out.println();
		
		StudentBean s3 = new StudentBean( 11,"Vijay",24,440);
		
		System.out.println("Roll no: "+s3.getRoll());
		
		System.out.println("Name: "+s3.getName());
		
		System.out.println("Age: "+s3.getAge());
		
		System.out.println("Marks: "+s3.getMarks());

	}

}
