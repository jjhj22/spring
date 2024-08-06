<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 보기</title>
</head>
<body>

	<a href="/board">목록으로</a>
	<h2>게시글 보기</h2>
	
	  <h3>제목 : ${Btitle}</h3>
	  <h4>글쓴이 : ${Bwriter}</h4>
	  <h5>내용 : ${Bcontent}</h5>
	  <h6>비밀번호 : ${BboardPw}</h6>
	
	
	
	<!-- 
	동작 내용
	- 글쓰기를 클릭하여 게시글 작성 페이지로 이동하고, 작성버튼을 클릭하면
	  게시글보기 페이지로 이동하여 작성한 내용을 출력한다
	  
	각 페이지 이동하기 위한 Mapping과
	뷰페이지 데이터 출력 방법들을 작성하여
	정상적으로 동작할 수 있게하세요  
	  	
	 -->

</body>
</html>