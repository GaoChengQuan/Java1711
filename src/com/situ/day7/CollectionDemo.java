package com.situ.day7;

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
	
}
