package com.basic.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.basic.db.BasicDAO;
import com.basic.db.BasicVO;


public class ProfileOKCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		
		BasicVO bvo = BasicDAO.getDetail(id);
		request.setAttribute("bvo", bvo);
		return "basic/detail.jsp";
	}
}
