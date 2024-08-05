<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/signUp">
	<input type="text" name="id" placeholder="아이디">
	<br>
	<input type="password" name="password" placeholder="비밀번호">
	<br>
	<input type="tel" name="tel" placeholder="연락처">
	<br>
	<input type="date" name="birth" placeholder="생년월일">
	<br>
	<button>가입</button>
	</form>
	
</body>
</html>