package com.situ.day7;

import org.junit.Test;

public class StaticDemo {
	public static void main(String[] args) {
		StaticDemo staticDemo = new StaticDemo();
		staticDemo.show();
		//StaticDemo.show();
		
		staticDemo.fun();
		StaticDemo.fun();
		
		Math.random();
		
		Student student = new Student();
		System.out.println(student.country);
		System.out.println(Student.country);;
	}
	
	public void show() {
		System.out.println("StaticDemo.show()");
	}
	
	public static void fun() {
		System.out.println("StaticDemo.fun()");
	}
	
	@Test
	public void test3() {
		//Student student = new Student();
		System.out.println(Student.country);;
	}
}
