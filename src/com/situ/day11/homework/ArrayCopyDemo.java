package com.situ.day11.homework;

import java.util.Arrays;

import javax.naming.CommunicationException;

import org.junit.Test;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		//source
		int[] src = {10, 20, 30, 40 ,50};
		//destination
		int[] dest = new int[5];
		 //  src      the source array.源数组
	     //  srcPos   starting position in the source array.源数组中起始位置
	     //  dest     the destination array.目标数组
	     //  destPos  starting position in the destination data.目标数组的起始位置
	     //  length   the number of array elements to be copied.要复制的数组元素的个数
		System.arraycopy(src, 0, dest, 0, src.length);
		
		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i] + " ");
		}
	}
	
	@Test
	public void test1() {
		int[] src = {10, 20, 30, 40 ,50};
		//@param original the array to be copied
	    //@param newLength the length of the copy to be returned
	    //@return a copy of the original array, truncated or padded with zeros
	    //     to obtain the specified length
		int[] copyOf = Arrays.copyOf(src, src.length * 2);
		for (int i = 0; i < copyOf.length; i++) {
			System.out.print(copyOf[i] + " ");
		}
	}
	
//	int[] array = new int[]{23, 12, 3, 4, 55, 16};
//	找出数组中的最大值挡在数组元素最后一个位置的下一个位置。
//	{23, 12, 3, 4, 55, 16，55}
	@Test
	public void test55() {
		int[] array = new int[]{23, 12, 3, 4, 55, 16};
		
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		int[] newArray = Arrays.copyOf(array, array.length + 1);
		newArray[newArray.length - 1] = max;
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}
	
//	现在给出两个数组：
//	  · 数组a：“1，7，9，11，13，15，17，19：；
//	  · 数组b：“2，4，6，8，10”
//	  两个数组合并为数组c，按升序排列。
	@Test
	public void test56() {
		int[] a = new int[]{1, 7, 9, 11, 13, 15, 17, 19};
		int[] b = new int[]{2, 4, 6, 8, 10};
		int[] c = concat(a, b);
		Arrays.sort(c);
		for (int i : c) {
			System.out.print(i + " ");
		}
	}

	private int[] concat(int[] src1, int[] src2) {
		int len = src1.length + src2.length;
		int[] dest = new int[len];
		System.arraycopy(src1, 0, dest, 0, src1.length);
		System.arraycopy(src2, 0, dest, src1.length, src2.length);
		return dest;
	}
	
	@Test
	public void test88() {
		int[] array = {8, 17, 19, 37, 40, 73, 79, 82, 87, 95, 97, 98};
		int key = 95;
		int index = binarySearch(array, key);
		System.out.println(index);
	}
	
	/**
	 * 二分查找：查找指定元素在数组中的下标
	 * @param array 要查找数组
	 * @param key 要查找元素
	 * @return 要查找元素在数组中下标,没有该元素返回-1
	 */
	private int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key > array[mid]) {//要搜索的值在数组的右半部分
				low = mid + 1;
			} else if (key < array[mid]) {
				high = mid - 1;
			} else if (key == array[mid]) {//找到要搜索到值的情况
				return mid;
			}
		}
		
		return -1;
	}
}
