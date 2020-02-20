
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
		if(session.getAttribute("name")==null)
		{
			
			request.getRequestDispatcher("dashboard.jsp").include(request, response); 
			
		}

%>
Deposite amount:<a href="deposite.jsp">Deposite</a><br>
Widhrawl amount:<a href="widhrawl.jsp">Widhrawl</a><br>
Logout:<a href="logout.jsp">Logout</a><br>
</body>
</html>