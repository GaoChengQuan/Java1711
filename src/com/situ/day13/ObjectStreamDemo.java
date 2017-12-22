package com.situ.day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.junit.Test;

public class ObjectStreamDemo {
	@Test
	public void objectOutputStreamTest() {
		Person person = new Person("zhangsan");
		OutputStream outputStream = null;
		ObjectOutputStream objectOutputStream = null;
		
		try {
			//本身这里也是写文件的操作，只不过这个写文件比较特殊，是写的对象。
			//在原来FileOutputStream的基础上包了一层，实现可以将对象写到文件。
			outputStream = new FileOutputStream("person");
			objectOutputStream = new ObjectOutputStream(outputStream);
			objectOutputStream.writeObject(person);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (objectOutputStream != null) {
				try {
					objectOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Test
	public void objectInputstreamTest() {
		InputStream inputStream = null;
		ObjectInputStream objectInputStream = null;
		
		try {
			inputStream = new FileInputStream("person");
			objectInputStream = new ObjectInputStream(inputStream);
			Object readObject = objectInputStream.readObject();
			Person person = (Person) readObject;
			System.out.println(person);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (objectInputStream != null) {
				try {
					objectInputStream.close();
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
