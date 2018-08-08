<%@page import="lti.hola.bean.RegisterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Here</title>
</head>
<body>
<jsp:include page="banner.jsp"/>
<% RegisterBean user =(RegisterBean) session.getAttribute("User"); %>
<table align="center">
	<tr><th colsapn="2">Your profile is this</th></tr>
	<tr><td>Name</td><td><%= user.getName() %></td></tr>
	<tr><td>Email</td><td><%= user.getEmailId() %></td></tr>
	<tr><td>Age</td><td><%= user.getAge() %></td></tr>
	<tr><td>Gender</td><td><%= user.getGender() %></td></tr>
	<tr><td>City</td><td><%= user.getCity() %></td></tr>
	<tr><td colspan="2"><img src="<%= user.getPhoto() %>" height="200" width="200"> </td></tr>
	
</table>





</body>
</html>