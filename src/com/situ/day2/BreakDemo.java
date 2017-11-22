package com.situ.day2;

import java.beans.beancontext.BeanContext;
import java.util.Scanner;

import org.junit.Test;

public class BreakDemo {
	
	@Test
	public void test1() {
		int score = 59;
		switch (score) {
		case 58:
			System.out.println("58");
			break;
		case 59:
			System.out.println("59");
			break;
		case 60:
			System.out.println("60");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
	
	@Test
	public void test2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = scanner.nextInt();
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		
		if (month < 0 || month > 12) {
			System.out.println("非法的月份");
			return;
		}
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30天");
			break;
		case 2:
			if (((year % 4 == 0) && (year % 100 != 0)) 
					|| (year % 400 == 0)) {
				System.out.println("29天");
			} else {
				System.out.println("28天");
			}
			break;
		default:
			System.out.println("defalut");
			break;
		}
	}

}	
