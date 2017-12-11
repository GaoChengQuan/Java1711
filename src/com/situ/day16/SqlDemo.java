package com.situ.day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SqlDemo {
	@Test
	public void testQuery() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = JDBCUtil.getConnection();
			//3、写sql语句
			String sql = "SELECT * FROM student;";
			//4、创建Statement
			statement = connection.createStatement();
			//5、执行sql语句
			//	 更新：delete/update/insert  executeUpdate()  返回值int：表示影响的行数.
			//   查询：select               executeQuery()    返回结果集：ResultSet
			resultSet = statement.executeQuery(sql);
			//System.out.println(resultSet);
			List<Student> list = new ArrayList<Student>();
			while (resultSet.next()) {
				//Integer id = resultSet.getInt(1);
				//String name = resultSet.getString(2);
				Integer id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				Integer age = resultSet.getInt("age");
				String gender = resultSet.getString("gender");
				String address = resultSet.getString("address");
				Student student = new Student(id, name, age, gender, address);
				list.add(student);
			}
			for (Student student : list) {
				System.out.println(student);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection, statement, resultSet);
		}
	}

	
	
	@Test
	public void testUpdate() {
		Connection connection = null;
		Statement statement = null;
		try {
			connection = JDBCUtil.getConnection();
			//3、写sql语句
			String sql = "UPDATE student SET age=20 WHERE id=2;";
			//4、创建Statement
			statement = connection.createStatement();
			//5、执行sql语句
			//	 更新：delete/update/insert  executeUpdate()  返回值int：表示影响的行数.
			//   查询：select               executeQuery()    返回结果集：ResultSet
			int count = statement.executeUpdate(sql);
			if (count > 0) {
				System.out.println("执行成功");
			} else {
				System.out.println("执行失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection, statement);
		}
	}

}
