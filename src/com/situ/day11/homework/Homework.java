package com.situ.day11.homework;

import java.awt.image.DataBufferInt;
import java.beans.IntrospectionException;
import java.util.Scanner;

import javax.sound.sampled.Port;
import javax.swing.BoundedRangeModel;

import org.junit.Test;

public class Homework {
	
	/*1、编写一个收银台收款程序，if
	定义输入----单价、数量、金额
	定义输出----应收金额、找零
	使用double类型变量
	2、当总价>=500时候打八折
	3、考虑程序出现异常的情况，如：收款金额小于应收金额
	      若收款金额大于等于应收金额，则计算找零后输出
	      若收款金额小于应收金额，输出错误信息。*/
	@Test
	public void test() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入数量:");
		double count = scanner.nextDouble();
		System.out.println("请输入单价：");
		double unitPrice = scanner.nextDouble();
		double price = count * unitPrice;
		if (price >= 500) {
			price *= 0.8;//price = price * 0.8;
		}
		
		System.out.println("请输入金额：");
		double inputPrice = scanner.nextDouble();
		double retrunPrice = inputPrice - price;
		if (retrunPrice >= 0) {
			System.out.println("应收金额: " + price + ", 找零:" + retrunPrice);
		} else {
			System.out.println("顾客给的钱不够");
		}
	}
	
//	1、输出一下结构：
//	1
//	12
//	123
//	1234
//	12345
	@Test
	public void test2() {
		for (int i = 1; i <= 5 ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		// i=1  1
		// i=2  12
	}

//	2、int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
//	求出上面数组中0-9分别出现的次数
	@Test
	public void test3() {
		int[] scoreArray={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int[] countArray = new int[10];
		for (int i = 0; i < scoreArray.length; i++) {
			switch (scoreArray[i]) {
			case 0:
				countArray[0]++;// countArray[0] = countArray[0] + 1;
				break;
			case 1:
				countArray[1]++;
				break;
			case 2:
				countArray[2]++;
				break;
			case 3:
				countArray[3]++;
				break;
			case 4:
				countArray[4]++;
				break;
			case 5:
				countArray[5]++;
				break;
			case 6:
				countArray[6]++;
				break;
			case 7:
				countArray[7]++;
				break;
			case 8:
				countArray[8]++;
				break;
			case 9:
				countArray[9]++;
				break;
			default:
				System.out.println("default");
				break;
			}
		}
		
		for (int i = 0; i < countArray.length; i++) {
			System.out.println(i + "出现的次数： " + countArray[i]);
		}
	}
	
//	3、int[] score={0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
//	要求求出其中的奇数个数和偶数个数。
	@Test
	public void test4() {
		int[] scoreArray = {0,0,1,2,3,5,4,5,2,8,7,6,9,5,4,8,3,1,0,2,4,8,7,9,5,2,1,2,3,9};
		int oddCount = 0;
		int evenCount = 0;
		for (int i = 0; i < scoreArray.length; i++) {
			if (scoreArray[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		
		System.out.println("奇数个数: " + oddCount + ", 偶数个数: " + evenCount);
	}
	
//	5、题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
	@Test
	public void test5() {
		Scanner scanner = new Scanner(System.in);
		String numStr = scanner.next();// "12321"
		char[] numArray = numStr.toCharArray();
		boolean isHuiWen = true;//初始化认为是回文
		for (int i = 0; i < numArray.length / 2; i++) {
			if (numArray[i] != numArray[numArray.length - 1 - i]) {
				isHuiWen = false;
				break;
			}
		}
		if (isHuiWen == true) {
			System.out.println("这是回文");
		} else {
			System.out.println("这不是回文");
		}
	}
	
	
	@Test
	public void test12() {
		char c3 = '\u0041';
		System.out.println(c3);
	}
	
//	1、获取一个字符串在另一个字符串中出现的次数。
//    "abkkcdkkefkkskk"      "kk"
//	public static int getSubCount(String str, String key) ;
	@Test
	public void test13() {
		String str = "abkkcdkkefkkskk";
		String key = "kk";
		int count = getSubCount(str, key);
		System.out.println(count);
	}

	private int getSubCount(String str, String key) {
		int index = 0;
		int count = 0;
		while ((index = str.indexOf(key, index)) != -1) {
			count++;
			index += key.length();
		}
		
		return count;
	}


//	1、题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，
//	奖金可提10%；利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
//	高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，
//	可提成5%；40万到60万之间时高于40万元的部分，可提成3%；60万到100万之间时，
//	高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
//	从键盘输入当月利润，求应发放奖金总数？
	@Test
	public void test23() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入利润：");
		double profit = scanner.nextDouble();
		double bonus = 0;
		if (profit > 0 && profit <= 10) {
			bonus = profit * 0.1;
		} else if (profit > 10 && profit <= 20) {
			bonus = 10 * 0.1 + (profit - 10) * 0.075;
		} else if (profit > 20 && profit <= 40) {
			bonus = 10 * 0.1 + 10 * 0.075 + (profit - 20) * 0.05;
		}
		
		System.out.println("奖金: " + bonus);
	}
	
//	2、现在有如下的一个数组：
//	  int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5} ;
//	  要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，生成的新数组为：
//	  int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5} ;
//	思路：生活中的问题解决 = 程序中的解决；
//	  1、 确定出不为0的个数，这样可以开辟新数组；
//	  2、 从旧的数组之中，取出内容，并将其赋给新开辟的数组；
	@Test
	public void test33() {
		int[] oldArr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5} ;
		int count = count(oldArr);
		int[] newArr = new int[count];
		
		int newArrayIndex = 0;
		for (int i = 0; i < oldArr.length; i++) {
			if (oldArr[i] != 0) {
				newArr[newArrayIndex] = oldArr[i];
				newArrayIndex++;
			}
		}
		
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}

	//计算数组出去0后数组元素个数
	private int count(int[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				count++;
			}
		}
		
		return count;
	}
	
	
//	3、
//	现在给出两个数组：
//	  · 数组A：“1，7，9，11，13，15，17，19：；
//	  · 数组b：“2，4，6，8，10”
//	  两个数组合并为数组c，按升序排列。
	

	@Test
	public void test44() {
		long round = Math.round(11.3);
		System.out.println(round);
	}
}
