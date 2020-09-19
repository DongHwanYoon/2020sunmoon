package com.mybatis.spring;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/resServlet")
public class ResServlet extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		int result = Integer.parseInt(request.getParameter("no"));
		String msg;
		
		if (result % 2 == 1) {
			msg = "허가";
		} else {
			msg = "거부";
		}
		
		out.write("<html>");
		out.write("    <body>");
		out.write("        과목명 : " + request.getParameter("classinfo") + "<br/>");
		out.write("        신청결과 : " + request.getParameter("apply") + "<br/>");
		out.write("        수강신청이 " + msg + "되었습니다." + "<br/>");
		out.write("    </body>");
		out.write("</html>");
	}
}
