<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
<body bgcolor="#E6E6FA">
	<center><h1>Login Page!</h1>

	

	<form action="user" method="post">
		Enter Username :<input type="text" name="userName"><br> 
		Enter Password :<input type="password" name="password"><br>
		<input	type="submit" value="Login"><br><br>
		<p>If Not Registered: <a href="signup.jsp">Click Here</a></p>
		
		</center>
		
	</form>
	
</body>
</html>