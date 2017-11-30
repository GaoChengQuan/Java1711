package com.situ.day9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;

public class ExceptionDemo {
	@Test
	public void test1()  {
		int num1 = 3;
		int num2 = 0;
		
		int result = div(num1, num2);
		System.out.println(result);
		
		try {
			int result2 = div2(num1, num2);
		} catch (Exception e) {
			System.out.println("*******");
			e.printStackTrace();
		}
	}

	private int div(int num1, int num2) {
		/*if (num2 != 0) {
			int result = num1 / num2;
		}*/
		int result = 0;
		try {
			//  需要检测的代码(可能会抛出异常，也可能不会抛出异常)
			result = num1 / num2;
		} catch (Exception e) {
			//捕获异常后处理异常
			System.out.println("++++++++");
			System.out.println(e);
		} finally {
			//一定会被执行的代码(不管异常出不出现)(数据库释放链接)
			System.out.println("-------");
		}
		System.out.println("dfdfdf");
		return result;
	}
	
	public int div2(int num1, int num2) throws Exception{
		return num1 / num2;
	}
	
	@Test
	public void test11() {
		//Unhandled exception type FileNotFoundException
		try {
			InputStream inputStream = new FileInputStream(new File("a.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
