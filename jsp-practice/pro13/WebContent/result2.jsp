<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	request.setCharacterEncoding("utf-8"); %>
<%	
	String msg = "아이디를 입력하지 않았습니다. 아이디를 입력해 주세요";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String userid = request.getParameter("userid");
	if(userid.length()==0) {
%>
	<jsp:forward page="/login2.jsp">
		<jsp:param value="<%= msg %>" name="msg"/>
	</jsp:forward>
<%
	}
%>
	<h1>환영합니다. <%=userid %>님!!!</h1>
</body>
</html>