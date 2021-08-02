package com.db.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteDataToDB {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "root");
			Statement statement = connection.createStatement();
			String inserQuery = "INSERT INTO students (name, age, address) VALUES ('TOM', 35, 'Delhi')";
			int rows = statement.executeUpdate(inserQuery);
			System.out.println("Data insterted sucessfully, "+rows+" rows are created");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}


