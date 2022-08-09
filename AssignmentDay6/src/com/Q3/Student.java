package com.Q3;

public class Student {
	
	int roll;
	
	private String name;
	
	private String  address;
	
	private String collegeName;
	
	

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


	public String getAdress() {
		return address;
	}


	public void setAdress(String adress) {
		this.address = adress;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	

	Student(){
		
	}

	Student(String name,int roll, String add){
		this.setName(name);
		this.setRoll(roll);
		this.setAdress(add);
		this.setCollegeName("NIT");
	}
	
	Student(String name,int roll,String clg, String add){
		this.setName(name);
		this.setRoll(roll);
		this.setAdress(add);
		this.setCollegeName(clg);
	}
	
	public static Student getStudent(int roll,String name, String clg, String add) {

		if(clg=="NIT") {
			
			Student s = new Student(name,roll,add);
			
			return s;
		}else {
			Student other = new Student(name,roll,clg,add);
			
			return other;
		}
		
	}
	

}
