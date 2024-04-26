package com.ict.db;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class UserMemberDAO {
	// 살제 사용하는 클래스 : SqlSession
	private static SqlSession ss;
	
	private synchronized static SqlSession getSession() {
		if(ss == null) {
			ss = UserMemberDBService.getFactory().openSession();
		}
		return ss;
	}
	
	// DB처리하는 메서드들
	// 로그인 처리
	public static UserMemberVO getLogIn(UserMemberVO mvo) {
		UserMemberVO mvo2 = null;
		mvo2 = getSession().selectOne("userMember.login", mvo);
		return mvo2;
	}
}











