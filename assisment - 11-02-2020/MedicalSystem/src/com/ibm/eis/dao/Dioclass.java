package com.ibm.eis.dao;

import java.util.HashMap;
import java.util.Map;

import com.ibm.eis.bean.Employee;

public class Dioclass implements DaoInterface{

	private Map<Integer,Employee> employee=new 
			HashMap<Integer,Employee>();
	
	@Override
	public void storeIntoMap(Employee employee) {
	
		((Map<Integer, Employee>) employee).put(1, employee);	
	}
	public Map<Integer,Employee>displayPersons(){
		return employee;		
	}

}