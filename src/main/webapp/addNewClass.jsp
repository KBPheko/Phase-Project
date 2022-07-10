<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Class</title>
</head>
<body>
<h2>Add New Class Program</h2>
<button onclick="location.href='Home.jsp'">Back</button> <br/> <br/>
<form action="ClassController" method="post">
<label>Class Name: </label>
<input type="text" name="classname" /> <br> <br>
<label>Subject ID: </label>
<input type="text" name="subjectid" /> <br> <br>
<input type="submit" value="Add Class"> |
<input type="reset" value="reset">
</form>
</body>
</html>