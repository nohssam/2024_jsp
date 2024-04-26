package com.ict.model.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.basic.Command;

public class SessionLogoutCommand implements Command	{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		 request.getSession().removeAttribute("svo");	
		 return "view/session/index.jsp";
	}
}
