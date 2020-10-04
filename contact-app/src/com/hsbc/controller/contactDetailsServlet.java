package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.controller.beans.Contacts;
import com.hsbc.controller.beans.User;
import com.hsbc.model.service.UserService;
import com.hsbc.model.utility.FactoryPattern;
import com.hsbc.model.utility.Type;
@WebServlet("/contactDetails")
public class contactDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public contactDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		User u=(User)session.getAttribute("userkey");
		UserService service=(UserService)FactoryPattern.getInstance(Type.SERVICE);
		List<Contacts> l=service.viewContacts(u);
		session.setAttribute("mytable", l);
		RequestDispatcher rd = request.getRequestDispatcher("table.jsp");
		rd.forward(request, response);
	}
}
