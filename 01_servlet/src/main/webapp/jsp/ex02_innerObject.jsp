<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 내장객체 : out</title>
</head>
<body>
<%--
    JSP 내장 객체 : JSP 페이지에서 사용할 수 있도록 지원하는 객체를 말한다.
      request, response, out, page, pageContext, session, 
      appliction, config, exception; 
	
	  out은 화면에 출력할 때 사용하는 객체
	  
	  <%  자바코드 ; %>
	  <%! 변수선언 이나 메서드 선언할때 사용 ; %>
	  <%= 변수결과값 이나 메서드 결과값을 출력 %>  => EL(표현언어) ${} 
 --%>
   <%  out.println("<h2>Hello JSP </h2> ");   %>
   <%! String str = "Hello jsp" ;  %>
   <h2><%= str %> </h2>
   <h2> 결과 : ${str} </h2>
</body>
</html>









