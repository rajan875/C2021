package my.com;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginsv extends HttpServlet {

	private static final long serialVersionUID = 1L;
	String name,pass,sql;

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		name= req.getParameter("username");
		pass=req.getParameter("userpassword");
		PrintWriter out=resp.getWriter();
		/*
		out.println(name);
		out.println(password);
		*/
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","12345");
			
			Statement oSt=conn.createStatement();
			sql="select * from register where username='"+name+"' and password='"+pass+"' ";
			ResultSet oRS=oSt.executeQuery(sql);
			
			if (oRS.next()) {
//				out.println(name+" "+pass+ " "+"done succ..");

				req.getRequestDispatcher("/index.html").include(req, resp);		//include page
			} else {
//				out.println("fail try..");
				
				req.getRequestDispatcher("/login.jsp").include(req, resp);	
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			out.println(e);
		}
		
	}
}
