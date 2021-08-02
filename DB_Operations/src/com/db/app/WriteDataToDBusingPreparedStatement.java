package com.db.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WriteDataToDBusingPreparedStatement {

	
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "root");
		
		String inserQuery = "INSERT INTO students(name, age, address) VALUES(?, ?, ?)";
		
		PreparedStatement statement = connection.prepareStatement(inserQuery);
		statement.setString(1, "Tom");
		statement.setInt(2, 26);
		statement.setString(3, "Gujrat");

		int rows = statement.executeUpdate();
		
		System.out.println("Data insterted sucessfully, "+rows+" rows afre created...");
	}
}
