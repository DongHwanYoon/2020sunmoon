package com.mybatis.spring;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class FirstServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("first servlet created!!!");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		System.out.println("my first servlet is on now!!!");
	}
	
	@Override
	public void destroy() {
		System.out.println("first servlet killed!!!");
	} 
}
