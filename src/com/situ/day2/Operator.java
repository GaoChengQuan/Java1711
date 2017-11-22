package com.situ.day2;

import org.junit.Test;

public class Operator {
	public static void main(String[] args) {//main
		System.out.println("Operator.main()");//syst
	}
	
	@Test
	public void test() {
		System.out.println(8 + 2);
		System.out.println(8 - 2);
		System.out.println(8 * 2);
		System.out.println(8 / 2);
		System.out.println(8 % 2);//0
		System.out.println(8 % 3);//2
		System.out.println(2 % 7);//2
	}
	
	@Test
	public void test2() {
		//&&短路运算
		int num1 = 3;
		int num2 = 5;
		System.out.println(num1 < 0 && num1++ < num2);
		System.out.println(num1);//3
		System.out.println(num2);//5
		// || 短路
		System.out.println(num1 > 0 || num1++ < num2);
		System.out.println(num1);//3
		System.out.println(num2);//5
	}
	
	@Test
	public void test3() {
		int num = 5;
		num += 3;//num = num + 3;
		num *= 3;// num = num * 3
		System.out.println(num);
	}
	
	@Test
	public void test4() {
		int num1 = 6;
		int num2 = 5;
		int max = num1 > num2 ? num1 : num2;
		System.out.println("max: " + max);
		
		int max2;
		//if(boolean)
		if (num1 > num2) {
			max2 = num1;
		} else {
			max2 = num2;
		}
		System.out.println("max2: " + max2);
	}
	
	@Test
	public void test5() {
		String name = "zhangsan";
		int age = 20;
		//我的年龄是20
		System.out.println("我的年龄是" + age);
		String str = "20";
		//我20岁了
		System.out.println("我" + age + "岁了");
		System.out.println(10 + 20 + "" + 30);//3030
		System.out.println("" + 10 + 20 + 30);//102030
	}
	
	@Test
	public void test6() {
		int i = 3;
		i++;//i=i+1;
		System.out.println(i);//4
//		System.out.println(i++);//4
		System.out.println(++i);//5
	}
	
	
	@Test
	public void test7() {
		int num1 = 3;
		int num2 = 5;
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("after num1: " + num1);
		System.out.println("after num2: " + num2);
	}
	
	
	
	
	
	
}
