//Q1)  Is there any difference between creating a string with and without a new operator?  
//        Explain with an example.
//=> In Java, a string is an object that represents a sequence of characters. there is a
	//predefined class in java called String, which belongs to java.lang package, this String
	//class is used to create a string object.
	//We use double quotes to represent a string object in Java, for example
	//String message = "Welcome to Masai";
	//Here the message is a variable of String type which is initialized with the string object
	//“Welcome to Masai”. this message variable is not a primitive type variable like int, char,
	//byte, etc.
	//Instead, this message variable is a reference variable of type String class.


package com.Q1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 String s1 = "Test";
			 String s2 = "Test";
			 System.out.println(s1==s2);
		 
			String s3 = new String("Test");
		    String s4 = "Test";
		    System.out.println(s3.hashCode());
		    System.out.println(s4.hashCode());
		    System.out.println(s3==s4);

		
	}

}
