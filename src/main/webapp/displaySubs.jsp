<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Subject"%>
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
<h2>All Subjects</h2>
<button onclick="location.href='Home.jsp'">Back</button> <br/> <br/>
<table border="1">
<tr>
    <th>Subject ID</th>
    <th>Subject Name</th>
    <th>Subject Class ID</th>
</tr>
<%
Object obj1 = request.getAttribute("obj");
if(obj1 != null){
	List<Subject> listOfSubs = (List<Subject>)obj1;
	Iterator<Subject> li = listOfSubs.iterator();
	while(li.hasNext()){
		Subject s = li.next();
		
		%>
		   <tr>
		        <td><%=s.getSubjectid() %></td>
		        <td><%=s.getSubjectname() %></td>
		        <td><%=s.getCl() %></td>
		   </tr>
		<% 
	}
}
%>
</table>
</body>
</html>