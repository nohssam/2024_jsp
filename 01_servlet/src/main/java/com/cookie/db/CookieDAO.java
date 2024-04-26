package com.cookie.db;

import org.apache.ibatis.session.SqlSession;

public class CookieDAO {
	// 살제 사용하는 클래스 : SqlSession
	private static SqlSession ss;
	
	private synchronized static SqlSession getSession() {
		if(ss == null) {
			ss = CookieDBService.getFactory().openSession();
		}
		return ss;
	}
	
	// DB처리하는 메서드들
	// 회원가입
	public static int getJoin(CookieVO cvo) {
		int result = 0 ;
		result = getSession().insert("cookieUser.c_join", cvo);
		ss.commit();
		return result;
	}
	
	public static CookieVO getLogIn(CookieVO cvo) {
		CookieVO bvo2 = null;
		bvo2 = getSession().selectOne("cookieUser.c_login", cvo);
		return bvo2;
	}
	
	public static CookieVO getDetail(String id){
		CookieVO bvo2 = null;
		bvo2 = getSession().selectOne("cookieUser.c_detail", id);
		return bvo2;
	}
}











