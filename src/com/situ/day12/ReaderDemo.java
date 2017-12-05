package com.situ.day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

public class ReaderDemo {
	@Test
	public void fileReaderTest() {
		try {
			FileReader fileReader = new FileReader("demo.txt");
			//public int read() 读取单个字符。如果已到达流的末尾，则返回 -1 
			int read1 = fileReader.read();
			System.out.println((char)read1);//a
			int read2 = fileReader.read();
			System.out.println((char)read2);//b
			int read3 = fileReader.read();
			System.out.println((char)read3);//c
			int read4 = fileReader.read();
			System.out.println(read4);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fileReader2() {
		try {
			FileReader fileReader = new FileReader("demo.txt");
			char[] buffer = new char[10];
			int length = 0;
			while ((length = fileReader.read(buffer)) != -1) {
				System.out.println(Arrays.toString(buffer));
				Arrays.fill(buffer, ' ');;
				System.out.println(length);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fileReader3() {
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader("demo.txt");
			fileWriter = new FileWriter("demo_bak.txt");
			char[] buffer = new char[1024];
			int length = 0;
			while ((length = fileReader.read(buffer)) != -1) {
				fileWriter.write(buffer, 0, length);
				System.out.println(length);
			}
			//fileWriter.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
