<%@page import="com.bean.Class"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Classes</title>
</head>
<body>
<table>
<h2>All Classes</h2>
<button onclick="location.href='Home.jsp'">Back</button> <br/> <br/>
<table border="1">
<tr>
    <th>Class ID</th>
    <th>Class Name</th>
</tr>
<%
Object obj = request.getAttribute("obj");
if(obj != null){
	List<Class> listOfClasses = (List<Class>)obj;
	Iterator<Class> li = listOfClasses.iterator();
	while(li.hasNext()){
		Class c = li.next();
		
		%>
		   <tr>
		        <td><%=c.getClassid() %></td>
		        <td><%=c.getClassname() %></td>
		   </tr>
		<% 
	}
}
%>
</table>
</table>
</body>
</html>