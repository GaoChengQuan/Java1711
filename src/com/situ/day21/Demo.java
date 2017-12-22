package com.situ.day21;

public class Demo {
	public static void main(String[] args) {
		double d1 = 1234.3435;
		double d2 = 1234.3400;
		System.out.println(d1 - d2);
		if (((d1 - d2) - 0.0035) <= 0.0001) {
			System.out.println("==");
		} else {
			System.out.println("!=");
		}
	}
}
