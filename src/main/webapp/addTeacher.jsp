<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Add New Teacher</h2>
<button onclick="location.href='Home.jsp'">Back</button> <br/> <br/>
<form action="TeacherController" method="post">
<label>Teacher Name</label>
<input type="text" name="teachername"/>
<label>Class ID:</label>
<input type="text" name="classid"/> <br/> <br>
<input type="submit" value="Add Teacher"> |
<input type="reset" value="Reset">
</form>
</body>
</html>