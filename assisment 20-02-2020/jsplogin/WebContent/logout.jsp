<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="login.jsp">login</a>|  <br>
<%
//HttpSession session=request.getSession();  
session.invalidate();  
out.print("You are successfully logged out!");  
  
out.close();  


%>
</body>
</html>