package com.situ.day5.cal;

public abstract class Cal {
	protected int num1;
	protected int num2;
	
	public Cal() {
		super();
	}

	public Cal(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

//	public int getResult() {
//		System.out.println("Cal.getResult()");
//		return 0;
//	}
	
	public abstract int getResult();

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
