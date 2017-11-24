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
		Student student = new Student("zhangsan", 20, "jaav1711", "男", 180);
		
	}

}
