package com.session.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.session.db.SessionDAO;
import com.session.db.SessionVO;



public class SessionJoinOKCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		SessionVO svo = new SessionVO();
		svo.setId(request.getParameter("id"));
		svo.setPwd(request.getParameter("pwd"));
		svo.setName(request.getParameter("name"));
		svo.setEmail(request.getParameter("email"));
		svo.setAddr(request.getParameter("addr"));
		svo.setPhone(request.getParameter("phone"));
		
		int result = SessionDAO.getJoin(svo);
		if(result>0) {
			return "session/loginForm.jsp";
		}else {
			return "session/joinForm.jsp";
		}
	}
}
