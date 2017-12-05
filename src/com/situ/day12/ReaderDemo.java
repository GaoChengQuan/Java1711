package com.situ.day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
	
	@Test
	public void fileInputStreamCopy() {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		
		try {
			inputStream = new FileInputStream("javac.png");
			outputStream = new FileOutputStream("javac_back.png");
			byte[] buffer = new byte[1024];
			int length = 0;
			while ((length = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, length);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
