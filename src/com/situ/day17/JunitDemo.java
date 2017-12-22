package com.situ.day17;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitDemo {
	@BeforeClass
	public static void beforeClassPrint() {
		System.out.println("JunitDemo.beforeClassPrint()");
	}
	
	@Before
	public void beforePrint() {
		System.out.println("JunitDemo.beforePrint()");
	}
	
	@Test
	public void print1() {
		System.out.println("JunitDemo.print1()");
	}
	
	@Test
	public void print2() {
		System.out.println("JunitDemo.print2()");
	}
	
	@After
	public void	afterPrint() {
		System.out.println("JunitDemo.afterPrint()");
	}
	
	@AfterClass
	public static void afterClassPrint() {
		System.out.println("JunitDemo.afterClassPrint()");
	}
}
