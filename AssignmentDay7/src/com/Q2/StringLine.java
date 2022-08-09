package com.Q2;

import java.util.Scanner;

public class StringLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scan  = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		
		String str = Scan.nextLine(); 
		
		System.out.println("Enter the character position you want to access:");
		
		int pos = Scan.nextInt();
		
		char Char = str.charAt(pos);
		
		System.out.println(Char);
		
		
	}

}
