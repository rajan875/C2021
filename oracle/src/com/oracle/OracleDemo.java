package com.oracle;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OracleDemo {

	public static void main(String[] args) 
	throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
		
		Statement st=con.createStatement();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter table name: ");
		
		String tname=br.readLine();
		
		String qr="create table " +tname+ "(eno number(3)primary key,Ename varchar2(20), Esal float(5))";
		
		st.executeUpdate(qr);
		System.out.println(tname+"table is created succ.");
		
		st.close();
		con.close();
		
	}

}
