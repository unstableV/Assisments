package com.ibm.wallet.bean;

public class Customer {
	
	int balance;
	String userName, userID, phoneNumber,recieptID;
	public String getRecieptID() {
		return recieptID;
	}
	public void setRecieptID(String recieptID) {
		this.recieptID = recieptID;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
