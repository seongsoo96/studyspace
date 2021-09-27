<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%	request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String userid = request.getParameter("userid");
		if(userid.length() == 0){
			//RequestDispatcher를 사용해 포워딩을 하지 않아도 됨.
// 			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
// 			rd.forward(request, response);
	%>
			<jsp:forward page="login.jsp" />
	<%
		}
	%>
	<h1>환영합니다 <%=userid %>님!!!</h1>
</body>
</html>