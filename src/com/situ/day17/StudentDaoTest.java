package com.situ.day17;

import org.junit.Test;

import com.situ.day16.Student;

public class StudentDaoTest {

	@Test
	public void testSelect() {
		StudentDao studentDao = new StudentDao();
		Student student = studentDao.select(1);
	}
	
	@Test
	public void testSelectAll() {
		
	}

}
