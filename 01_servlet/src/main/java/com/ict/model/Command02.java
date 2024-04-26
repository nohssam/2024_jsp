package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command02 implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 일처리 (운세 구하기) 
		int lucky = (int)(Math.random()*101);
		request.setAttribute("lucky", lucky);
		
		// return "결과를 보여줄 jsp 파일 위치" 
		return "view/ex13_res02.jsp";
	}
}
