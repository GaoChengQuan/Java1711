package com.situ.day2;

import java.util.Scanner;

import org.junit.Test;

public class IfDemo {
	@Test
	public void test1() {
		if (boolean) {
			System.out.println("test1");
		} else if (condition) {
			
		} else if (condition) {
			
		} else {
			
		}
	}

	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生成绩：");
		int score = scanner.nextInt();
		
		if (score > 100 || score < 0) {
			System.out.println("非法输入");
			return;
		}
		
		if (score >= 90 && score <= 100) {
			System.out.println("优秀");
		} else if (score >= 80 && score < 90) {
			System.out.println("良好");
		} else if (score >= 70 && score < 80) {
			System.out.println("一般");
		} else if (score >= 60 && score < 70) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
	}

	@Test
	public void test3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();
		// 1、能被4整除，但是不能被100整除 &&
		// ||
		// 2、能被400整除
		// (() && ()) || ()
		if (((year % 4 == 0) && (year % 100 != 0)) 
				|| (year % 400 == 0)) {
			System.out.println("是闰年");
		} else {
			System.out.println("不是闰年");
		}

	}

}
