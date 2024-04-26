<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL : 포맷팅 (fmt) : 숫자와 날짜 포매팅</title>
</head>
<body>
	<h2> 세자리마다 콤마 표시, 숫자만 받기</h2>
	<h3>
		<li><fmt:formatNumber value="123456.5749" /> </li>
		<%-- <li><fmt:formatNumber value="aaa123456.5749" /> </li> --%>
		<%-- <li><fmt:formatNumber value="123456.a5749" /> </li> --%>
	</h3>
	<hr>
	
	<h2>숫자 , 숫자 문자 일때는 처음부터 숫자까지만 인식</h2>
	<h3>
		<li><fmt:parseNumber value="123456.5749" /> </li>
		<li><fmt:parseNumber value="12312123c4b56a.a5749" /> </li>
		<%-- <li><fmt:parseNumber value="aaa123456.5749" /> </li> --%>
	</h3>
	<hr>
	
	<h2>정수만 구하기(반올림 처리)</h2>
	<h3>
		<li><fmt:formatNumber value="11123456.4749" pattern="#,###" /> </li>
		<li><fmt:formatNumber value="11123456.5749" pattern="#,###" /> </li>
	</h3>
	<hr>
	
	<h2>정수만 구하기(반올림 처리, 소숫점 첫째자리까지 구하기)</h2>
	<h3>
		<li><fmt:formatNumber value="11123456.4449" pattern="#,###.#" /> </li>
		<li><fmt:formatNumber value="11123456.5749" pattern="#,###.#" /> </li>
		<li><fmt:formatNumber value="11123456" pattern="#,###.#" /> </li>
		<li><fmt:formatNumber value="11123456" pattern="#,###.0" /> </li>
	</h3>
	<hr>
	
	<h2>pattern 에서 # 과 0 의 차이점</h2>
	<h3>
		<li><fmt:formatNumber value="127" pattern="#,###" /> </li>
		<li><fmt:formatNumber value="127" pattern="#,###.#" /> </li>
		<li><fmt:formatNumber value="127" pattern="0,000" /> </li>
		<li><fmt:formatNumber value="127" pattern="0,000.0" /> </li>
	</h3>
	<hr>
	
	<h2>현재 운영체제에 맞는 화페단위 표시 (반올림됨)</h2>
	<h3>
		<li><fmt:formatNumber value="11123456.4449" type="currency" /> </li>
		<li><fmt:formatNumber value="11123456.5749" type="currency" /> </li>
		<li><fmt:formatNumber value="11123456" type="currency" /> </li>
		<li><fmt:formatNumber value="11123456" type="currency" /> </li>
	</h3>
	<hr>
	
	<h2>퍼센트(value * 100 + "%")</h2>
	<h3>
		<li><fmt:formatNumber value="12" type="percent" /> </li>
		<li><fmt:formatNumber value="0.12" type="percent" /> </li>
		
	</h3>
	<hr>
	
	<h2> 오늘날짜 구하기</h2>
	<!-- 자바의객체 생성과 같음 -->
	<jsp:useBean id="now" class="java.util.Date" />
	<h3>
		<li> 오늘 날짜 : ${now}</li> 	
		<li><fmt:formatDate value="${now}" dateStyle="short"/></li> 	
		<li><fmt:formatDate value="${now}" dateStyle="medium"/></li> 	
		<li><fmt:formatDate value="${now}" dateStyle="long"/></li> 	
		<li><fmt:formatDate value="${now}" dateStyle="full"/></li>
		<hr>
		
		<li><fmt:formatDate value="${now}"  type="time"   timeStyle="short"/></li> 	
		<li><fmt:formatDate value="${now}"  type="time"   timeStyle="medium"/></li> 	
		<li><fmt:formatDate value="${now}"  type="time"   timeStyle="long"/></li> 	
		<li><fmt:formatDate value="${now}"  type="time"   timeStyle="full"/></li>
		<hr>
		
		<li><fmt:formatDate value="${now}" type="both" dateStyle="short"  timeStyle="short" /></li> 	
		<li><fmt:formatDate value="${now}" type="both" dateStyle="medium" timeStyle="medium"/></li> 	
		<li><fmt:formatDate value="${now}" type="both" dateStyle="long"  timeStyle="long"/></li> 	
		<li><fmt:formatDate value="${now}" type="both" dateStyle="full"  timeStyle="full"/></li>
		 	
	</h3>
</body>
</html>













