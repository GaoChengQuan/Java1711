package com.situ.day8;

public class Student {
	private String name;
	private Integer age;
	private EnumGender enumGender;
	
	public Student() {
		super();
	}

	public Student(String name, Integer age, EnumGender enumGender) {
		super();
		this.name = name;
		this.age = age;
		this.enumGender = enumGender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public EnumGender getEnumGender() {
		return enumGender;
	}

	public void setEnumGender(EnumGender enumGender) {
		this.enumGender = enumGender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", enumGender=" + enumGender.getValue() + "]";
	}

}
