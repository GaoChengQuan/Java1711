package com.situ.day9;

import java.util.regex.Pattern;

import org.junit.Test;

public class RegularDemo {
	@Test
	public void testMatch() {
		//public boolean matches(String regex)
		//告知此字符串是否匹配给定的正则表达式。 
		//当且仅当此字符串匹配给定的正则表达式时，返回 true 
		// dhfgiudfgh@gmail.com  4564644@qq.com.cn
		String regex = "[a-zA-Z0-9_-]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9]+)+";
		String mail = "dfh8ery834_eyr-@eryeyr_.com.cn.gov";
		if (mail.matches(regex)) {
			System.out.println("是邮箱");
		} else {
			System.out.println("不是邮箱");
		}
		//产生的结果和上面完全相同：
		if (Pattern.matches(regex, mail)) {
			System.out.println("是邮箱");
		} else {
			System.out.println("不是邮箱");
		}
	}
	
	@Test
	public void testSplit() {
		//public String[] split(String regex)
		// 根据匹配给定的正则表达式来拆分此字符串。
		//结尾是23的数字字符串来切割
		// [0-9]+   \d+
		String regex = "\\d*23";
		String str = "dhfiher7823hdf23iahAHD3433dfhidh123dhf";
		String[] splitArray = str.split(regex);
		for (String string : splitArray) {
			System.out.println(string);
		}
	}
	
	
	@Test
	public void testReplace() {
		//public String replaceAll(String regex, String replacement)
		//使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串
		String str = "dhfiher7823hdf23iahAHD3433dfhidh123dhf";
		String result = str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(result);
	}
	
	@Test
	public void test() {
		// \.
		String str = "\\.";
		System.out.println(str);
		String result = "a.b \\.".replaceAll("\\\\.", "abc");
		System.out.println(result);
	}
}
