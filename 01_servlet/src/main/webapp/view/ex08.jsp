<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function send_go(f) {
		/*
		let name = f.name.value ;
		if(name === ''){
			alert("이름을 입력하세요");
			f.name.focus();
			return;
		}
		*/
		// 
		// console.log(f.elements);
		for (let i = 0; i < f.elements.length; i++) {
			// 국어를 제외 시키자 
			// if(i==2) continue;
			if(f.elements[i].value === ''){
				alert(f.elements[i].name + "을 입력하세요");
				f.elements[i].focus();
				return;
			}
		}
		f.submit();
	}
</script>
</head>
<body>
	<form action="/01_servlet/Ex08" method="post">
		<fieldset>
			<legend>성적입력</legend>
			<p>이름 : <input type="text" name="name"></p>
			<p>국어 : <input type="number" name="kor"></p>
			<p>영어 : <input type="number" name="eng"></p>
			<p>수학 : <input type="number" name="math"></p>
			<input type="button" value="결과보기" onclick="send_go(this.form)">
			<input type="reset" value="취소">
		</fieldset>
	</form>
</body>
</html>