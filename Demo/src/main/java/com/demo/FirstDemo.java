//Implementing servlet

package com.demo;
import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Date;
//import java.time.format.DateTimeFormatterBuilder;

import javax.servlet.*;

public class FirstDemo implements Servlet{
	
	//cycle method
	ServletConfig config;
	public void init(ServletConfig config) {
		this.config=config;
		System.out.println("FirstDemo.init()");
	}
	
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
		System.out.println("FirstDemo.service()");
		response.setContentType("text/html");
		PrintWriter outPrintWriter=response.getWriter();
		outPrintWriter.println("output from servlet");

		
	}
	
	public void destory() {
		System.out.println("FirstDemo.destory()");
	}
	
	//non cycle method
	public ServletConfig getServletConfig() {
		return this.config;
	}
	
	public String getServletInfo() {
		return "my first servlet ";
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
}























