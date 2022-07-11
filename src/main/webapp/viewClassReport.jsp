<%@page import="antlr.StringUtils"%>
<%@page import="com.bean.Student"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Class"%>
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
<h2>Class Report</h2>
<h4>The information below display information about class, no. students in class and subjects allocated in that class</h4>
<button onclick="location.href='Home.jsp'">Back</button> <br/> <br/>
<table border="1">
	<tr>
		<th>Classes</th>
		<th>Subjects</th>
		<th>Teachers</th>
		<th>Students</th>
	</tr>

<%
//obj1 - classes
Object obj1 = request.getAttribute("obj1");
if(obj1 != null){
	List<Class> allClasses = (List<Class>)obj1;
	//List<Class> = allClass
	Iterator<Class> li  = allClasses.iterator();
	while(li.hasNext()){
		Class cl = li.next();
		%>
			<tr>
				<td>Name: <b> <%=cl.getClassname() %> </b> <br/> Class ID:  <%=cl.getClassid() %></td>
			    <td>Subject Name: <%=cl.getSubject().getSubjectname() %></td>
			    <td>No. of Teachers:<b> <%=cl.getListOfTeachers().size() %></b>  <br/> <br>
			    Teacher Names: 
			         
			    </td>
			    
			    <td>No. of Students: <b><%=cl.getListOfStudents().size() %></b> <br/><br/>
			    Student Names: <br>
			    <ul>
			      <li><%=cl.getListOfStudents().toString() %></li>
			    </ul>
			         
			    </td>
			</tr>
		<% 
	}
}
%>
</table>
</body>
</html>