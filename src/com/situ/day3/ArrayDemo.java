package com.situ.day3;

import org.junit.Test;

public class ArrayDemo {
	@Test
	public void test1() {
		int num = 3;
		//1. int[] 存放int类型的数组
		//2. 长度是14
		//3. 只能存放int类型
		int[] array = new int[4];
		array[0] = 3;
		array[1] = 4;
		array[2] = 1;
		array[3] = 7;
		//System.out.println(array.length);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
		System.out.println("-------------");
		
		for (int i = array.length - 1; i >= 0 ; i--) {
			System.out.print(array[i]);
		}
	}
	
	@Test
	public void test2() {
		int[] array = {1, 2, 6, 7};
		int[] array1 = new int[]{1, 2, 6, 7};
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 6, 7};
		int sum = sum(array);
		System.out.println(sum);
	}
	
	public static int sum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			sum = sum + array[i];
		}
		
		return sum;
	}
	
	@Test
	public void test4() {
		int[] array = {1, 2, 6, 7};
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	@Test
	public void test5() {
		int[] array = {1, 2, 6};
		array = null;
		System.out.println(array[0]);
	}
	
	
	@Test
	public void test6() {
		//元素类型[]  数组名 = new 元素类型[数组长度];
        //int[]   array     = new  int[3];
		String[] arr1 = new String[3];
		boolean[] arr2 = new boolean[3];
		double[] arr3 = new double[3];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
	
	
	
	
	
	
	
	
	
}
