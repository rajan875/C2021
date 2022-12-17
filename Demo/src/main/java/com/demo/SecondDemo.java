//Generic servlet class

package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondDemo extends GenericServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("SecondDemo.service()");
		res.setContentType("text/html");
		PrintWriter oPrintWriter=res.getWriter();
		oPrintWriter.println("output from servlet");
		
	}

}
