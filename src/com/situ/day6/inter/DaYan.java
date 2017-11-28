package com.situ.day6.inter;

public class DaYan extends AbstractBird implements IFly{

	@Override
	public void egg() {
		System.out.println("DaYan.egg()");
	}

	@Override
	public void fly() {
		System.out.println("DaYan.fly()");
	}

}
