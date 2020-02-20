 
<%@page import="bean.LoginDao"%>  
<jsp:useBean id="obj" class="bean.LoginBean"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  <a href="logout.jsp">logout</a>|  
<a href="profile.jsp">profile</a><br>
<%  
boolean status=LoginDao.validate(obj);
//System.out.println(status);
if(status){  
out.println("You r successfully logged in");  
session.setAttribute("session","TRUE");  
}  

else  
{  
out.print("Sorry, email or password error");  
%>  
<jsp:include page="index.jsp"></jsp:include>  
<%  
}  
%>  