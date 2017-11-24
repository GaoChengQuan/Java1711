package com.situ.day4;

import org.junit.Test;

public class OOPDemo {
	
	@Test
	public void test1() {
		String name = "zhangsan";
		int age = 32;
		String className = "java1711";
		String gender = "男";
		
		printStudent(name, age, className, gender);
		study(name, className);
	}
	

	private void study(String name, String className) {
		System.out.println(name + "正在" + className + "学习");
	}


	private void printStudent(String name, int age, String className, String gender) {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("className: " + className);		
		System.out.println("gender: " + gender);		
	}
	
	@Test
	public void test2() {
		/*Student student = new Student();
		student.name = "zhangsan";
		student.age = 20;
		student.className = "java1711";
		student.gender = "男";
		
		Student student2 = new Student();
		student2.name = "lisi";
		int num = 2;
		
		printStudent(student);
		printStudent(student);
		printStudent(student);
		printStudent(student);
		printStudent(student);
		printStudent(student);
		printStudent(student);
		printStudent(student);
		printStudent(student);
		printStudent(student);
		student.study();*/
	}

	private void printStudent(Student student) {
		/*System.out.println("name: " + student.name);
		System.out.println("age: " + student.age);
		System.out.println("className: " + student.className);
		System.out.println("gender: " + student.gender);*/
	}
	
	@Test
	public void test3() {
		Student student = new Student("lisi", 20, "java1711", "男");
		System.out.println(student.getClassName());
		student.setClassName("java1712");
		System.out.println(student.getClassName());
	}
	
	
}
