<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body background="D:\profilepics\bg.jpg">
	<jsp:include page="banner.jsp" />
	<h1 style="color: red">Register Form</h1>
	<form action="UserController.hola" method="get">
		<table style="with: 50%">
			<tr>
				<td style="color: white">Name:</td>
				<td><input type="text" name="name" placeholder="name" required /></td>
			</tr>

			<tr>
				<td style="color: white">Email Id:</td>
				<td><input type="email" name="emailId" placeholder="emailId"
					required /></td>
			</tr>
			<tr>
				<td style="color: white">Password:</td>
				<td><input type="password" name="password"
					placeholder="password" required /></td>

			</tr>

		</table>
		<input type="submit" value="Submit" />
	</form>
	<%@ include file="footer.html"%>
</body>
</html>