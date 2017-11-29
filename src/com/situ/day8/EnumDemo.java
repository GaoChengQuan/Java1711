package com.situ.day8;

import org.junit.Test;

public class EnumDemo {
	public static final String SPRING = "spring";
	public static final String SUMMER = "summer";
	
	public static final String MALE = "male";
	public static final String FEMAL = "femal";
	
	public static void main(String[] args) {
		EnumGender1 enumGender = EnumGender1.MALE;
		System.out.println(enumGender);
		
		if (enumGender == EnumGender1.MALE) {
			System.out.println("==");
		}
		
		if (enumGender.equals(EnumGender1.MALE)) {
			System.out.println("equals");
		}
		
		switch (enumGender) {
		case MALE:
			System.out.println("male");
			break;
		case FEMALE:
			System.out.println("female");
			break;
		default:
			break;
		}
	}
	
	@Test
	public void test3() {
		Student student = new Student("zhangsan", 20, EnumGender.MALE);
		System.out.println(student);
	}
}
