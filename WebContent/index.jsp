<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Login</h2>

	<form action="login" method="post">
	User Name:<input type="text" name="name" required minlength="3"></br>
	Password:<input type="password" name="password" required minlength="6"></br>

	<button>Submit</button>
	</form>
	<a href="register.jsp">Click here to register</a>
</body>
</html>