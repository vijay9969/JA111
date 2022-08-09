package com.inputfromuser;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Roll no.: ");
		
		int roll = scan.nextInt();  
		
		scan.nextLine();
		
		System.out.println("Enter Name: ");
		
		String name = scan.nextLine();
		
		System.out.println("Enter Marks: ");
		
		int marks = scan.nextInt(); 
		
		if("Vijay".equals(name)) {
			
			System.out.println("I am "+name);
			
		}else {
		
		System.out.println("Name is      : "+name);
		
		}
		
		System.out.println("Roll no. is  : "+roll);
		
		System.out.println("Marks is     : "+marks);

	}

}
