package com.situ.day7;

import java.util.jar.Attributes.Name;

public class Student {
	private Integer temp;
	public Integer getTemp() {
		return temp;
	}
	
	public void setTemp(Integer temp) {
		this.temp = temp;
	}
	private String name;
	private int age;
	private String className;
	private String gender;
	private double height;
	
	
	public static String country = "CN";
	
	//静态代码块
	static {
		System.out.println("static code");
	}
	
	public Student() {
		System.out.println("Student.Student()");
	}
	
	public Student(String name, int age) {
		super();
		System.out.println("Student.Student()");
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
	
	public static void show() {
		//Cannot use super in a static context
		//super.toString();
		//Cannot make a static reference to the non-static field name
		//System.out.println(name);
		System.out.println(country);
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
