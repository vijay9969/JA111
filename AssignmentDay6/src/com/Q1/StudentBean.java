package com.Q1;

public class StudentBean {

	private int roll;
	
	private String name;
	
	private int age;
	
	private int marks;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	StudentBean(){
		
	}
	
	StudentBean(int roll, String name, int age, int marks){
		this .roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	

}
