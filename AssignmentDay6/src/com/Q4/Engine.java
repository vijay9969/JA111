package com.Q4;

public class Engine {

	int rpm;
	int Power;
	String manufacturer;
	boolean hasTurbo;


	
	Engine(){
		
	}
	
	Engine(int rpm, int Power, String manufacturer, boolean hasTurbo){
		
		this.rpm = rpm; 
		
		this.Power = Power;
		
		this.manufacturer = manufacturer;
		
		this.hasTurbo = hasTurbo;
	
	}
	
	public boolean enableturbo() {
		
		return true;
		
	}

}
