package com.cookie.model;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CookieLogoutCommand implements Command	{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 로그아웃
		Cookie[] cookies = request.getCookies();
		if(cookies != null && cookies.length >0) {
			for (int i = 0; i < cookies.length; i++) {
				if(cookies[i].getName().equals("id")) {
					Cookie cookie1 = new Cookie("id", "");
					cookie1.setMaxAge(0);
					response.addCookie(cookie1);
				}
				if(cookies[i].getName().equals("pwd")) {
					Cookie cookie1 = new Cookie("pwd", "");
					cookie1.setMaxAge(0);
					response.addCookie(cookie1);
				}
			}
		}
		return "cookie/index.jsp";
	}
}
