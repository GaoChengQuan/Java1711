package com.situ.day14.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import org.junit.Test;

public class DBDemo {
	public static void main(String[] args) throws Exception {
//		AbstractDB db = new Oracle();
//		db.getConnection();
		
		InputStream inputStream = new FileInputStream("src/com/situ/day14/db/config.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		String className = properties.getProperty("className");
		//AbstractDB db = new Oracle();
		Class clazz = Class.forName(className);
		Constructor constructor = clazz.getConstructor();
		AbstractDB db = (AbstractDB) constructor.newInstance();
		db.getConnection();
	}
}
