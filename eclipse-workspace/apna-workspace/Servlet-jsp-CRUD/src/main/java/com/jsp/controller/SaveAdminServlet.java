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

@WebServlet("/saveadmin")
public class SaveAdminServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Admin admin = new Admin();
		admin.setName(req.getParameter("name1"));
		admin.setPhone(Long.parseLong(req.getParameter("phone1")));
		admin.setEmail(req.getParameter("email1"));
		admin.setPassword(req.getParameter("password1"));

		AdminService service = new AdminService();
		Admin admin2 = service.saveAdmin(admin);
		if (admin2 != null) {
			RequestDispatcher dispatcher= req.getRequestDispatcher("SaveAdmin.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("AdminHome.jsp");
				dispatcher.include(req, resp);
		}
	}
}
