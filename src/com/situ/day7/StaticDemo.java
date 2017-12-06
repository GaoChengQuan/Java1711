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
		int max = Math.max(2, 3);
		System.out.println(max);
		
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
	
	@Test
	public void test4() {
		int[] array = new int[]{3, 4, 1, 67, 5};
		int max = ArrayUtil.max(array);
		System.out.println(max);
		ArrayUtil.bubbleSort(array);
		System.out.println("----");
		for (int i : array) {
			System.out.print(i + "  ");
		}
		
		//ArrayUtil arrayUtil = new ArrayUtil();
		//arrayUtil.max(array);
	}
	
}
