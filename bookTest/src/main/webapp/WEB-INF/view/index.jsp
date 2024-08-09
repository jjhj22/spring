<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서관리</title>
<link rel="stylesheet" href="/css/default.css">
</head>
<body>

<!-- 
	클래스명
	컨트롤 : CoffeCintrol
	서비스 : CoffeService
	DTO : CoffeDto
	DAO : CoffeDao
 -->
 

 
	<div id="wrap">
		<h2>도서관리</h2>
		<div id="mainTitle">
			<h3>등록 도서 목록</h3>
			<a href="/bookWrite" id="enroll">도서등록</a>
		</div>
		<div id="bookListWrap">
			<ul id="bookList">
			<c:forEach var="row" items="${list}">
			<li class="blist">
					<span class="title"><a href="/book/view?id=${row.bookId}">${row.bookTitle }</span>
					<span class="auth">${row.bookAuthor }</span>
					<span class="bookCode">${row.bookId }</span>
					<span class="category">${row.publisher }</span>
				</li>
			</c:forEach>
				
				<li class="blist">
					<span class="title">선녀와 나무꾼</span>
					<span class="auth">서정오</span>
					<span class="bookCode">ㅁㄴb01자23</span>
					<span class="category">전래동화</span>
				</li>
				<li class="blist">
					<span class="title">흥부와 놀부</span>
					<span class="auth">이창석</span>
					<span class="bookCode">ㅇㅌb12츄9901</span>
					<span class="category">전래동화</span>
				</li>
				<li class="blist">
					<span class="title">연애 너도 할 수 있다</span>
					<span class="auth">박호식</span>
					<span class="bookCode">ㅁㅅs2나142</span>
					<span class="category">판타지</span>
				</li>
				<li class="blist">
					<span class="title">내가 부자가 될 상인가</span>
					<span class="auth">팽춘오</span>
					<span class="bookCode">ㅁㅁb7도9999</span>
					<span class="category">경제학</span>
				</li>
				
			</ul>
		</div>
		
	</div>
</body>
</html>