<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body background="D:\profilepics\bg.jpg">
<jsp:include page="banner.jsp"/>
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
				<td><input type="password" name="password" placeholder="password" required /></td>
			
			</tr>
			<tr>
				<td style="color: white">Age:</td>
				<td>
				<select name="age">
				<% for(int a=18;a<=60;a++){ %>
				<option value="<%= a %>"><%= a %></option>
				<% } %>
				</select>
				</td>
			</tr>
			<tr>
				<td style="color: white">Gender:</td>
				<td><select name="gender" placeholder="gender" required>
						<option checked>Male</option>
						<option>Female</option>
						<option>other</option>

				</select></td>
			</tr>
			<tr>
				<td style="color: white">City:</td>
				<td><input type="text" name="city" placeholder="city" required /></td>
			</tr>
			<tr>
				<td style="color: white">Movie:</td>
				<td><input type="password" name="movie" placeholder="movie" required /></td>
			</tr>
			<tr>
				<td style="color: white">Profile Photo:</td>
				<td><input type="file" name="photo" placeholder="file" size="25" required /></td>
			</tr>
		</table>
		<input type="submit" value="Submit" />
	</form>
	<%@ include file="footer.html"  %>
</body>
</html>