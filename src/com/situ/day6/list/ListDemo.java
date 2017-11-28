package com.situ.day6.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args) {
		Student student1 = new Student("zhangsan", 20);
		Student student2 = new Student("lisi", 20);
		Student student3 = new Student("wangwu", 20);
		Student[] students = new Student[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student3);
		list.remove(student3);
		
		Teacher teacher = new Teacher();
		teacher.setName("zhaoliu");
		//list.add(teacher);
		
		// 遍历的的三种方式：
		//1.数组的方式
		for (int i = 0; i < list.size(); i++) {
			Student student = list.get(i);
			System.out.println(student);
		}
		System.out.println("----------------");
		
		//2.foreach
		for (Student student : list) {
			System.out.println(student);
		}
		
		System.out.println("--------------");
		//3.迭代器遍历
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {//下一个有没有
			Student student = iterator.next();//移到下一个并取出来
			System.out.println(student);
		}
	}
}
