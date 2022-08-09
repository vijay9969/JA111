package com.Q4;

public class A {
	
	String model;
	String companyName;
	String Color;
	Engine engine;

	A(){
		
	}

	A(String model,	String companyName,	String Color, Engine engine){
		
		this.model = model;
		this.Color = Color;
		this.companyName = companyName;
		this.engine = engine;
		
	}
	
	public void print(A A){
		
		System.out.println("Car Model: "+A.model);
		System.out.println("Car companyName : "+A.companyName);
		System.out.println("Car Color : "+A.Color);
		System.out.println("Car RPM : "+A.engine.rpm);
		System.out.println("Car Power : "+A.engine.Power);
		System.out.println("Car Engine Manufacture : "+A.engine.manufacturer);
		System.out.println("Car Has Turbo : "+A.engine.hasTurbo);
		System.out.println();
		
		
	}
	

}
