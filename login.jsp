<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login page</title>
</head>
<body bgcolor="blue">
<h1><center>Login Page</center></h1>
<form action="/spring-mvc/login" method="post">
<center>
<h1>Name: <input type="name" name="name"/></h1><br>
<h1>Password: <input type="password" name="password"/></h1><br>
<input type="submit" value="login"/>
</center>
</form>
</body>
</html> 