<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! String email, password, username; %>
<%
email = request.getParameter("email");
password = request.getParameter("password");
username = request.getParameter("username");
response.setContentType("text/html");

if(email.equals("admin@gmail.com") && password.equals("admin")){
	%>
	   <jsp:forward page="Home.jsp"></jsp:forward>
	<%
} else {
	out.println("Failure. Try once again <br/> NB: All admin users sign in with <b>email:admin@gmail.com</b> and <b>password:admin</b>");
	%>
	  <jsp:include page="login.jsp"></jsp:include>
	<%
}
%>
</body>
</html>