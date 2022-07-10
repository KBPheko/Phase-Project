<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assign Subject To Class</title>
</head>
<body>
<h2>Add Subjects</h2>
<button onclick="location.href='Home.jsp'">Back</button> <br/> <br/>
<form action="SubjectController" method="post">
<label>Subject Name : </label> |
<input type="text" name="subjectname"/> <br> <br>
<input type="submit"  value="Add New Subject"> |
<input type="reset" value="Reset">
</form>
</body>
</html>