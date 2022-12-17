package com.student;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Conn {
	static Connection con;
	public static Connection createC() throws SQLException {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
				
			//create the connection
			String user="root";
			String password="12345";
			String url="jdbc:mysql://localhost:3306/newdb";
				
			con =DriverManager.getConnection(url, user, password);
				
		} catch (ClassNotFoundException e) {

				e.printStackTrace();
		}
			
		return con;
	}
}
