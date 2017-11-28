package com.situ.day6.inter;

public class InterfaceTest {
	public static void main(String[] args) {
		DaYan daYan = new DaYan();
		daYan.egg();
		daYan.fly();
		
		//从鸟的角度看这个大雁
		AbstractBird bird = new DaYan();
		bird.egg();
		
		//从能不能非IFly这个角度去看大雁
		IFly fly = new DaYan();
		fly.fly();
	}
}
