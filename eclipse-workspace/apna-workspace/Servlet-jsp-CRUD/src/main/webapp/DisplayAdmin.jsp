<%@page import="com.jsp.dto.Admin"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Admins</title>
<style type="text/css">
table {
	border: 2px solid;
	border-collapse: collapse;
}

td {
	border: 1px solid;
}

th {
	background-color: lime;
}
</style>

</head>
<body>
	<%
	List<Admin> list = (List<Admin>) request.getAttribute("list");
	%>
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>PHONE</th>
			<th>EMAIL</th>
			<th>PASSWORD</th>
		</tr>
		<%
		for (Admin admin : list) {
		%>
		<tr>
			<td><%=admin.getId()%></td>
			<td><%=admin.getName()%></td>
			<td><%=admin.getPhone()%></td>
			<td><%=admin.getEmail()%></td>
			<td><%=admin.getPassword()%></td>

		</tr>
		<%
		}
		%>


	</table>
	<a href="AdminHome.jsp">back<<--</a>
</body>
</html>