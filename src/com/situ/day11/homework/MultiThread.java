package com.situ.day11.homework;

/**
 * 创建3个线程，实现分别打印ABCABCABCABCABCABCABCABCABC(假设打印10次)
 */
public class MultiThread implements Runnable {
	Object prev;
	Object self;
	String name;

	public MultiThread(Object prev, Object self, String name) {
		super();
		this.prev = prev;
		this.self = self;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count = 10;
		while (count > 0) {
			synchronized (prev) {
				synchronized (self) {
					System.out.print(name + " ");
					count--;
					self.notify();// 唤醒当前线程
				}
				try {
					prev.wait();// 让前一个处于阻塞状态
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();

		MultiThread paMultiPrint1 = new MultiThread(c, a, "A");
		MultiThread paMultiPrint2 = new MultiThread(a, b, "B");
		MultiThread paMultiPrint3 = new MultiThread(b, c, "C");
		new Thread(paMultiPrint1).start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(paMultiPrint2).start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Thread(paMultiPrint3).start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

