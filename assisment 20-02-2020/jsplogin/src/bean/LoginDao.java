package bean;  
import java.sql.*;  
public class LoginDao {  
  
public static boolean validate(LoginBean bean){  
boolean status=false;
String password1="";
try{  
Connection con = null; 

	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsplogin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");  
		//System.out.println("Success");
	}catch(Exception e){}  
		
              
PreparedStatement ps=con.prepareStatement(  
    "select * from user432 where email=?");  
  

ps.setString(1,bean.getEmail());  
//ps.setString(2, bean.getPass());  
ResultSet rs=ps.executeQuery();

//if(rs.next()) {
//	 password1=rs.getString("pass");
//}
//else {
//	System.out.println("Account does not exist!!!");
//}
//System.out.println(password1);
//System.out.println(bean.getPass());

//if(bean.getPass().equals(password1));
//{
	//status = true;
//}
  status=rs.next(); 
//while(rs.next()) {
//System.out.println(rs.getString("email"));
//}
}catch(Exception e){
	
}  
System.out.println(status);
return status;  
  
}  
}  