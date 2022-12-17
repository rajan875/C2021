package my.com;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registersv extends HttpServlet{

	private static final long serialVersionUID = 1L;
	String name,email,password,sql;
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		resp.setContentType("text/html");
		name=req.getParameter("username");
		email=req.getParameter("useremail");
		password=req.getParameter("userpassword");
		
		PrintWriter out=resp.getWriter();
//		out.println(name);
//		out.println(email);
//		out.println(password);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","12345");
			
			sql="insert into register(username,email,password) values(?,?,?)";
			PreparedStatement oStatement=conn.prepareStatement(sql);
			oStatement.setString(1, name);
			oStatement.setString(2, email);
			oStatement.setString(3, password);
			
			oStatement.executeUpdate();
			
//			out.println(name+" "+email+" "+password+" "+"Register successfully");
			req.getRequestDispatcher("/login.jsp").include(req, resp);	
			
		} catch (Exception e) {
			e.printStackTrace();
			out.println("error");
			
		}
	}
}
