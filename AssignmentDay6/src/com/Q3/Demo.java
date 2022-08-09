package com.Q3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

			
			Student s1 = Student.getStudent(11,"Vijay","S m joshi","Pune");
			Student s2 = Student.getStudent(12,"Rohit","NIT","Mumbai");
			Student s3 = Student.getStudent(13,"Sumit","Wadia college","Bangalore");
			Student s4 = Student.getStudent(14,"Saurabh","NIT","Chennai");
			
			System.out.println("Name: "+s1.getName());
			System.out.println("Roll no.: "+s1.getRoll());
			System.out.println("CollegeName: "+s1.getCollegeName());
			System.out.println("Address: "+s1.getAdress());
			System.out.println();
			
			
			System.out.println("Name: "+s2.getName());
			System.out.println("Roll no.: "+s2.getRoll());
			System.out.println("CollegeName: "+s2.getCollegeName());
			System.out.println("Address: "+s2.getAdress());
			System.out.println();
			
			System.out.println("Name: "+s3.getName());
			System.out.println("Roll no.: "+s3.getRoll());
			System.out.println("CollegeName: "+s3.getCollegeName());
			System.out.println("Address: "+s3.getAdress());
			System.out.println();
			
			System.out.println("Name: "+s4.getName());
			System.out.println("Roll no.: "+s4.getRoll());
			System.out.println("CollegeName: "+s4.getCollegeName());
			System.out.println("Address: "+s4.getAdress());
			System.out.println();
		
	
	}
}
