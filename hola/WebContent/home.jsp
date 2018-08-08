<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body background="D:\profilepics\bg.jpg">
<jsp:include page="banner.jsp"/>
<% if(request.getParameter("invalid") != null){ %>
<font size="3" color="Red" > Invalid Email id/ Password</font>
<% } %>


	<h1 style="color: red">Login</h1>
	<form action="UserController.hola" style="color: white">

		Email Id: &nbsp;&nbsp;<input type="text" name="emailId" placeholder="emailId" required /><br>

		Password: <input type="password" name="password" placeholder="password" required /> <br>
		<input type="submit" value="Submit"> <br> <br><a
			href="forget.jsp" style="color: #5DADE2">Forget Password?</a> <br>
		<a href="register.jsp" style="color: #5DADE2">New User? Register</a>
	</form>
<%@ include file="footer.html"  %>
</body>
</html>