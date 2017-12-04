package com.in28minutes.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/login.do")

public class loginServelte extends HttpServlet
	{
	
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException,IOException {
		 request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
		
				
}
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			 throws ServletException,IOException 
	 {
		 request.setAttribute("user_id", request.getParameter("user_id"));
		 request.setAttribute("name", request.getParameter("name"));
		 request.setAttribute("password", request.getParameter("password"));
		 request.getRequestDispatcher("/WEB-INF/view/details.jsp").forward(request, response);
		 
		
		}
		 
	 }

