package com.situ.day5;

public class Student extends Person{
	private String className;
	private String gender;
	private double height;
	

	public Student() {
		super();
	}


	public Student(String name, int age, String className, String gender, double height) {
		super(name, age);
		//this.name = name;
		//this.age = age;
		this.className = className;
		this.gender = gender;
		this.height = height;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Student [className=" + className + ", gender=" + gender + ", height=" + height + "]";
	}
	
	
}
