package com.cookie.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cookie.db.CookieDAO;
import com.cookie.db.CookieVO;


public class CookieJoinOKCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		CookieVO cvo = new CookieVO();
		cvo.setId(request.getParameter("id"));
		cvo.setPwd(request.getParameter("pwd"));
		cvo.setName(request.getParameter("name"));
		cvo.setEmail(request.getParameter("email"));
		cvo.setAddr(request.getParameter("addr"));
		cvo.setPhone(request.getParameter("phone"));
		
		int result = CookieDAO.getJoin(cvo);
		if(result>0) {
			return "cookie/loginForm.jsp";
		}else {
			return "cookie/joinForm.jsp";
		}
	}
}
