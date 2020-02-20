package com.ibm.dao;

import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;

import com.sun.jdi.connect.spi.Connection;  
@WebServlet("/first")
public class dao extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
    	java.sql.Connection  dbCon=null;
    	String password1="";
    	try {
    		//System.out.println("Can't connect");
    		Class.forName("com.mysql.cj.jdbc.Driver");
			 
    		dbCon = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/wallet?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
    		System.out.println("connect.....");
    	} catch (SQLException e) {
			System.out.println("Can't connect");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("hello");
			System.out.println("Can't connect");
		}
    	
		//stmt.setString(2, cust.getUserName());

        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
      // request.getRequestDispatcher("index.jsp").include(request, response);  
          
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
       
        try {
        	System.out.println("Account does  exist!!!");
        	String selectQry = "SELECT password from userdetails where userName=?";
			PreparedStatement stmt = ((java.sql.Connection) dbCon).prepareStatement(selectQry);
			 System.out.println(name); 
			stmt.setString(1, name);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				password1=rs.getString("password");
			}
			else {
				System.out.println(rs.getString("password"));
				System.out.println("Account does not exist!!!");
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Account does not exist!!!");
			//e.printStackTrace();
			
		}
        if(password.equals(password1)){  
        out.print("Welcome, "+name);  
        HttpSession session=request.getSession();  
        session.setAttribute("name",name);  
        request.getRequestDispatcher("dashboard.jsp").include(request, response); 
        }  
        else{  
            out.print("Sorry, username or password error!");  
            request.getRequestDispatcher("login.jsp").include(request, response);  
        }  
        out.close();  
    }
}