package com.ibm.wallet.service;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.ibm.wallet.bean.Customer;
import com.ibm.wallet.dao.WalletDatabase;

public class WalletService implements WalletServiceInterface{
	WalletDatabase wd = new WalletDatabase();
	@Override
	public void createAccount(Customer cust) {
		wd.createAccount( cust);
	}
	@Override
	public void deposit(Customer cust,int amt) {
		wd.deposit( cust,amt);
	}
	@Override
	public boolean withdraw(int amt, Customer cus) {
		boolean b = true;
		int bal = wd.getBalance(cus.getUserID());
		if(amt <= bal) {
			wd.withdraw(amt, cus);
		}
		else {
			System.out.println("Insufficient Balance!!!");
			b = false;
		}
		return b;
	}
	@Override
	public void fundTransfer(Customer cust, int amt, Date date) {
		String pattern = "MM/dd/yyyy HH:mm:ss";

		DateFormat df = new SimpleDateFormat(pattern);

		Date today = Calendar.getInstance().getTime();        

		String todayAsString = df.format(today);
		//System.out.println("hoo");
		wd.fundTransfer(cust, amt, todayAsString);
	}
	@Override
	public ResultSet printTransactions(String userID) {
		return wd.printTransaction(userID);
	}
	@Override
	public boolean withdraw(Customer cust) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void deposit(int amt, String userID) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean withdraw(int amt, String userID) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void fundTransfer(String fromUserID, String toUserID, int amt, Date date) {
		// TODO Auto-generated method stub
		
	}
}
