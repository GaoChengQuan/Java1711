package com.situ.day6;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

import com.situ.day5.Person;

public class AnimalTest {
	public static void main(String[] args) {
		//Cannot instantiate the type AbstractAnimal
		//AbstractAnimal animal = new AbstractAnimal();
		
		Student student = new Student("zhangsan", 20, "java1711");
		student.showInfo();
		student.speak();
		student.walk();
		student.study();
		
		System.out.println("---------------");
		//站在动物Animal这个角度去看这个学生
		AbstractAnimal animal = new Student("zhangsan", 20, "java1711");
		animal.showInfo();
		
		System.out.println("---------------");
		//站在人Person这个角度去看这个学生
		AbstractPerson person = new Student("zhangsan", 20, "java1711");
		person.showInfo();
		person.walk();
		person.speak();
		
		System.out.println("---------------");
		Student stu = (Student) person;
		stu.study();
	}
}
