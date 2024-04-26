package com.session.model;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionProfileCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
	   // session에 저장된 된 svo를 꺼내자 
	   // HttpSession session = request.getSession();
	   // SessionVO svo  =  (SessionVO) session.getAttribute("svo");
		
		// request.setAttribute("pwd", svo.getPwd());
		return "session/profile.jsp";
	}
	
}
