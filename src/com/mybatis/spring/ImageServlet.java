package com.mybatis.spring;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImageServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("image servlet created!!!");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		System.out.println("image servlet is on now!!!");
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<img src = /images/been.jpeg>");
		out.print("</body>");
		out.print("</html>");
		
		for (int i = 0; i <10; i++) {
			System.out.println("구구단 결과는!!!!");
			System.out.println();
		}
	}
	
	@Override
	public void destroy() {
		System.out.println("image servlet killed!!!");
	} 
}
