package com.situ.day9;

public class ErrorDemo {
	public static void main(String[] args) {
		fun();//function
		System.out.println("ErrorDemo.main()");
	}

	private static void fun() {
		fun();
		System.out.println("ErrorDemo.fun()");
	}
}
