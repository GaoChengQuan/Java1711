package com.situ.day5.cal;

import org.junit.Test;

public class CalTest {
	public static void main(String[] args) {
		Add add = new Add();
		add.setNum1(3);
		add.setNum2(5);
		int result = add.getResult();
		System.out.println(result);
	}
	
	@Test
	public void test() {
		Add add = new Add(3, 5);
		int result = add.getResult();
		System.out.println(result);
	}
	
	
	@Test
	public void test2() {
		Cal cal = new Add(3, 5);
		int result = cal.getResult();
		System.out.println(result);
	}
	
	@Test
	public void test3() {
		//Cannot instantiate the type Cal
		Cal cal = new Cal(3, 5);
		int result = cal.getResult();
		System.out.println(result);
	}
	
	
	
	
}
