package com.situ.day4;

import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		//在开发的时候主方法中的代码尽量是方法的调用。
		//你看一下main方法调用的这些方法就知道这个程序的执行逻辑。
		//不需要把所有的代码都看完你才知道整个代码的逻辑。
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生的数量");
		int count = scanner.nextInt();
		Student[] students = new Student[count];
		//输入学生信息到学生数组
		inputStudents(students);
		//打印学生信息
		printStudents(students);
		//根据条件搜索
		searchByCondition(students);
	}

	private static void searchByCondition(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("根据条件查询学生信息");
			System.out.println("根据姓名来查询：1");
			System.out.println("根据年龄来查询：2");
			System.out.println("根据性别来查询：3");
			System.out.println("退出这个程序: 0");
			int num = scanner.nextInt();
			
			if (num == 0) {
				System.out.println("退出程序");
				break;
			}
			
			switch (num) {
			case 1://根据姓名来查询
				System.out.println("请输入要查询的学生的姓名：");
				String nameSearch = scanner.next();
				searchByName(students, nameSearch);
				break;
			case 2://根据年龄来查询
				System.out.println("请输入要查询的学生的年龄：");
				int ageSearch = scanner.nextInt();
				searchByAge(students, ageSearch);
				break;
			case 3://根据性别来查询
				System.out.println("请输入要查询的学生的性别：");
				String genderSearch = scanner.next();
				searchByGender(students, genderSearch);
				break;
			default:
				System.out.println("非法的输入");
				break;
			}
			
		}
	}

	private static void searchByGender(Student[] students, String genderSearch) {
		boolean isSearchByGenderFound = false;
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			String gender = student.getGender();
			if (genderSearch.equals(gender)) {//找到了
				System.out.println(student);
				isSearchByGenderFound = true;
			}
		}
		if (isSearchByGenderFound == false) {
			System.out.println("没有该性别的学生");
		}
	}

	private static void searchByAge(Student[] students, int ageSearch) {
		boolean isSearchByAgeFound = false;
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			int age = student.getAge();
			if (ageSearch == age) {//找到了
				System.out.println(student);
				isSearchByAgeFound = true;
			}
		}
		if (isSearchByAgeFound == false) {
			System.out.println("没有该年龄的学生");
		}
	}

	private static void searchByName(Student[] students, String nameSearch) {
		boolean isSearchByNameFound = false;
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			String name = student.getName();
			if (nameSearch.equals(name)) {//找到了
				System.out.println(student);
				isSearchByNameFound = true;
			}
		}
		if (isSearchByNameFound == false) {
			System.out.println("没有该姓名的学生");
		}
	}

	private static void printStudents(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			System.out.println(student.toString());
		}
	}

	private static void inputStudents(Student[] students) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("请输入姓名:");
			String name = scanner.next();
			System.out.println("请输入年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入性别：");
			String gender = scanner.next();
			System.out.println("请输入班级：");
			String className = scanner.next();
			Student student = new Student(name, age, className, gender);
			students[i] = student;
		}
	}
}
