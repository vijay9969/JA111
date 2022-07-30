// q1

package com.user;
import java.util.*;
public class UserCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter your city : ");
        String city= sc.next();
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
        break;
        }
        System.out.println(city);
        System.out.println("Thank you!");
	}

}


/*

Q2:

*/