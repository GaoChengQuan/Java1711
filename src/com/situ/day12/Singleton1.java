package com.situ.day12;

public class Singleton1 {
	private static final Singleton1 instance = new Singleton1();

	//私有化构造方法，收回了new这个对象控制权
	private Singleton1() {
	}
	
	public static Singleton1 getInstance() {
		return instance;
	}
}
