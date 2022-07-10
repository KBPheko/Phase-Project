<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Teacher"%>
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
<h2>All Teachers</h2>
<button onclick="location.href='Home.jsp'">Back</button> <br/> <br/>
<table border="1">
<tr>
    <th>Teacher ID</th>
    <th>Teacher Name</th>
</tr>
<%
Object obj1 = request.getAttribute("obj");
if(obj1 != null){
	List<Teacher> teachList = (List<Teacher>)obj1;
	Iterator<Teacher> li = teachList.iterator();
	while(li.hasNext()){
		Teacher t = li.next();
		
		%>
		   <tr>
		        <td><%=t.getTeacherid() %></td>
		        <td><%=t.getTeachername() %></td>
		   </tr>
		<% 
	}
}
%>
</table>
</body>
</html>