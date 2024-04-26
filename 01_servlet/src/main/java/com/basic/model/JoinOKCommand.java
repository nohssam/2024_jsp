package com.basic.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.basic.db.BasicDAO;
import com.basic.db.BasicVO;


public class JoinOKCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 회원가입
		BasicVO bvo = new BasicVO();
		bvo.setId(request.getParameter("id"));
		bvo.setPwd(request.getParameter("pwd"));
		bvo.setName(request.getParameter("name"));
		bvo.setEmail(request.getParameter("email"));
		bvo.setAddr(request.getParameter("addr"));
		bvo.setPhone(request.getParameter("phone"));
		
		int result = BasicDAO.getJoin(bvo);
		
		if(result == 1 ) {
			return "basic/loginForm.jsp";
		}else {
			return "basic/joinForm.jsp";
		}
		
	}
}
