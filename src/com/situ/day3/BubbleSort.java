package com.situ.day3;

public class BubbleSort {
	public static void main(String[] args) {
		// second   mill 千分之一 
		// 1秒=1000毫秒
		// 1000*60*60*24*365=315亿
		long start = System.currentTimeMillis();
		
		int[] array={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		//int[] array = {40,17,21,1};
		for (int i = 1; i <= array.length - 1; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		long end = System.currentTimeMillis();
		long delta = end - start;
		System.out.println("time: " + delta);
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
