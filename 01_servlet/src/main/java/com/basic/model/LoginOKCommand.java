package com.basic.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.basic.db.BasicDAO;
import com.basic.db.BasicVO;


public class LoginOKCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
	    BasicVO bvo = new BasicVO();
	    bvo.setId(request.getParameter("id"));
	    bvo.setPwd(request.getParameter("pwd"));
	    
	    BasicVO bvo2 = BasicDAO.getLogIn(bvo);
	    
	    if(bvo2 == null) {
	    	return "basic/loginForm.jsp";
	    }else {
	    	request.setAttribute("bvo", bvo2);
	    	// index에 display를 위해서 
	    	request.setAttribute("res", 1);
	    	return "basic/index.jsp";
	    }
	}
}
