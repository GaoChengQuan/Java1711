package com.situ.day12.producerconsumer;

import java.util.LinkedList;

public class Panzi {
	private LinkedList<Cake> linkedList = new LinkedList<Cake>();

	public static void main(String[] args) {
		LinkedList<Cake> list = new LinkedList<Cake>();
		//list.addFirst(new Cake());
		list.addLast(new Cake());
		//list.removeLast();
		list.removeFirst();
	}

	public synchronized void putCake(Cake cake) {
		linkedList.addLast(cake);//加到队列的最后面
		notifyAll();//生产了蛋糕要通知正在wait的ConsumerThread消费者
		System.out.println("putCake notifyAll");
	}

	public synchronized Cake getCake() {
		if (linkedList.size() <= 0) {
			try {
				System.out.println("getCake wait");
				wait();//当前盘子里面没有Cake，所以需要等待Producer生产蛋糕
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Cake cake = linkedList.removeFirst();
		return cake;
	}
}
