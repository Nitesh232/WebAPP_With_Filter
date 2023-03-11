package com.nitesh.Filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class ValFilter implements Filter {
	
	

	public void init(FilterConfig fConfig) throws ServletException {

		
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String sid = request.getParameter("sid");
			String sname = request.getParameter("sname");
			String sage = request.getParameter("sage");
			String semail = request.getParameter("semail");
			String smobile = request.getParameter("smobile");
			
			String sid_error = "", sname_error = "", sage_error = "", semail_error = "", smobile_error = "";
			
			boolean flag = true;
			
			if(sid == null || sid.equals("")) {
				sid_error = "SID is required";
				flag = false;
			}else {
				if(!sid.startsWith("S-")) {
					sid_error = "SID is Invalid, It must start with S-XXX";
					flag = false;
				}
				
			}	
			
			
			if(sname == null || sname.equals("")) {
				
				sname_error = "SNAME is required";	
				flag = false;
			}
			
			
			
			if(sage == null || sage.equals("")) {
				sage_error = "SAGE is required";
				flag = false;
			}else {
				int age =Integer.parseInt(sage);
				if(age < 18) {
					sage_error = "Student age is less than 18, Age must be between 18 to 30 years";
					flag = false;
				}
				if(age > 30) {
					sage_error = "Student age is greater than 30, Age must be between 18 to 30 years";
					flag = false;
				}
			}
			
			
			
			if(semail == null || semail.equals("")) {
				semail_error = "SEMAIL is required";
				flag = false;
			}else {
				if(!semail.endsWith("@gmail.com")) {
						semail_error = "SEMAIL is Invalid ";
						flag = false;
					}
				}				
			
			
			if(smobile == null || smobile.equals("")) {
				smobile_error = "SMobile is required";	
				flag = false;
			}else {
				if(!smobile.startsWith("+91-")) {
					smobile_error = "SMobile is Invalid, It must starts with +91-";	
					flag = false;
				}
			}
			
			
			
			
			if(flag == true) {
				chain.doFilter(request, response);
			}else {
				
				out.println("<html>");
				out.println("<body>");
				out.println("<h2>Nitesh Software Solutions</h2>");
				out.println("<h3>Student Registration Details</h3>");
				out.println("<form method='POST' action='./reg'>");
				out.println("<table>");
				out.println("<tr>");
				out.println("<td>Student ID : </td>");
				out.println("<td><input type='text' name='sid' value='"+sid+"'/></td>");
				out.println("<td><font color='red' size='5'><b>"+sid_error+"</b></td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td>Student Name : </td>");
				out.println("<td><input type='text' name='sname' value='"+sname+"'/></td>");
				out.println("<td><font color='red' size='5'><b>"+sname_error+"</b></td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td>Student Age : </td>");
				out.println("<td><input type='text' name='sage' value='"+sage+"'/></td>");
				out.println("<td><font color='red' size='5'><b>"+sage_error+"</b></td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td>Student Email : </td>");
				out.println("<td><input type='text' name='semail' value='"+semail+"'/></td>");
				out.println("<td><font color='red' size='5'><b>"+semail_error+"</b></td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td>Student Mobile : </td>");
				out.println("<td><input type='text' name='smobile' value='"+smobile+"'/></td>");
				out.println("<td><font color='red' size='5'><b>"+smobile_error+"</b></td>");
				out.println("</tr>");
				
				out.println("<tr>");				
				out.println("<td><input type='submit' value='Registration'/></td>");
				out.println("</tr>");				
				
				
				out.println("</form></table></body></html>");
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		
	}

	
	
	public void destroy() {
		
		
	}

	

	
	
}
