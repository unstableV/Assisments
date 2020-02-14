package com.ibm.wallet.dao;

import java.sql.ResultSet;
import java.util.Date;

import com.ibm.wallet.bean.Customer;

public interface WalletDatabaseInterface {
	public void createAccount(String userName, String userID, int balance, String phoneNumber);
	public int getBalance(String userID);
	public void deposit(int amt, String userID);
	public void withdraw(int amt, String userID);
	public void fundTransfer(String fromID, String toID, int amt, String date);
	public ResultSet printTransaction(String userID);
	void createAccount(Customer cust);
	void deposit(Customer cust, int amt);
	void withdraw(int amt, Customer cus);
	void fundTransfer(Customer cust, int amt, String date);
}
