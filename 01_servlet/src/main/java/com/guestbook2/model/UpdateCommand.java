package com.guestbook2.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guestbook2.db.GuestBook2DAO;
import com.guestbook2.db.GuestBook2VO;


public class UpdateCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String idx = request.getParameter("idx");
		GuestBook2VO g2vo = GuestBook2DAO.getOneList(idx);
		if(g2vo != null) {
			request.setAttribute("g2vo", g2vo);
			return "guestbook2/update.jsp";
		}else {
			return "guestbook2/error.jsp";
		}
	}
}
