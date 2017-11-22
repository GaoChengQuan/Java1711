package com.situ.day2;

import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

import org.junit.Test;

public class WhileDemo {
	@Test
	public void test1() {  
		//1、循环条件的初始化。
		int i = 1;
		//2、循环条件的控制。
		while (i <= 5) {
			System.out.println("Hello World!");
			//3、循环条件的改变(趋向于循环条件的结束)
			i++;
		}
	}
	
	// 1+2+3+...+100=5050
	@Test
	public void test2() {
		//1、循环条件的初始化。
		int i = 1;
		//2、循环条件的控制。
		int sum = 0;
		while (i <= 100) {
			System.out.println(i);
			sum = sum + i;// sum += i;
			//3、循环条件的改变(趋向于循环条件的结束)
			i++;
		}
		System.out.println("sum: " + sum);
	}
	
	// 1*9=9     2*9=18  	3*9=27  ....   	8*9=72   9*9=81
	// 1*9=1*9   2*9=2*9  	3*9=3*9  ....   8*9=8*9  9*9=9*9
	@Test
	public void test3() {
		//1、循环条件的初始化。
		int i = 1;
		//2、循环条件的控制。
		while (i <= 9) {
			System.out.print(i + "*9=" + (i * 9) + "\t");
			//3、循环条件的改变(趋向于循环条件的结束)
			i++;
		}

	}
	
	@Test
	public void test4() {
		//生成1-1000以内的随机数
		// Returns a double value with a positive sign, 
		// greater than or equal to 0.0 and less than 1.0.
		// 			0.0 -------------- 0.999999999...
		// *1000	0.0 -------------- 999.99999999....
		// +1		1.0 -------------- 1000.9999999....
		// (int)	1   -------------- 1000
		int random = (int)(Math.random() * 1000 + 1);
		System.out.println(random);
	}
	
	@Test
	public void test5() {
		Scanner scanner = new Scanner(System.in);
		int pwd = 0;
		do {
			System.out.println("请输入密码：");
			pwd = scanner.nextInt();
		} while (123 != pwd);
	}
	
	
	
	
}
