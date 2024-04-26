package com.guestbook.model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guestbook.db.GuestDAO;
import com.guestbook.db.GuestVO;

public class ListCommand implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// guest book 테이블의 모든 정보 다 가져와야 한다.
		// DB 처리는 MyBatis 이다.
		// 오라클라이브러리와 MyBatis 라이브러리를 WEB-INF 안 lib 에 넣자.
		
		List<GuestVO>  list = GuestDAO.getList();
		request.setAttribute("list", list);
		
		return "guestbook/list.jsp";
	}
	
}









