package com.situ.day8;

import org.junit.Test;
import org.omg.CORBA.TRANSACTION_MODE;

public class StringDemo {
	public static void main(String[] args) {
		//String str = "abc";
		String str1 = new String("abC");
		String str2 = new String("abc");
		
		// equals比较字符串里面的内容是不是相等
		if (str1.equals(str2)) {
			System.out.println("equals");
		}
		System.out.println();
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("equalsIgnoreCase");
		}
		
		//== 内存的地址是不是相等，其实看这两个引用是不是指向在堆new出来的
		// 同一个对象
		if (str1 == str2) {
			System.out.println("==");
		}
	}
	
	@Test
	public void test1() {
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		
		if (str1.equals(str2)) {
			System.out.println("equals");
		}
		
		System.out.println(str1 == str2);//false
		System.out.println(str1 == str3);//true
		System.out.println(str2 == str3);//false
	}
	
	@Test
	public void test3() {
		String str = "java AndroidA";
		System.out.println(str.length());//12
		System.out.println(str.charAt(5));//A
		System.out.println(str.indexOf('A'));//5 如果此字符串中没有这样的字符，则返回 -1。 
		int index = 'A';
		System.out.println(str.indexOf('A', 7));//12
		System.out.println(str.indexOf("And"));//5
		
		System.out.println(str.lastIndexOf('A'));//12
		System.out.println(str.lastIndexOf('A', 7));//5
	}
	
	@Test
	public void test4() {
		String str = "java AndroidA";
		System.out.println(str.contains("And"));//true
		System.out.println(str.startsWith("java A"));//true
		System.out.println(str.startsWith("And", 5));//true
		System.out.println(str.endsWith("idA"));//true
		System.out.println(str.isEmpty());//false
		System.out.println("".isEmpty());//true
	}
	
	@Test
	public void test5() {
		//String str = "java And";
		char[] array = {'j', 'a', 'v', 'a', ' ', 'A', 'n', 'd'};
		String str = new String(array);
		System.out.println(str);//java And
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			System.out.print(c + " ");//j a v a   A n d 
		}
	}
	
	@Test
	public void test6() {
		String str = "java Android";
		System.out.println(str.replace('A', 'B'));
	}
	
	@Test
	public void test7() {
		String str = "java Android";
		String[] array = str.split(" ");
		for (String string : array) {
			System.out.println(string);
		}
		//java
		//Android
	}
	
	@Test
	public void test8() {
		String str = "java Android";
		System.out.println(str.substring(5));//Android
		System.out.println(str.substring(5, 8));//And
	}
	
	@Test
	public void test9() {
		String str = "   java Android   ";
		System.out.println(str.trim());//java Android
	}
	
	@Test
	public void test10() {
		String str1 = "---java Android---";
		String str2 = "------";
		String str3 = "-";
		String str4 = "--java";
		String str = null;//null.length();
		String strResult = trim(str);
		if (strResult != null) {
			System.out.println(strResult);
		} else {
			System.out.println("null");
		}
	}

	private String trim(String str) {
		if (str == null) {
			return null;
		}
		
		int beginIndex = 0;
		int endIndex = str.length() - 1;
		while ((beginIndex <= endIndex) 
				&& (str.charAt(beginIndex) == '-')) {
			beginIndex++;
		}
		
		while ((beginIndex <= endIndex) 
				&& (str.charAt(endIndex) == '-')) {
			endIndex--;
		}
		
		return str.substring(beginIndex, endIndex + 1);
	}
	
	@Test
	public void test11() {
		String str1 = "java";
		String str2 = "ios";
		String str3 = "android";
		//String string = new String();
		String str = str1 + str2 + str3;//每一次字符串相加都会new String()
		System.out.println(str);
		
		StringBuilder builder1 = new StringBuilder();
		builder1.append(str1);
		builder1.append(str2);
		builder1.append(str3);
		
		//链式编程 this
		StringBuilder builder = new StringBuilder();
		builder.append(str1).append(str2).append(str3);
		
		StringBuffer buffer = new StringBuffer(str1);
		buffer.append(str2);
		buffer.append(str3);
		
		String string = "java" + "ios" + "android";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
