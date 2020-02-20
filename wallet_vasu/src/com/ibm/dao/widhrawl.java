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


@WebServlet("/widhrawl")
public class widhrawl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int balance1=0;
		java.sql.Connection  dbCon=null;
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
		String query ="SELECT balance from userdetails where userID=?";
		PreparedStatement stmt;
		try {
			stmt = dbCon.prepareStatement(query);
			stmt.setString(1, request.getParameter("userid"));
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				balance1=rs.getInt("balance");
			}
			
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		String updateQry = "UPDATE userdetails SET balance=? WHERE userID=?";

		try {
			PreparedStatement stmt1 = dbCon.prepareStatement(updateQry);
			
			
			if(balance1>Integer.parseInt(request.getParameter("widhrawl")))
			{
			stmt1.setInt(1,  balance1- Integer.parseInt(request.getParameter("widhrawl")));
			stmt1.setString(2, request.getParameter("userid"));
			System.out.println(Integer.parseInt(request.getParameter("widhrawl")));

			int a = stmt1.executeUpdate();
			request.getRequestDispatcher("dashboard.jsp").include(request, response);
			
			if(a == 0) {
				System.out.println("Account does not exist!!!");
			}
			}
			else
			{
				System.out.println("insufficient balance");
			}
		} catch (SQLException e) {
			System.out.println("Issues creating the statement :" + e.getMessage());
		}
	}

}
