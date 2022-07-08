<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Assign Subject To Class</title>
</head>
<body>
<h2>Add Subject into a class</h2>
<form action="SubjectController" method="post">
<label>Indicate class ID the subject belongs to : </label> |
<input type="text" name="subclassid"/> <br> <br>
<label>Subject ID : </label> |
<input type="text" name="subjectid"/> <br> <br>
<label>Subject Name : </label> |
<input type="text" name="subjectname"/> <br> <br>
<input type="submit"  value="Add New Subject"> |
<input type="reset" value="Reset">
</form>
</body>
</html>