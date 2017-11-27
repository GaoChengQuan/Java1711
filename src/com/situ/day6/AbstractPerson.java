package com.situ.day6;

public abstract class AbstractPerson extends AbstractAnimal{
	
	public AbstractPerson() {
		super();
	}

	public AbstractPerson(String name, int age) {
		super(name, age);
	}

	public void walk() {
		System.out.println(name + "正在走路");
	}
	
	public abstract void speak();
}
