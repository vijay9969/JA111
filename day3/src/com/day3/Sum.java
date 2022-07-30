

//Q1:------------


package com.day3;

import java.util.Scanner;

public class Sum {
	
	static int sum(int N){
		return N*(N+1)/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Please Enter Number : ");
         int N = Sc.nextInt();
        System.out.println(sum(N));
	}

}
