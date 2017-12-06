package com.situ.day13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.Test;

public class CommonsIODemo {
	@Test
	public void filenameUtilsTest() {
		String fileName = "HelloWorld.doc.java";
		//String fileName = "HelloWorld";
		int index = fileName.lastIndexOf(".");
		String substring = fileName.substring(index + 1);
		System.out.println(substring);
		
		String extension = FilenameUtils.getExtension(fileName);
		System.out.println(extension);
		
//		 a/b/c.txt --> c.txt
//		 a.txt     --> a.txt
//		 a/b/c     --> c
//		 a/b/c/    --> ""
		fileName = "C:\\doc\\HelloWorld.doc.java";
		String name = FilenameUtils.getName(fileName);
		System.out.println(name);
		
		boolean isExtension = FilenameUtils.isExtension(fileName, "java");
		System.out.println(isExtension);
	}
	
	@Test
	public void fileUtilsTest() throws IOException {
		String data = "dhfiodhfoiahgiorthotehoiht sghfog";
		FileUtils.writeStringToFile(new File("aaa"), data);
		String str = FileUtils.readFileToString(new File("aaa"));
		System.out.println(str);
		
		FileUtils.copyFile(new File("javac.png"), new File("jj.png"));
	}
}
