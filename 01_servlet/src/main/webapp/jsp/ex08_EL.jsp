<%@page import="com.ict.db.VO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    // 모델에서 했다고 가정
	VO vo = new VO("1", "둘리","24", "서울");
    request.setAttribute("vo", vo);
%>
<h2>
	<ul>
		<li>${vo}</li>
		<li>${vo.idx}</li>
		<li>${vo.name}</li>
		<li>${vo.age}</li>
		<li>${vo.addr}</li>
	</ul>
</h2>
</body>
</html>