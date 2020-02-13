package com.wallet.test.dao;
import com.wallet.test.bean.customer;

import java.util.*;



//import com.mysql.cj.xdevapi.PreparableStatement;



import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    


public class Daoclass {

		public void  storeIntoMap(customer customer)
		{
          try {

				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection dbCon;
				try {
					dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mywallet?useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
					new Daoclass().insertData(dbCon,customer.getName(),customer.getAmount(),customer.getDeposite(),customer.getPhone(),customer.getWidhrawl(),customer.getAccount());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			catch (ClassNotFoundException e) {
				System.out.println("Exception while loading driver" + e.getMessage());
			} 
			
		}
		public void update(customer customer) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection dbCon;
				try {
					dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mywallet?useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
					System.out.println("Ente the accountNo");
					Scanner s = new Scanner(System.in);
					int account1 = s.nextInt();
					new Daoclass().updateData(dbCon,customer.getWidhrawl(),account1);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			catch (ClassNotFoundException e) {
				System.out.println("Exception while loading driver" + e.getMessage());
			} 
		}
		public void update1(customer customer) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection dbCon;
				try {
					dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mywallet?useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
					System.out.println("Ente the accountNo");
					Scanner s = new Scanner(System.in);
					int account1 = s.nextInt();
					new Daoclass().updateData1(dbCon,customer.getDeposite(),account1);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			catch (ClassNotFoundException e) {
				System.out.println("Exception while loading driver" + e.getMessage());
			} 
		}
		public void display(customer customer) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Connection dbCon;
			try {
				dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/mywallet?useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
				new Daoclass().display(dbCon);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
			   
	void insertData(Connection dbCon,String name,int amount,int deposite ,int phone, int widh,int account) {

		try {

			String SQL_INSERT = "INSERT INTO wallet_details (wallet_name, wallet_amount, wallet_phoneNo,widh_details,deposite_details,wallet_accountNo,wallet_time) VALUES (?,?,?,?,?,?,?)";

			java.sql.PreparedStatement preparedStatement = dbCon.prepareStatement(SQL_INSERT); 
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		    LocalDateTime now = LocalDateTime.now();
		     preparedStatement.setString(7, dtf.format(now));
	        preparedStatement.setString(1, name);
	        preparedStatement.setInt(2,amount );
	        preparedStatement.setInt(3,phone );
	        preparedStatement.setInt(4,widh );
	        preparedStatement.setInt(5,deposite );
	        preparedStatement.setInt(6,account );
	        int row = preparedStatement.executeUpdate();
	        
			System.out.println("Successfully Connected to DataBase...");

			}

		catch (SQLException e) {

			System.out.println("Exception while connecting to db : " + e.getMessage());
		}

	}
	void updateData(Connection dbCon,int widh,int account ) {
		//Write the query to update Table
		String updateQry = "update wallet_details set wallet_amount= ? where wallet_accountNo=? ";
		String query = "select wallet_accountNo from wallet_details  ";
		
		try {
		
		java.sql.PreparedStatement pstmt = dbCon.prepareStatement(updateQry); 
        
		pstmt = dbCon.prepareStatement(updateQry);
		java.sql.PreparedStatement preparedStatement = dbCon.prepareStatement(query); 
		
		ResultSet rs = preparedStatement.executeQuery();
		//System.out.println("hii");
	      while (rs.next()) {
	    	  
	        int dbAccount = rs.getInt(1);
	       
	        if(dbAccount == account)
	        {
	        	//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			    //LocalDateTime now = LocalDateTime.now();	
	        	pstmt.setInt(1, rs.getInt(1)-widh);
	        	//pstmt.setString(2, dtf.format(now));
	        	pstmt.setInt(2, account);
	        }

	      }
		//Execute the query
		if(pstmt.executeUpdate() > 0)
				System.out.println("widhthrawl successfully...");
		else
			System.out.println("Some issues while updating the row...");
		} catch (SQLException e) {
			System.out.println("Issues while creating the prepared statement : " + e.getMessage());
		}
	}
	
	void updateData1(Connection dbCon,int widh,int account ) {
		//Write the query to update Table
		String updateQry = "update wallet_details set wallet_amount= ? where wallet_accountNo=? ";
		String query = "select wallet_accountNo from wallet_details  ";
		
		try {
		
		java.sql.PreparedStatement pstmt = dbCon.prepareStatement(updateQry); 
        
		pstmt = dbCon.prepareStatement(updateQry);
		java.sql.PreparedStatement preparedStatement = dbCon.prepareStatement(query); 
		
		
		ResultSet rs = preparedStatement.executeQuery();
		//System.out.println("hii");
	      while (rs.next()) {
	    	  
	        int dbAccount = rs.getInt(1);
	        //System.out.println("hii");
	        if(dbAccount == account)
	        {
	        	//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			    //LocalDateTime now = LocalDateTime.now();
	        	pstmt.setInt(1, rs.getInt(1)+widh);
	        	//pstmt.setString(2, dtf.format(now));
	        	pstmt.setInt(2, account);
	        }

	      }
		//Execute the query
		if(pstmt.executeUpdate() > 0)
				System.out.println("deposit successfully...");
		else
			System.out.println("Some issues while updating the row...");
		} catch (SQLException e) {
			System.out.println("Issues while creating the prepared statement : " + e.getMessage());
		}
	}
	void display(Connection dbCon)

	{

		try {  

		      String query = "select wallet_name, wallet_amount, wallet_phoneNo,wallet_accountNo from wallet_details  ";

		      java.sql.PreparedStatement preparedStatement = dbCon.prepareStatement(query); 

		     ResultSet rs = preparedStatement.executeQuery();

		      while (rs.next()) {

		        String name = rs.getString(1);

		        int dbamount = rs.getInt(2);

		        int phone = rs.getInt(3);
		        int account = rs.getInt(4);
		        System.out.printf(name + "\t" + dbamount + "\t" + phone,account);

		      }

		    } catch (Exception e) {

		      e.printStackTrace();

		    } 

	}

}