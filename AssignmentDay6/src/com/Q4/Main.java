package com.Q4;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine E1 = new Engine(10000,110,"TATA",false);
		
		A A1 = new A("Harrier","TATA","MatGreen",E1);
		
		A1.print(A1);
		
		Engine E2 = new Engine(12000,150,"JEEP",true);
		
		A A2 = new A("Wranggler","JEEP","Red",E2);
		
		A2.print(A2);
		
		Engine E3 = new Engine();
		
		A A3 = new A();
		
		
		
		E3.rpm = 8000;
		E3.Power = 100;
		E3.manufacturer = "TATA";
		E3.hasTurbo = false;
		
		
		A3.model = "Nexon";
		A3.Color = "Black";
		A3.companyName = "TATA";
		A3.engine = E3;
		
		A3.print(A3);
		
		E3.hasTurbo = E3.enableturbo();
		
		A3.print(A3);
		

		
		
	}

}
