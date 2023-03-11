package com.nitesh.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String sid = request.getParameter("sid");
			String sname = request.getParameter("sname");
			int sage = Integer.parseInt(request.getParameter("sage"));
			String semail = request.getParameter("semail");
			String smobile = request.getParameter("smobile");
			
			out.println("<html>");
			out.println("<body>");
			out.println("<h2>Nitesh Software Solutions</h2>");
			out.println("<h3>Student Registration Details</h3>");
			out.println("<table border='1'>");
			out.println("<tr><td>Student ID : </td><td>"+sid+"</td></td></tr>");
			out.println("<tr><td>Student Name : </td><td>"+sname+"</td></td></tr>");
			out.println("<tr><td>Student Age : </td><td>"+sage+"</td></td></tr>");
			out.println("<tr><td>Student Email : </td><td>"+semail+"</td></td></tr>");
			out.println("<tr><td>Student Mobile : </td><td>"+smobile+"</td></td></tr>");
			
			out.println("</table></body></html>");
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
