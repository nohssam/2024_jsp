package com.basic.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		return "basic/index.jsp";
	}
}
