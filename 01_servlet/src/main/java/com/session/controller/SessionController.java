package com.session.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.session.model.Command;
import com.session.model.SessionJoinCommand;
import com.session.model.SessionJoinOKCommand;
import com.session.model.SessionLoginCommand;
import com.session.model.SessionLoginOKCommand;
import com.session.model.SessionLogoutCommand;
import com.session.model.SessionProfileCommand;
import com.session.model.SessionProfileOKCommand;


@WebServlet("/SessionController")
public class SessionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String cmd = request.getParameter("cmd");
		Command comm = null;
		switch (cmd) {
			case "s_join" : comm = new SessionJoinCommand();  break;
			case "s_join_ok" : comm = new SessionJoinOKCommand(); break;
			case "s_login" : comm = new SessionLoginCommand(); break;
			case "s_login_ok" : comm = new SessionLoginOKCommand(); break;
			case "s_profile" : comm = new SessionProfileCommand(); break;
			case "s_profile_ok" : comm = new SessionProfileOKCommand(); break;
			case "s_logout" : comm = new SessionLogoutCommand(); break;
		}
		String path = comm.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
	}

}
