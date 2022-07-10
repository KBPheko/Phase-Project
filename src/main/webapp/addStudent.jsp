<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add New Student</h2>
<button onclick="location.href='Home.jsp'">Back</button> <br/> <br/>

<form action="StudentController" method="post">
<label>Student Name</label>
	<input type="text" name="studentname"><br/> <br/>
	<label>Age</label>
	<input type="text" name="age"><br/> <br/>
	<label>Class ID</label>
	<input type="text" name="classid"><br/> <br/>
	<input type="submit" value="add student">
	<input type="reset" value="reset">
</form>
</body>
</html>