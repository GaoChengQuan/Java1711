package com.situ.day6.inter;

public class MiFeng extends AbstractInsect implements IFly{

	@Override
	public void chanLuan() {
		System.out.println("MiFeng.chanLuan()");
	}

	@Override
	public void fly() {
		System.out.println("MiFeng.fly()");
	}

}
