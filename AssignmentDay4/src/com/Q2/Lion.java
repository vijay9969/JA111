package com.Q2;

public class Lion {
	
	String name;
	
	boolean isHungry;
	
	int age;
	
	static int totalDeaths;
	
	static void printKillings() {
		
		System.out.println("Total Killings by lion in jungle "+totalDeaths);
		
	}
	void thinking(String name, int age, boolean isHungry) {
	  
		if(!isHungry) {
			
			System.out.println(name+" is sleeping");
			
		}else {
			
		if(age>12) {
			
			totalDeaths += 2;
			
			System.out.println(name+" has eaten two animals");
			
		}else if(age<=12&&age>=2){
			
			totalDeaths += 1;
			
			System.out.println(name+" has eaten one animals");
			
		}else {
			
			System.out.println(name+" is calling Mom");
			
		}
		
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion1 = new Lion();
		
		Lion lion2 = new Lion();
		
		Lion lion3 = new Lion();
		
		lion1.name = "lion1";
		
		lion1.age = 20;
		
		lion1.isHungry = true;
		
		lion1.thinking(lion1.name,lion1.age,lion1.isHungry);
		
		lion2.name = "lion2";
		
		lion2.age = 12;
		
		lion2.isHungry = true;
		
		lion2.thinking(lion2.name,lion2.age,lion2.isHungry);
		
		lion3.name = "lion3";
		
		lion3.age = 15;
		
		lion3.isHungry = false;
		
		lion3.thinking(lion3.name,lion3.age,lion3.isHungry);
		
		
		
		printKillings();
		
	}

}
