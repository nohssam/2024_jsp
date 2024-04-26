package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.UserMemberDAO;
import com.ict.db.UserMemberVO;

public class LogInOKCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		UserMemberVO mvo = new UserMemberVO();
		mvo.setId(id);
		mvo.setPwd(pwd);
		try {
			UserMemberVO mvo2 = UserMemberDAO.getLogIn(mvo);
			if(mvo2 == null) {
				return "guestbook/loginForm.jsp";
			}else {
				request.setAttribute("res",1);
				request.setAttribute("mvo", mvo2);
				return "guestbook/index.jsp";
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null; 
	}
}
