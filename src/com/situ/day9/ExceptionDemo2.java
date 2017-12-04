package com.situ.day9;

import org.junit.Test;

import com.situ.day5.Person;
import com.situ.day6.Student;

public class ExceptionDemo2 {
	@Test
	public void test() {
		int num1 = 3;
		int num2 = 0;
		try {
			int result = div(num1, num2);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {// Exception e = NullPointerException；
			System.out.println(e);
		}
		System.out.println("*******");
	}

	private int div(int num1, int num2) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		int[] array = new int[2];
		array[1] = 9;
		String str = null;
		str.length();
		return num1 / num2;
	}
}
