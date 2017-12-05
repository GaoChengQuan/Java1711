package com.situ.day12;

public class Outer {
	public void show() {
		System.out.println("Outer.show()");
	}
	
	//内布类
	public class Inner {
		public void show() {
			System.out.println("Outer.Inner.show()");
		}
	}
}
