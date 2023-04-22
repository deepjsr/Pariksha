<%@page import="com.jsp.dto.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="update">
		<%
		Admin admin = (Admin) request.getAttribute("updateadmin");
		%>
		Id: <input type="text" name="id" value=<%= admin.getId()%> readonly="readonly"> <br> <br>
			Name: <input type="text" name="name1" value=<%= admin.getName()%>><br><br> 
			Phone: <input type="tel" name="phone1" value=<%= admin.getPhone()%>><br> <br> 
			Email: <input type="email" name="email1" value=<%= admin.getEmail()%>><br>
		<br> Password: <input type="password" name="password1" value=<%= admin.getPassword()%>> <br> <br> 
		<input type="submit" value="Update">
	</form>
</body>
</html>