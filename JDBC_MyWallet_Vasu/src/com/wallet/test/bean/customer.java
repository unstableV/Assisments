package com.wallet.test.bean;

public class customer {

	String name;
	int widhrawl,phone,deposite,amount,account;
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWidhrawl() {
		return widhrawl;
	}
	public void setWidhrawl(int widhrawl) {
		this.widhrawl = widhrawl;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getDeposite() {
		return deposite;
	}
	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}
	@Override
	public String toString() {
		return "customer [name=" + name + ", phone=" + phone + ",amount="+amount+"]";
	}
	
	
}
