package com.situ.day6.inter;

public class GeZi extends AbstractBird implements IFly{

	@Override
	public void egg() {
		System.out.println("GeZi.egg()");
	}

	@Override
	public void fly() {
		System.out.println("GeZi.fly()");
	}

}
