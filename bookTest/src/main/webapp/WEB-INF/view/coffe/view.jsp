<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="wrap">
		<a href="/coffe">HOME</a>
		<table id="viewBox">
			<tr>
				<td class="fieldName">메뉴</td>
				<td class="value">${coffe.itemName }</td>
			</tr>
			<tr>
				<td class="fieldName">가격</td>
				<td class="value">
				<fmt:formatNumber value="${coffe.price }" type="currency"/>
				</td>
			</tr>
			<tr>
				<td class="fieldName">디카페인</td>
				<td class="value">
				<fmt:formatNumber value="${coffe.decaffein }" pattern="#,###"/>
				</td>
			</tr>			
			<tr>
				<td colspan="2">
					<button type="button" id="modify">수정</button>
					<button type="button" id="del">삭제</button>
				</td>
			</tr>
		</table>
	</div>

</body>
</html>