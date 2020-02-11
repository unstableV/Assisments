package com.ibm.eis.dao;

import java.util.HashMap;
import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface DaoInterface {
	
	
	void storeIntoMap(Employee employee);
	Map<Integer,Employee> displayPersons();
}

