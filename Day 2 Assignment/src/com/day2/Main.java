package com.day2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String city = "Delhi";
        
        switch(city) {
        case "Mumbai":city="Financial city";
        break;
        case "Kolkata":city="City of Joy";
        break;
        case "Delhi":city ="Capital of the country";
        break;
        case"Bangalore":city = "Cyber City";
        break;
        default:System.out.println("May be Other Indian City");
        }
        System.out.println(city);
		
	}

}
