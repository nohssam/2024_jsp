package com.ict.model;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command01 implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 실제 일처리 
		// 오늘 날짜 구하기
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DATE);
		String result = year+"년 " + month + "월 " + day + "일" ;
		
		// 결과를 저장하자.(request에 저장) => 그래서 controller에서 패이지 이동을 forward 로 함
		request.setAttribute("res", result);
		
		// return "결과를 보여줄 jsp 파일 위치" 
		return "view/ex13_res01.jsp";
	}

}
