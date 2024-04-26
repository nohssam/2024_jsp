package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guestbook.model.DeleteCommand;
import com.guestbook.model.DeleteOkCommand;
import com.guestbook.model.ListCommand;
import com.guestbook.model.OneListCommand;
import com.guestbook.model.UpdateCommand;
import com.guestbook.model.UpdateOKCommand;
import com.guestbook.model.WriteCommand;
import com.guestbook.model.WriteOKCommand;
import com.ict.db.LogInCommand;
import com.ict.model.Command;
import com.ict.model.LogInOKCommand;

@WebServlet("/UserMember")
public class UserMember extends HttpServlet {
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
			case "login":   comm = new LogInCommand() ;  break;
			case "login_ok":   comm = new LogInOKCommand() ;  break;
		}
		String path = comm.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
	}
}

















