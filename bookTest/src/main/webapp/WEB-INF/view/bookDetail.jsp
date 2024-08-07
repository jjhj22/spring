<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bookDetail.jsp</title>
</head>
<body>
	<h2>도서 정보</h2>
	책 제목 : ${bookDate.getTitle()}<br>
	저자 : ${bookDate.getName() }<br>
	출판사 : ${bookDate.getPublisher() }
</body>
</html>