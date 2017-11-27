package com.situ.day5;

import org.junit.Test;

public class OOPDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("zhangsan");
		
		System.out.println(student.toString());
	}
	
	void show(int a,char b,double c){}

	int show(int a,double c,char b){return 0;}
	
	@Test
	public void test1() {
		Son son = new Son();
		son.show();
	}
	
	@Test
	public void test2() {
		//以学生的角度去看new出来的这个学生
		Student student = new Student("zhangsan", 20, "java1711");
		student.show();
		student.study();
	}
	
	@Test
	public void test3() {
		//我现在是以Person人的角度去看这个学生
		Person person = new Student("zhangsan", 20, "java1711");
		person = new Teacher();
		person.show();
		//person.study();
		
		Student student = (Student)person;//不是所有的人都是学生,所以需要强制类型转换
		student.study();
	}

}
