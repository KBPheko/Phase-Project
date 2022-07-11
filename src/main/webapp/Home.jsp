<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learners Academy Admin Portal</title>
</head>
<body>
<%! String username; %>
<%
username = request.getParameter("username");

out.println("Hello <b>" + username+"</b>.<br/> You are now Admin");
out.println("Choose an Action <hr/><br/>");
%>

<button onclick="location.href='ReportController'">View Class Report</button> <br> <br>

<button onclick="location.href='addNewClass.jsp'">Add a class</button> | <button onclick="location.href='ClassController'">Display All Classes</button> <br> <br>
<button onclick="location.href='addSubject.jsp'">Add a subject</button> | <button onclick="location.href='SubjectController'">Display all Subject Records</button> <br> <br>
<button onclick="location.href='addTeacher.jsp'">Add a teacher</button> | <button onclick="location.href='TeacherController'">View all teacher records</button> <br> <br>
<button onclick="location.href='addStudent.jsp'">Add a student</button> | <button onclick="location.href='StudentController'">View all student records</button> <br> <br>


</body>
</html>