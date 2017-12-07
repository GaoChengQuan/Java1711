package com.situ.day14.db;

public class MySql extends AbstractDB{
	@Override
	public void getConnection() {
		System.out.println("MySql.getConnection()");
	}
}
