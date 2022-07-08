<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h2>Login In with Administrator Details</h2>
<form action="checkadmincredentials.jsp" get="">
<label>Username</label> <br>
<input type="text" name="username"/><br>
<label>Email</label> <br>
<input type="email" name="email"/><br>
<label>Password</label> <br>
<input type="password" name="password"/> <br> <br>
<input type="submit" value="Login"/>  |
<input type="reset" value="reset"/>
</form>
</body>
</html>