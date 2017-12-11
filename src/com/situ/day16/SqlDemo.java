package com.situ.day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

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
	
	@Test
	public void testLogin() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String userName = "dhfidfh' OR 1=1 -- ";
		String userPassword = "37458347";
		try {
			connection = JDBCUtil.getConnection();
			//3、写sql语句
			String sql = "SELECT * FROM USER WHERE NAME='"+userName+"' AND PASSWORD='"+userPassword+"';";
			//4、创建Statement
			statement = connection.createStatement();
			//5、执行sql语句
			//	 更新：delete/update/insert  executeUpdate()  返回值int：表示影响的行数.
			//   查询：select               executeQuery()    返回结果集：ResultSet
			resultSet = statement.executeQuery(sql);
			//System.out.println(resultSet);
			List<User> list = new ArrayList<User>();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String password = resultSet.getString("password");
				User user = new User(id, name, password);
				list.add(user);
			}
			for (User user : list) {
				System.out.println(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection, statement, resultSet);
		}
	}
	
	@Test
	public void testPreparedStatementLogin() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String userName = "dhfidfh' OR 1=1 -- ";
		String userPassword = "37458347";
		try {
			connection = JDBCUtil.getConnection();
			//3、写sql语句
			String sql = "SELECT * FROM USER WHERE NAME=? AND PASSWORD=?;";
			//4、创建Statement
			preparedStatement = connection.prepareStatement(sql);
			// 设置参数的值                   参数位置,参数值
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, userPassword);
			//5、执行sql语句
			resultSet = preparedStatement.executeQuery();
			/*List<User> list = new ArrayList<User>();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String password = resultSet.getString("password");
				User user = new User(id, name, password);
				list.add(user);
			}
			for (User user : list) {
				System.out.println(user);
			}*/
			if (resultSet.next()) {
				System.out.println("登陆成功");
			} else {
				System.out.println("登陆失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection, preparedStatement, resultSet);
		}
	}
	
	@Test
	public void testAddUser() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String name = "wangwu";
		String password = "123";
		try {
			connection = JDBCUtil.getConnection();
			String sql = "INSERT INTO USER(NAME,PASSWORD) VALUES(?,?);";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			int count = preparedStatement.executeUpdate();
			if (count > 0) {
				System.out.println("插入成功");
			} else {
				System.out.println("插入失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection, preparedStatement);
		}
	}
	
	@Test
	public void testBatch() {
		//当前时间以毫秒
		long start = System.currentTimeMillis();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String name = "wangwu";
		String password = "123";
		try {
			connection = JDBCUtil.getConnection();
			String sql = "INSERT INTO USER(NAME,PASSWORD) VALUES(?,?);";
			preparedStatement = connection.prepareStatement(sql);
			for (int i = 1; i <= 1000; i++) {
				preparedStatement.setString(1, name + i);
				preparedStatement.setString(2, password);
				preparedStatement.addBatch();
			}
			int[] count = preparedStatement.executeBatch();
			for (int i = 0; i < count.length; i++) {
				System.out.println(count[i]);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.clearBatch();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			JDBCUtil.close(connection, preparedStatement);
		}
		long end = System.currentTimeMillis();
		long delta = end - start;
		System.out.println("时间：" + delta);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
