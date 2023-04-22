package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

@WebServlet("/delteservlet")
public class DeleteServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		AdminService service = new AdminService();
		Admin admin=service.deleteAdmin(id);
		
		if (admin!=null) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("AdminHome.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("DeleteAdmin.jsp");
			dispatcher.include(req, resp);
			
		}
		
	}
}
