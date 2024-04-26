package com.guestbook2.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.guestbook2.db.GuestBook2DAO;
import com.guestbook2.db.GuestBook2VO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class WriteOKCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		try {
			// 실제 저장 위치
			String path = request.getServletContext().getRealPath("upload");
			
			MultipartRequest mr =
					new MultipartRequest(request, path, 
							500*1024*1024,"utf-8", new DefaultFileRenamePolicy());
			GuestBook2VO g2vo = new GuestBook2VO();
			g2vo.setName(mr.getParameter("name"));
			g2vo.setSubject(mr.getParameter("subject"));
			g2vo.setContent(mr.getParameter("content"));
			g2vo.setEmail(mr.getParameter("email"));
			g2vo.setPwd(mr.getParameter("pwd"));
			
			// 첨부파일이 있을 때와 없을 때를 구분하자.
			if(mr.getFile("f_name") != null) {
				g2vo.setF_name(mr.getFilesystemName("f_name"));
			}else {
				g2vo.setF_name("");
			}
			int result = GuestBook2DAO.getInsert(g2vo);
			if(result > 0) {
				return "GuestBook2Controller?cmd=list";
			}
			return "guestbook2/error.jsp";
		} catch (Exception e) {
			System.out.println(e);
			return "guestbook2/error.jsp";
		}
	}
}
