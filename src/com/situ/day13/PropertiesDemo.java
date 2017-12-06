package com.situ.day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;
import org.junit.internal.requests.FilterRequest;

public class PropertiesDemo {
	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		hashMap.put("name", "zhangsan");
		Hashtable hashtable = new Hashtable(); 
		hashtable.put("name", "zhangsan");
		
		Properties properties = new Properties();
		//properties.put(key, value);
		properties.setProperty("name", "zhangsan");
		properties.setProperty("age", "20");
		
		System.out.println(properties);
		
		//遍历集合
		Set<String> keys = properties.stringPropertyNames();//类似于Map接口中的ketSet
		for (String key : keys) {
			//通过键     找值
			String value = properties.getProperty(key);
			System.out.println(key + " : " + value);
		}
	}
	
	@Test
public void load() {
	//创建集合 HashTable子类
	Properties properties = new Properties();
	FileInputStream fileInputStream = null;
	try {
		fileInputStream = new FileInputStream("config.properties");
		//把流所对应文件中的数据，读取到集合
		properties.load(fileInputStream);
		System.out.println(properties);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (fileInputStream != null) {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
	
	@Test
	public void load1() {
		//创建集合 HashTable子类
		Properties properties = new Properties();
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("config1.properties");
			//把流所对应文件中的数据，读取到集合
			properties.load(fileReader);
			System.out.println(properties);
			System.out.println(properties.getProperty("name"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
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
	public void store() {
		//1.创建Properties集合
		Properties properties = new Properties();
		properties.setProperty("name", "lisi");
		properties.setProperty("age", "20");
		
		FileWriter fileWriter = null;
		try {
			 fileWriter = new FileWriter("config1.properties");
			 properties.store(fileWriter, "save person");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
