package com.guestbook2.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guestbook2.db.GuestBook2DAO;
import com.guestbook2.db.GuestBook2VO;


public class ListCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 전체 목록 가져오기 
		List<GuestBook2VO> list = GuestBook2DAO.getList();
		request.setAttribute("list", list);
		return "guestbook2/list.jsp";
	}
}
