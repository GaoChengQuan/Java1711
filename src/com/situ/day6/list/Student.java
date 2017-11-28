package com.situ.day6.list;

public class Student {
	private String name;
	private int age;
	private String className;
	private String gender;
	private double height;
	
	public Student() {
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, String className, String gender, double height) {
		super();
		this.name = name;
		this.age = age;
		this.className = className;
		this.gender = gender;
		this.height = height;
	}

	public Student(String name, int age, String className, String gender) {
		this.name = name;
		this.age = age;
		this.className = className;
		this.gender = gender;
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
		return "Student [name=" + name + ", age=" + age + ", className=" + className + ", gender=" + gender + "]";
	}
	
}
