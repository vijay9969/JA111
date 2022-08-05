package com.Q1;

public class CheckWeather {

	void print(boolean isSnow, boolean isRain, double tem) {
		
		if(isSnow==true||isRain==true) {
			
			System.out.println("Let’s stay home.");
			
		}else if(tem<50) {
			
			System.out.println("Let’s go out!");
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isSnowing = false;
		boolean isRaining = false;
		double temperature = 45.0;
		
		CheckWeather ch1 = new CheckWeather();
       
		ch1.print(isSnowing, isRaining, temperature);

	}

}
