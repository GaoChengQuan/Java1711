package com.situ.day2;

import org.junit.Test;

public class ForDemo {
	@Test
	public void test1() {
		//1、循环条件的初始化。
		//2、循环条件的控制。
		//3、循环条件的改变(趋向于循环条件的结束)
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello World!");
		}
	}
	
	//1+2+3+4+....+100=5050
	@Test
	public void test2() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
	//计算1-100以内7的倍数的个数
	//7,14,21...
	@Test
	public void test3() {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				count++;
			}
		}
		System.out.println("coune: " + count);
	}
	
//	****
//	****
//	****
	@Test
	public void test4() {
		// ****
		for (int i = 1; i <= 4; i++) {
			System.out.print("*");
		}
		System.out.println();
		//*
		//*
		//*
		for (int i = 1; i <= 3; i++) {
			System.out.println("*");
		}
		System.out.println("-----------------------");
		for (int i = 1; i <= 3 ; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	*
//	**
//	***
//	****
//	*****
	@Test
	public void test5() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// i=1  1
		// i=2  2
		// i=3  3
	}

	@Test
	public void test6() {
		// i
		// 1*1=1
		// 2*1=2  2*2
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
	
}
