package com.situ.day3;

import org.junit.Test;

public class BreakContinueDemo {
	@Test
	public void test1() {
		for (int i = 1; i <= 6; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		test(3);
	}
	
	public static void test(int num) {
		for (int i = 1; i <= 6; i++) {
			if (i == num) {
				break;
			}
			System.out.println(i);
		}
	}
	
	@Test
	public void test3() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					break;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
