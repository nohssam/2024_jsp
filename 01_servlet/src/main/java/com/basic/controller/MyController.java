package com.basic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.basic.model.Command;
import com.basic.model.JoinCommand;
import com.basic.model.JoinOKCommand;
import com.basic.model.LoginCommand;
import com.basic.model.LoginOKCommand;
import com.basic.model.LogoutCommand;
import com.basic.model.ProfileCommand;
import com.basic.model.ProfileOKCommand;



@WebServlet("/MyController")
public class MyController extends HttpServlet {
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
			case "join" : comm = new JoinCommand();  break;
			case "join_ok" : comm = new JoinOKCommand(); break;
			case "login_ok" : comm = new LoginOKCommand(); break;
			case "login" : comm = new LoginCommand(); break;
			case "profile" : comm = new ProfileCommand(); break;
			case "profile_ok" : comm = new ProfileOKCommand(); break;
			case "logout" : comm = new LogoutCommand(); break;
		}
		String path = comm.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
	}
}





