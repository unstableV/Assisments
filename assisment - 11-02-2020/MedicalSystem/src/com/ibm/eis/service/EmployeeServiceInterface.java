package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface EmployeeServiceInterface {

	int validateUserName(int salary,String desigination);
	void storeIntoMap(Employee employee);
	//public abstract
	Map<Integer,Employee> displayEmployee();
	int validateUser(int salary, String desigination);
	Map<Integer, Employee> Employee();
	char[] displayPersons1();
	char[] displayPersons();
	
	
}
