package com.db.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDataFromDBApp {

	public static void main(String[] args) {
		Connection connection = null; 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			Statement statement = connection.createStatement();
			String query = "select * from students";
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println("Student ID : " + resultSet.getString("id"));
				System.out.println("Student Name : " + resultSet.getString("name"));
				System.out.println("Student Age : " + resultSet.getString("age"));
				System.out.println("Student Address : " + resultSet.getString("address"));
				System.out.println("----------------------------------------------");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
