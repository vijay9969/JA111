package com.Q2;

public class Vowel {
	
	void check(char c) {
		
		if(c>='A'&&c<='Z'||c>='a'&&c<='z') {
			
		
		
		char a[] = {'a','e','i','o','u'}; 
		
		char b[] = {'A','E','I','O','U'}; 
		
		boolean flag = false;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==c||b[i]==c) {
				
				flag = true;
				
			}
		}
		
		if(flag==true) {
			
			System.out.println("vowel");
			
		}else {
			
			System.out.println("consonant");
			
		}
		}else {
			
			System.out.println("Error");
			
		}
	}
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vowel v = new Vowel();
		
		v.check('-');
		

	}

}
