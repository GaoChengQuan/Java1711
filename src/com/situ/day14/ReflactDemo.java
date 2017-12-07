package com.situ.day14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflactDemo {
	@Test
	public void test1() throws Exception {
		//Person person = new Person();
		//person.setName("zhangsan");
		
		//1.Class
		//Class clazz = Person.class;
		Class clazz = Class.forName("com.situ.day14.Person");
		Constructor constructor = clazz.getDeclaredConstructor();
		//调用构造方法实例化对象
		Person person = (Person) constructor.newInstance();
		//person.setName("zhangsan");
		//Method method = clazz.getMethod("setName", String.class, Integer.class);
		Method method = clazz.getMethod("setName", new Class[]{String.class, Integer.class});// int[] array = new int[];
		//method.invoke(person, "zhangsan", 12);
		method.invoke(person, new Object[]{"zhangsan", 12});
		System.out.println(person);
	}
	
	
	
	
	
	
	
}
