package com.wallet.test.ui;
import java.util.Scanner;

import com.wallet.test.bean.customer;
import com.wallet.test.dao.DaoInterface;
import com.wallet.test.service.ServiveClass;
import com.wallet.test.service.ServiceInterface;

public class main {
	
	public static void main(String[] args) {

		String name;
		int widhrawl,phone,deposite,amount=0,n=1,widh,dep,account;
		Scanner scan= new Scanner(System.in);
	
		ServiveClass service= new ServiveClass();
		customer customer1 = new customer();
		
		while(n==1){
			System.out.println("Press 1 to create new account: ");
			System.out.println("Press 2 to display the details: ");
			System.out.println("Press 3 to widhrawl:");
			System.out.println("Press 4 to deposite:");
				
		int n1 = scan.nextInt();
		switch(n1)
		{
		case 1:
			System.out.println("enter name");
			 name=scan.nextLine();
			 name=scan.nextLine();


		    System.out.println("Enter the Account Number");
		       account=scan.nextInt();
			System.out.println("Enter phone number");
			 phone=scan.nextInt();
			System.out.println("Enter the initial amount to be deposite");
			 amount=scan.nextInt();
			customer1.setName(name);
			customer1.setPhone(phone);
			customer1.setAmount(amount);
			customer1.setAccount(account);
			service.storeIntoMap(customer1);
			 break;
		case 2:
		     service.displayDetails(customer1);
			break;
		case 3:
		    System.out.println("enter amount to be widhrawl");
		    widhrawl=scan.nextInt();
		    customer1.setWidhrawl(widhrawl);
		    widh=service.sendAmount(widhrawl,amount);
		    //customer1.setAmount(widh);
		    //customer1.setAmount(amount-widhrawl);
		    service.update(customer1);
		    break;
		case 4:
			System.out.println("Ente the amount to be deposite ");
			deposite = scan.nextInt();
			customer1.setDeposite(deposite);
			dep = service.depositeAmount(deposite,amount);
			//customer1.setAmount(dep);
			//customer1.setAmount(amount-dep);
			service.update1(customer1);
			break;
		}
		System.out.println("If you want to continue the banking press 1 else 0");
		n = scan.nextInt();
		}		
	}

}
