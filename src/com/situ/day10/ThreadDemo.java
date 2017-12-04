package com.situ.day10;

import org.junit.Test;

public class ThreadDemo {
	public static void main(String[] args) {
//		OddThread oddThread = new OddThread();
//		oddThread.start();
//		EvenThread evenThread = new EvenThread();
//		evenThread.start();
		
		NumThread oddThread = new NumThread("奇数线程", 1);
		oddThread.start();
		NumThread evenThread = new NumThread("偶数线程", 2);
		evenThread.start();
		System.out.println(Thread.currentThread().getName());
	}
	
	
	
	
	public static void main1(String[] args) {
		MyThread thread = new MyThread();
		//thread.run();
		thread.start();
		for (int i = 0; i < 50; i++) {
			System.out.println("main: " + i);
		}
		System.out.println("ThreadDemo.main()");
	}
	
	@Test
	public void test1() {
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}
	
	@Test
	public void test2() {
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);
		}
		System.out.println("-----------------");
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
		}
	}
	
	
}
