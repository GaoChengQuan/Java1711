package com.situ.day17;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.situ.day16.JDBCUtil;
import com.situ.day16.Student;

public class SqlDemo {
	@Test
	public void transactionDemo() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String sql1 = "UPDATE account SET money=money-1000 WHERE NAME='张三';";
		String sql2 = "UPDATE account SET money=money+1000 WHERE NAME='李四';";
		try {
			connection = JDBCUtil.getConnection();
			preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.executeUpdate();
			int i = 3 / 0;
			preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection, preparedStatement);
		}
	}
	
	@Test
	public void transactionDemo1() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String sql1 = "UPDATE account SET money=money-1000 WHERE NAME='张三';";
		String sql2 = "UPDATE account SET money=money+1000 WHERE NAME='李四';";
		try {
			connection = JDBCUtil.getConnection();
			//默认就是true,遇到executeUpdate()回去直接改变数据库，而我们是希望
			//开启事务，知道遇到commit()才去真正提交到数据库
			connection.setAutoCommit(false);
			preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.executeUpdate();
			preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.executeUpdate();
			connection.commit();//手动提交事物
		} catch (SQLException e) {
			try {
				System.out.println("rollback");
				connection.rollback();//出现异常回滚
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			JDBCUtil.close(connection, preparedStatement);
		}
	}
	
	@Test
	public void callableStatementTest() {
		Connection connection = null;
		CallableStatement callableStatement = null;
		ResultSet resultSet = null;
		try {
			connection = JDBCUtil.getConnection();
			//show_student不要加分号
			callableStatement = connection.prepareCall("CALL show_student");
			resultSet = callableStatement.executeQuery();
			while (resultSet.next()) {
				Integer id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				Integer age = resultSet.getInt("age");
				String gender = resultSet.getString("gender");
				Student student = new Student(id, name, age, gender, address);
				System.out.println(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
