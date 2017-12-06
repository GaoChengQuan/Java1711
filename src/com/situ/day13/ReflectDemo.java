package com.situ.day13;

import java.lang.reflect.Constructor;

import org.junit.Test;

public class ReflectDemo {
	@Test
	public void classTest() throws ClassNotFoundException {
		//1.Class.forName(类路径)
		Class clazz1 = Class.forName("com.situ.day13.Person");
		//2.类名.class
		Class clazz2 = Person.class;
		//3.对象.getClass();
		Person person = new Person("zhangsan");
		Class clazz3 = person.getClass();
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz2 == clazz3);
	}
	
	@Test
	public void constructorTest() {
		Class clazz = Person.class;
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
			//System.out.println(constructor.getModifiers());
			//System.out.println(constructor.getName());
			//System.out.println(constructor.getParameterTypes());
		}
		System.out.println("-----------");
		Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : declaredConstructors) {
			System.out.println(constructor);
		}
	}
	
	@Test
	public void constructorTest1() throws Exception {
		Class clazz = Person.class;
		Constructor constructor = clazz.getConstructor(String.class);
		System.out.println(constructor);
		System.out.println("---------");
		Constructor declaredConstructor = clazz.getDeclaredConstructor(int.class);
		System.out.println(declaredConstructor);
	}
	
}
