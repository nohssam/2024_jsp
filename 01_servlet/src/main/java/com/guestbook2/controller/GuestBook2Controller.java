package com.guestbook2.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.guestbook2.model.Command;
import com.guestbook2.model.DeleteCommand;
import com.guestbook2.model.DeleteOKCommand;
import com.guestbook2.model.ListCommand;
import com.guestbook2.model.OneListCommand;
import com.guestbook2.model.UpdateCommand;
import com.guestbook2.model.UpdateOKCommand;
import com.guestbook2.model.WriteCommand;
import com.guestbook2.model.WriteOKCommand;

@WebServlet("/GuestBook2Controller")
public class GuestBook2Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String cmd = request.getParameter("cmd");
		
		Command comm = null;
		
		switch (cmd) {
			case "list": comm = new ListCommand();	break;
			case "write": comm = new WriteCommand();	break;
			case "write_ok": comm = new WriteOKCommand();	break;
			case "onelist": comm = new OneListCommand();	break;
			case "delete": comm = new DeleteCommand();	break;
			case "delete_ok": comm = new DeleteOKCommand();	break;
			case "update": comm = new UpdateCommand();	break;
			case "update_ok": comm = new UpdateOKCommand();	break;
		}
		String path = comm.exec(request,response);
		request.getRequestDispatcher(path).forward(request, response);
	}
}
