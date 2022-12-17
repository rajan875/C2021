package org.my;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public void ProcessService(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		try (PrintWriter oPrintWriter=resp.getWriter()) {
			

			
			String name=req.getParameter("user_name");
			oPrintWriter.println("<h2>Name is: "+name+"</h2>");
			
			String password=req.getParameter("user_password");
			oPrintWriter.println("<h2>Password is: "+password+"</h2>");
			
			String email=req.getParameter("user_email");
			oPrintWriter.println("<h2>Email: "+email );
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}


}
