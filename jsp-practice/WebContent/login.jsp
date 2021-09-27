<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>아이디를 입력하지 않았습니다. 아이디를 입력해 주세요</h1>
	<hr>
	<form action="result.jsp" method="post">
		아이디: <input type="text" name="userid"><br>
		비밀번호: <input type="password" name="userpw"><br>
		<input type="submit" value="로그인">
		<input type="reset" value="다시입력">
	</form>
</body>
</html>