<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookWrite.jsp</title>
</head>
<body>
		<h2>도서 정보 입력페이지</h2>
	<form method="get" action="/detail">
		책 제목 : <input type="text" name="title"><br>
		저자 : <input type="text" name="name"><br>
		출판사 : <input type="text" name="publisher">
		<button>입력</button>
	</form>
</body>
</html>