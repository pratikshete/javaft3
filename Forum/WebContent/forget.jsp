<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forget Password</title>
</head>
<body background="D:\profilepics\bg.jpg">
	<jsp:include page="banner.jsp" />
	<%
		if (request.getParameter("invalid") != null) {
	%>
	<font size="3" color="Red"> Invalid Email id/ Movie</font>
	<%
		}
	%>

	<h1 style="color: red">Forget Password</h1>
	<form action="UserController.hola" method="post">
		<table style="with: 50%">

			<tr>
				<td style="color: white">Email Id:</td>
				<td><input type="email" name="emailId" placeholder="emailId"
					required /></td>
			</tr>



			<tr>
				<td style="color: white">Movie:</td>
				<td><input type="password" name="movie" placeholder="movie"
					required /></td>
			</tr>

		</table>
		<input type="submit" value="submit" />
	</form>
	<%@ include file="footer.html"%>
</body>
</html>