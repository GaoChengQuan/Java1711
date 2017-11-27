package com.situ.day6;

public class Teacher extends AbstractPerson{
	private double salary;
	
	@Override
	public void speak() {
		System.out.println(name + "正在说话");
	}

	@Override
	public void showInfo() {
		System.out.println("Teacher [salary=" + salary + ", name=" + name + ", age=" + age + "]");
	}
	
	public void teach() {
		System.out.println(name + "正在教学");
	}

	@Override
	public String toString() {
		return "Teacher [salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
