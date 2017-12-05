package com.situ.day12.producerconsumer;

import java.util.Random;

public class ProducerThread extends Thread{
	private Panzi panzi;

	public ProducerThread(String name, Panzi panzi) {
		super(name);
		this.panzi = panzi;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			Cake cake = new Cake("no:" + i);
			System.out.println(Thread.currentThread().getName() + " putCake:" + cake);
			panzi.putCake(cake);
			try {
				Thread.sleep(new Random().nextInt(5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
