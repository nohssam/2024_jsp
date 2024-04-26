package com.guestbook2.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guestbook2.db.GuestBook2DAO;


public class DeleteOKCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String idx = request.getParameter("idx");
		int result = GuestBook2DAO.getDelete(idx);
		
		if(result>0) {
			// 이미지 삭제하기 (숙제)
			return "GuestBook2Controller?cmd=list";
		}else {
			return "guestbook2/error.jsp";
		}
	}
}
