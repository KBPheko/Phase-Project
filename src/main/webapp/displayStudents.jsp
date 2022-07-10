<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Students</h2>
<button onclick="location.href='Home.jsp'">Back</button> <br/> <br/>

<table border="1 solid">
<tr>
    <th>Student Name</th>
    <th>Student Age</th>
    <th>Class Id</th>
    <th></th>
</tr>
<%
Object obj = request.getAttribute("obj");
if(obj != null){
	List<Student> listStudets = (List<Student>)obj;
	Iterator<Student> ii = listStudets.iterator();
	
	while(ii.hasNext()){
		Student s = ii.next();
		%>
		    <tr>
		           <td><%=s.getStudentname() %></td>
		           <td><%=s.getAge() %></td>
		           <td><%=s.getStdclassid() %></td>
		    </tr>
		<% 
	}
}
%>
</table>
</body>
</html>