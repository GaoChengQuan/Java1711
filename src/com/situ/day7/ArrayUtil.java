package com.situ.day7;

/**
 * 对数组操作的工具类
 */
public class ArrayUtil {
	/*
	 * Don't let anyone instantiate this class.
	 */
	private ArrayUtil() {
	}
	
	/**
	 * 求数组的最大值
	 * @param array 整数类型的数组
	 * @return 返回最大值
	 */
	public static int max(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		return max;
	}
	
	/**
	 * 冒泡排序
	 * @param array
	 */
	public static void bubbleSort(int[] array) {
		for (int i = 1; i <= array.length - 1; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
		}
	}

	/**
	 * 交换数组中任意两个位置的值
	 * @param array
	 * @param x
	 * @param y
	 */
	private static void swap(int[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}
