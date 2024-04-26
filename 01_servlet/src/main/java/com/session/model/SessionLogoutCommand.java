package com.session.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionLogoutCommand implements Command	{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		 request.getSession().removeAttribute("svo");	
		 return "session/index.jsp";
	}
}
