package com.ibm.wallet.dao;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

import com.ibm.wallet.bean.Customer;
import com.ibm.wallet.service.WalletService;

public class WalletDatabase implements WalletDatabaseInterface{
	
	Connection dbCon;
	public WalletDatabase() {
		//Load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/wallet?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	@Override
	public void createAccount(Customer cust) {
		try {
			String insertQry = "INSERT INTO userdetails values (?, ?, ?, ?)";
			PreparedStatement stmt = dbCon.prepareStatement(insertQry);
			
			stmt.setString(1, cust.getUserID());
			stmt.setString(2, cust.getUserName());
			stmt.setInt(3, cust.getBalance());
			stmt.setString(4, cust.getPhoneNumber());
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Issues creating the statement :" + e.getMessage());
		}
	}
	@Override
	public int getBalance(String userID) {
		int b = 0;
		try {
			String selectQry = "select balance from userdetails where userID = ?";
			PreparedStatement stmt = dbCon.prepareStatement(selectQry);
			stmt.setString(1, userID);
			
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				return rs.getInt("balance");
			}
			else {
				System.out.println("Account does not exist!!!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
	@Override
	public void deposit( Customer cust,int amt) {
		String updateQry = "UPDATE userdetails SET balance=? WHERE userID=?";

		try {
			PreparedStatement stmt = dbCon.prepareStatement(updateQry);
			
			stmt.setInt(1, getBalance(cust.getUserID()) + amt);
			stmt.setString(2, cust.getUserID());
			int a = stmt.executeUpdate();
			if(a == 0) {
				System.out.println("Account does not exist!!!");
			}
			
		} catch (SQLException e) {
			System.out.println("Issues creating the statement :" + e.getMessage());
		}
	}
	@Override
	public void withdraw(int amt, Customer cus) {
		String updateQry = "UPDATE userdetails SET balance=? WHERE userID=?";	
		try {
			PreparedStatement stmt = dbCon.prepareStatement(updateQry);
			
			stmt.setInt(1, getBalance(cus.getUserID()) - amt);
			stmt.setString(2, cus.getUserID());
			
			//Execute the query
			int a = stmt.executeUpdate();
			if(a == 0) {
				System.out.println("Account does not exist!!!");
			}
			
		} catch (SQLException e) {
			System.out.println("Issues creating the statement :" + e.getMessage());
		}
	}
	@Override
	public void fundTransfer(Customer cust, int amt, String date) {
		//System.out.println("hoo");
		boolean b = new WalletService().withdraw(amt, cust);
		WalletDatabase s = new WalletDatabase();
		s.withdraw(amt,cust);
		if(b == true) {
			WalletDatabase s1 = new WalletDatabase();
			s1.deposit( cust,amt);
		
			try {
				String insertQry = "INSERT INTO transactiondetails(fromUserID, toUserID, amount, transactionTime) values (?, ?, ?, ?)";
				PreparedStatement stmt = dbCon.prepareStatement(insertQry);
				
				stmt.setString(1, cust.getUserID());
				stmt.setString(2, cust.getRecieptID());
				stmt.setInt(3, amt);
				stmt.setString(4, date);
				stmt.executeUpdate();
				System.out.println(amt + " transferred to recipient!!!");
			} catch (SQLException e) {
				System.out.println("Issues creating the statement :" + e.getMessage());
			}
		}
		else {
			System.out.println("Insufficient funds!!!");
		}
	}
	@Override
	public ResultSet printTransaction(String userID) {
		ResultSet rs = null;
		try {
			String selectQry = "select * from transactiondetails where fromUserID = ? or toUserID = ?";
			PreparedStatement stmt = dbCon.prepareStatement(selectQry);
			stmt.setString(1, userID);
			stmt.setString(2, userID);
			
			rs = stmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public void createAccount(String userName, String userID, int balance, String phoneNumber) {
	}
	@Override
	public void deposit(int amt, String userID) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void withdraw(int amt, String userID) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fundTransfer(String fromID, String toID, int amt, String date) {
		// TODO Auto-generated method stub
		
	}
}
