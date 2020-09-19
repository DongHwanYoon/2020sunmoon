package com.mybatis.spring;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstResponse extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("second servlet created!!!");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		System.out.println("second servlet is on now!!!");
		
		res.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("	<table border='1'>");
		out.print("		<tr>");
		out.print("			<td>번호</td>");
		out.print("			<td>성명</td>");
		out.print("		</tr>");
		out.print("		<tr>");
		out.print("			<td>1</td>");
		out.print("			<td>Richard</td>");
		out.print("		</tr>");
		out.print("		<tr>");
		out.print("			<td>2</td>");
		out.print("			<td>David</td>");
		out.print("		</tr>");
		out.print("	</table>");
		out.print("</body>");
		out.print("</html>");
	}
	
	@Override
	public void destroy() {
		System.out.println("second servlet killed!!!");
	} 
}
