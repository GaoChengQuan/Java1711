package com.situ.day13;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;

    private Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}
	
	private Person(int age) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}
