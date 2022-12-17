package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StdJDBC {
	public static boolean stdDB(StudentData oM) {
		boolean t=true;
		try {
			//jdbc conn...
			Connection con=(Connection) Conn.createC();
			String qString="insert into student(sname,sphone,scity) values(?,?,?)";
			
			PreparedStatement pStatement=con.prepareStatement(qString);
			pStatement.setString(1, oM.getSname());
			pStatement.setString(2, oM.getSphone());
			pStatement.setString(3, oM.getScity());
			
			pStatement.executeUpdate();
			t=true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return t;
	}
}
