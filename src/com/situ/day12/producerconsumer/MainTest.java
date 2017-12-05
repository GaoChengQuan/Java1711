package com.situ.day12.producerconsumer;

public class MainTest {
	public static void main(String[] args) {
		//生产者和消费者操作的是同一个Panzi。
		Panzi panzi = new Panzi();
		//启动一个线程去生产蛋糕
		ProducerThread producerThread = new ProducerThread("Producer", panzi);
		producerThread.start();
		//启动一个线程去消费蛋糕
		ConsumerThread consumerThread = new ConsumerThread("Consumer", panzi);
		consumerThread.start();
	}
}
