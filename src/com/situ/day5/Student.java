package com.situ.day5;
//The type Student cannot subclass the final class Person
public class Student extends Person{
	private String className;

	public Student() {
		super();//调用父类无参构造方法
	}

	public Student(String name, int age, String className) {
		super(name, age);//调用父类有参构造方法 new Person(name, age)
		this.className = className;
	}
	
	@Override
	public void show() {
		//super.show();// super父类对象
		System.out.println("name: " + name + ", className: " + className);
	}
	
	public void study() {
		System.out.println(name + "正在学习");
	}

	@Override
	public String toString() {
		return "Student [className=" + className + "]";
	}
	
}
