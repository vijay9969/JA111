
//Q2:---------------------

package com.Q2;

import java.util.Scanner;

public class PrimeFac {
	
	static String primefact(int N) {
		String str = "";
		if(N>1&&N<100) {
			for(int i=1;i<N;i++) {
				if(N%i==0) {
					str = str+i+" ";
				}
			}
		}else {
			str = "Invalid number";
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Please Enter Number : ");
         int N = Sc.nextInt();
         
         System.out.println(primefact(N));

	}

}
