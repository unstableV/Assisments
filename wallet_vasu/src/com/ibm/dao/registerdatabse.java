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
@WebServlet("/register")
public class registerdatabse extends HttpServlet {  
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
        String phone=request.getParameter("phone");
        String userid=request.getParameter("userid");  
        try {
			String insertQry = "INSERT INTO userdetails values (?, ?, ?, ?,?)";
			PreparedStatement stmt = dbCon.prepareStatement(insertQry);
			
			stmt.setString(2, name);
			stmt.setString(3, password);
			stmt.setInt(4,110);
			stmt.setString(5,phone );
			stmt.setString(1, userid);
			stmt.executeUpdate();
			request.getRequestDispatcher("login.jsp").include(request, response); 
		} catch (SQLException e) {
			System.out.println("Issues creating the statement :" + e.getMessage());
		}
	}
           }
