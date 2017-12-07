package com.situ.day14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
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
	
	@Test
	public void test2() throws Exception {
		Teacher teacher = new Teacher();
		System.out.println(teacher);
		changeField(teacher);
		System.out.println(teacher);
	}
	//写一个函数，传入任意的对象，
	//可以将对象里面String类型的属性中的a改成b。
	private void changeField(Object object) throws Exception {
		//1.获取对应的Class
		Class clazz = object.getClass();
		//2.获得所有的Fields[]
		Field[] fields = clazz.getDeclaredFields();
		//3.遍历所有的Fields[],如果是String类型的，将包含b的改为a
		for (Field field : fields) {
			//3.1 判断如果是String.class才修改
			if (field.getType() == String.class) {
				//3.2 获得Field的值
				field.setAccessible(true);
				//person.getName()/person.name
				String oldValue = (String) field.get(object);
				//3.3 将获得的值中的a改为b
				String newValue = oldValue.replace("a", "b");
				//3.4将修改后的值设置到Field
				//person.setName("zhansgan")
				field.set(object, newValue);
			}
		}
	}
	
}
