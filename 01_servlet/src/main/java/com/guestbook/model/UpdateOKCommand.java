package com.guestbook.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guestbook.db.GuestDAO;
import com.guestbook.db.GuestVO;


public class UpdateOKCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String idx = request.getParameter("idx");
		
		GuestVO gvo = new GuestVO();
		gvo.setIdx(idx);
		gvo.setName(request.getParameter("name"));
		gvo.setSubject(request.getParameter("subject"));
		gvo.setContent(request.getParameter("content"));
		gvo.setEmail(request.getParameter("email"));
		
		int result = GuestDAO.getUpdate(gvo);
		return "GuestBookController?cmd=onelist&idx="+idx;
	}
}
