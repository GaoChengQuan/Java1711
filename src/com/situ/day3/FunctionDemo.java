package com.situ.day3;

import org.junit.Test;

/**
 * 
 *
 */
public class FunctionDemo {
	
	public static void main(String[] args) {
		int maxVlaue1 = max(8, 5);
		System.out.println("max: " + maxVlaue1);
		int maxVlaue2 = max(18, 5);
		System.out.println("max: " + maxVlaue2);
		int maxValue = max(45, 67);
	}
	
	/**
	 * 计算两个数的最大值
	 * @param num1 传入的第一个数
	 * @param num2 传入的第一个数
	 * @return 返回比较的最大值
	 */
	public static int max(int num1, int num2) {
		// int max = num1 >= num2 ? num1 : num2;
		// return max;
		return num1 >= num2 ? num1 : num2;
	}
	
	@Test
	public void test1() {
		int num1 = 3;
		int num2 = 5;
		int max = 0;
//		if (num1 >= num2) {
//			max = num1;
//		} else {
//			max = num2;
//		}
		
		max = num1 >= num2 ? num1 : num2;
	}
	
	
	@Test
	public void test2() {
		int num1 = 3;
		int num2 = 5;
		int max = num1 >= num2 ? num1 : num2;
	}
	
	
	
	
	
	
}
