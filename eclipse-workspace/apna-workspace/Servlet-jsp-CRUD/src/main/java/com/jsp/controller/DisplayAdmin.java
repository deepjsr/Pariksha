package com.jsp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;


@WebServlet("/displayadmin")
public class DisplayAdmin extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminService service = new AdminService();
		List<Admin> admins = service.getAllAdmin();
		if (admins.size() > 0) {
			req.setAttribute("list", admins);
			RequestDispatcher dispatcher = req.getRequestDispatcher("DisplayAdmin.jsp");
			dispatcher.forward(req, resp);

		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("AdminHome.jsp");
			dispatcher.include(req, resp);
			
		}
	}

}
