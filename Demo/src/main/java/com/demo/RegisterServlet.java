//register srevlet page 
package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter oPrintWriter=resp.getWriter();
		oPrintWriter.println("<h2>Welcome to Register Servlet</h2>");
		
		String name=req.getParameter("user_name");
		oPrintWriter.println("<h2>Name: "+name+"</h2>");
		
		String password=req.getParameter("user_password");
		oPrintWriter.println("<h2>Password: "+password+"</h2>");
		
		String email=req.getParameter("user_email");
		oPrintWriter.println("<h2>Email: "+email );
		
		String gender=req.getParameter("user_gender");
		oPrintWriter.println("<h2>Gender: "+gender+"</h2>");
		
		String course=req.getParameter("user_course");
		oPrintWriter.println("<h2>Course: "+course+"</h2>");
		
		
		
		
	}

}
