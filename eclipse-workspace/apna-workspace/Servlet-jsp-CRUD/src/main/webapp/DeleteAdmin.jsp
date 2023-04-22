<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete record JSP</title>
</head>
<body>
	<form action="delteservlet" method="post">

		<input type="text" placeholder="type id here..." name="id"/ >
		<input type="submit" value="delete">

	</form>
	<iframe src="displayadmin" height="200" width="390"
		title="Iframe Example"></iframe>

</body>
</html>