package com.ibm.wallet.service;

import java.sql.ResultSet;
import java.util.Date;

import com.ibm.wallet.bean.Customer;

public interface WalletServiceInterface {
	public void createAccount(Customer cust);
	public void deposit(int amt, String userID);
	public boolean withdraw(int amt, String userID);
	public void fundTransfer(String fromUserID, String toUserID, int amt, Date date);
	public ResultSet printTransactions(String userID);
	boolean withdraw(Customer cust);
	
	void deposit(Customer cust, int amt);
	boolean withdraw(int amt, Customer cus);
	void fundTransfer(Customer cust, int amt, Date date);
}
