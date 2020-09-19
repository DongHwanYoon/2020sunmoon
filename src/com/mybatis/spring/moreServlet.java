package com.mybatis.spring;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/moreSevlet")
public class moreServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		String queryString = req.getQueryString();
		String noValue = req.getParameter("no");
		
		out.println("<table border='1'>");
		
		for (int i = 1; i <10; i++) {
			out.println("    <tr>");
			out.println("        <td>" + noValue + " : " + i + " = </td>");
			out.println("        <td>" + (Integer.parseInt(noValue) * i) + "</td>");
			out.println("    </tr>");
		}
		out.println("</table>");
		out.close();
	}
}
