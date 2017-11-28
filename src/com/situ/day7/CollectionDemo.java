package com.situ.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class CollectionDemo {
	@Test
	public void test1() {
		Student student1 = new Student("zhangsan", 20);
		Student student2 = new Student("lisi", 20);
		Student student3 = new Student("wangwu", 20);
		Set<Student> set = new HashSet<Student>();
		//HashSet<Student> set1 = new HashSet<Student>();
		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student3);
		
		for (Student student : set) {
			System.out.println(student);
		}
	}
	
	@Test
	public void test2() {
		// CN 中华人民共和国  US 美利坚合众国
		// key value
		Map<String, String> map = new HashMap<String, String>();
		map.put("CN", "中华人民共和国");
		map.put("US", "美利坚合众国");
		
		String value1 = map.get("CN");
		System.out.println(value1);
		
		System.out.println("-------------");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " ：" + value);
		}
		
		System.out.println("--------------");
		//keySet获得map中所有的key放在Set里面，
		//key是不能重复的
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			String value = map.get(key);
			System.out.println(value);
		}
		
		System.out.println("--------------");
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			String value = map.get(key);
			System.out.println(value);
		}
	}
	
	@Test
	public void test3() {
		Student student1 = new Student("zhangsan", 20);
		Student student2 = new Student("lisi", 20);
		Student student3 = new Student("wangwu", 20);
		Set<Student> set = new HashSet<Student>();
		//HashSet<Student> set1 = new HashSet<Student>();
		set.add(student1);
		set.add(student2);
		set.add(student3);
		
		
		Object[] stuArray =  set.toArray();
		for (Object object : stuArray) {
			System.out.println(object);
		}
		
		System.out.println("----------");
		Student[] students = new Student[set.size()];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		//数组转换成List集合
		List<Student> list = Arrays.asList(students);
		for (Student student : list) {
			System.out.println(student);
		}
		
		System.out.println("------------########");
		Student[] array = list.toArray(new Student[0]);
		//Object[] array2 = list.toArray();
		for (Student student : array) {
			System.out.println(student);
		}
	}
	
	
	@Test
	public void test4() {
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 3;
		array[2] = 4;
		//Syntax error
		//List<int> list = new ArrayList<int>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		//自动拆箱和装箱
		//Integer integer = new Integer(1);
		Integer integer = 1;//自动装箱，等价于上面操作
		int i = integer.intValue();
		integer = integer + 2;//自动拆箱，integer.intValue() + 2
		//在将得到的和3赋给integer又做了一个自动装箱操作。
	}
	
	@Test
	public void test5() {
		String str = "20";
		//第一种方式
		int value1 = Integer.parseInt(str);
		System.out.println(value1);
		
		//第二种方式
		Integer integer = new Integer(str);
		int value2 = integer.intValue();
		System.out.println(value2);
		
		// xxx value = XXX.parseXXX(String str);
		String str2 = "3.14";
		double d = Double.parseDouble(str2);
		System.out.println(d);
		String str3 = "true";
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(bool);
	}
	
	@Test
	public void test6() {
		Student student = new Student();
		System.out.println(student.getTemp());
		student.setTemp(0);
		System.out.println(student.getTemp());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
	
}
