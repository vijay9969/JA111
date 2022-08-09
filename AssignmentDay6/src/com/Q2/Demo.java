package com.Q2;

public class Demo {
	
	Demo(){
		this("vijay");
		System.out.println("Zero parameter constructor ");
	}
	
	Demo(String s){
		this(24);
		System.out.println("String parameter constructor "+s);
	}
	
	Demo(int i){
		this(20.20f);
		System.out.println("Integer parameter constructor "+i);
	}
	
	Demo(float f){
		System.out.println("Float parameter constructor "+f);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Demo();
		

	}

}
