package com.situ.day12;

public class SingletonTest {
	public static void main(String[] args) {
//		Singleton singleton1 = new Singleton();
//		Singleton singleton2 = new Singleton();
//		System.out.println(singleton1 == singleton2);
		
		Singleton singleton;
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);
	}
}
