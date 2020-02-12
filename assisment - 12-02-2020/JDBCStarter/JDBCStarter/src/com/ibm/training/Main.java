package com.ibm.training;
import java.util.*;

//import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static <PreparedStatement> void main(String[] args) {
		
		int n;
		System.out.println("Enter the 1 for insert the values || Enter 2 for delete the value || Enter 3 for display");
		Scanner s1 = new Scanner(System.in); 
		n = s1.nextInt();
		switch (n) {
		case 1:
			try {
			Scanner s = new Scanner(System.in); 
			System.out.println("enter the name");
			String name = s.nextLine();
			System.out.println("enter the salary");
			int salary = s.nextInt();
		    System.out.println("enter the desigination");
	        String desigination = s.nextLine();
	        String desigination1 = s.nextLine();
			//Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Connect to the db
			Connection dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/employdetails?useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
         	new Main().insertData(dbCon,name,salary,desigination1);
			} catch (ClassNotFoundException e) {
			System.out.println("Exception while loading driver" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Exception while connecting to db : " + e.getMessage());
		}
			break;
		case 2:
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/employdetails?useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
			System.out.println("Enter the id which you want to delete");
			Scanner s = new Scanner(System.in);
			int id1 = s.nextInt();
			new Main().delete(dbCon,id1);
			}
			catch (ClassNotFoundException e) {
				System.out.println("Exception while loading driver" + e.getMessage());
			} 
			catch (SQLException e) {
				System.out.println("Exception while connecting to db : " + e.getMessage());
			}
			break;
		case 3:
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/employdetails?useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
				new Main().display(dbCon);
			}
			catch (ClassNotFoundException e) {
				System.out.println("Exception while loading driver" + e.getMessage());
			} 
			catch (SQLException e) {
				System.out.println("Exception while connecting to db : " + e.getMessage());
			}
			break;
		}
			
	}
	 void delete(Connection dbCon , int id) {
        try {
        	String sql = "DELETE FROM employ_details WHERE employ_id = ?";
        	 
        	java.sql.PreparedStatement preparedStatement = dbCon.prepareStatement(sql); 
        	preparedStatement.setInt(1, id);
        	preparedStatement.executeUpdate();
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
	void insertData(Connection dbCon,String name,int salary,String desigination1) {
		try {
			String SQL_INSERT = "INSERT INTO employ_details (employ_name, employ_salary, employ_desigination) VALUES (?,?,?)";
			java.sql.PreparedStatement preparedStatement = dbCon.prepareStatement(SQL_INSERT); 
	        preparedStatement.setString(1, name);
	        preparedStatement.setInt(2,salary );
	        preparedStatement.setString(3,desigination1 );
	        int row = preparedStatement.executeUpdate();
			System.out.println("Successfully Connected to DataBase...");
			}
		catch (SQLException e) {
			System.out.println("Exception while connecting to db : " + e.getMessage());
		}
	}
	void display(Connection dbCon)
	{
		try {  
		      String query = "select employ_name, employ_salary, employ_desigination from employ_details  ";
		      java.sql.PreparedStatement preparedStatement = dbCon.prepareStatement(query); 
		     ResultSet rs = preparedStatement.executeQuery();
		      while (rs.next()) {
		        String dbDeptname = rs.getString(1);
		        int dbsalary = rs.getInt(2);
		        String dbDeptLocation = rs.getString(3);
		        System.out.println(dbDeptname + "\t" + dbsalary + "\t" + dbDeptLocation);
		      }
		    } catch (Exception e) {
		      e.printStackTrace();
		    } 
	}
	
	

}
