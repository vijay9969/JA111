package com.vijay.handal;

//this for demo perpose

public class Detail {

	
public static int add(int a, int b) {
	return a+b;
}

     
	
	
	public static void main(String[] args) {
//		Detail g =new detail();
		 // TODO Auto-generated method stub
		int a = 2;
		int b = 4;
		
//			System.out.println("Hello! Sumit");
//		    System.out.println("sumit");
////		    System.out.println("vijay "+mob);
//		    System.out.println(a++); //2
//		    //3
//		    System.out.println(++a); //4
//		    System.out.println(a--); //4
//		    //3
//		    System.out.println(--a); //2
////		    System.out.println(mob);
		int x = add(a,b);
		    System.out.println("add:"+x);
////		    		    g.Demo();
		
		int marks  = 500;
//		if(marks>400) {
//			System.out.println("Div 1");
//		     if(marks>550) {
//		    	 System.out.println("Div 3");
//		     }
//		     else {
//		    	 System.out.println("Div 4");
//		     }
//		}
//		else {
//			System.out.println("Div 2");
//		}
		
		String result = (marks>=500)? "div 1":"div 2";
		System.out.println(result);
		   
	} 
	
	
}
