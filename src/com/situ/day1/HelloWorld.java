package com.situ.day1;

import javax.lang.model.element.VariableElement;

import org.junit.Test;

public class HelloWorld {

	public static void main(String[] args) {
		// int num = 9;//Syntax error on token "static", invalid
		// VariableDeclaratorId
		int bbb = 9;
		bbb = 11;
		String name = "zhangsan";
		System.out.println(name);
		name = "lisi";
		name = "di34ofhi$";
		// name = 3;
		System.out.println(name);

		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		
		System.out.println(bbb);
	}
	
	@Test
	public void test() {
		char ch = 'a';//97
		System.out.println(ch + 1);// 97+1=98 从小到大自动类型转换。
		System.out.println(ch + 2);// 97+2=99 从小到大自动类型转换。
		System.out.println((char)(ch + 1));//b 
		System.out.println((char)(ch + 2));//b 
		char ch2 = '中';
		System.out.println(ch2);//中
	}
	
	@Test
	public void test2() {
		//1、整数直接量可以直接赋值给byte、short、char,但是前提是整数直接量不能超过他们的范围。
		byte b1 = 3;
		//byte b2 = 128;//byte类型的长度是-128~+127,不能超过byte类型的范围
		//2、byte、short、char类型变量参与运算，先一律转换为int类型再运算。
		short s1 = 99;
		System.out.println(b1 + s1);
		//Type mismatch: cannot convert from int to short
		//s1 = s1 + b1;
		s1 = (short)(s1 + b1);
		
		//从大到小类型转换，可能会丢失精度
		double d = 3.14;
		int num = (int) d;
		System.out.println(num);
	}
	
	
	
}
