package com.wallet.test.service;



import com.wallet.test.bean.customer;
import com.wallet.test.dao.Daoclass;

public  class ServiveClass implements ServiceInterface {

	Daoclass dao = new Daoclass();
	
	@Override
	public int sendAmount(int widh,int amount) {
		amount = amount - widh;
		return amount;
	}
	@Override
	public int depositeAmount(int dep,int amount) {
		amount = amount +dep;
		return amount;
	}
    public void storeIntoMap(customer customer){
		dao.storeIntoMap(customer);
     }
    	
    public void update(customer customer) {
    	dao.update(customer);
    }
    public void update1(customer customer) {
    	dao.update1(customer);
    }
    public void displayDetails(customer customers) {
    	dao.display(customers);
    }
	@Override
	public boolean validateUserName(String userName) {
		// TODO Auto-generated method stub
		return false;
	}
    

	//@Override
//	public Map<Integer, Person> displayPersons() {
//		
//		return dao.displayPersons();
//	}
	
}