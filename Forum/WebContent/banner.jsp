<%@page import="entity.bean.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center" style="color: red">Forum</h1>
	<%
		LoginBean user = (LoginBean) session.getAttribute("User");
		if (user != null) {
	%>
	<h4>
		Hello
		<%=user.getUserId()%>
		| <a href="UserController.hola?logout=yes">Logout</a>
	</h4>

	<%
		} else {
	%>
	<h4>Hello Visitor</h4>
	<%
		}
	%>


	<hr size="3" color="midnightblue">
</body>
</html>