package com.Q3;

import java.util.Scanner;

public class Course {

		int courseId;
		String  courseName;
		int courseFee;
		
		public void displayCourseDetails(int courseId,	String  courseName,	int courseFee) {
			System.out.println();
			System.out.println("courseId: "+courseId);
			System.out.println("courseName: "+courseName);
			System.out.println("courseFee: "+courseFee);
		}
		
		public static void authenticate(String userName, String password) {
			Course c = new Course();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the courseId: ");
			
			int courseId = sc.nextInt();
			
			System.out.println("Enter the courseName: ");
			
			sc.nextLine();
			
			String courseName = sc.nextLine();
			
			System.out.println("Enter the courseFee: ");
			
			int courseFee = sc.nextInt();
			
			if("admin".equals(userName)&&"1234".equals(password)) {
				
				c.displayCourseDetails(courseId,courseName,courseFee);
				
			}else {
				System.out.println("Invalid Username or password");
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the userName: ");
		
		String userName = sc.next();
		
		System.out.println("Enter the password: ");
		
		String password = sc.next();
		
		Course.authenticate(userName,password);

	}

}
