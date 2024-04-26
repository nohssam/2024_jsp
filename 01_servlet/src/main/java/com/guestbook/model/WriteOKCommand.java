package com.guestbook.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guestbook.db.GuestDAO;
import com.guestbook.db.GuestVO;

public class WriteOKCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String subject = request.getParameter("subject");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String content = request.getParameter("content");
		
		GuestVO gvo = new GuestVO();
		gvo.setName(name);
		gvo.setSubject(subject);
		gvo.setEmail(email);
		gvo.setPwd(pwd);
		gvo.setContent(content);
		
		int res = GuestDAO.getInsert(gvo);
		
		return "GuestBookController?cmd=list";
	}
}
