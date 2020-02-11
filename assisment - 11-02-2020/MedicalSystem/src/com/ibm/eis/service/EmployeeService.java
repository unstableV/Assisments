package com.ibm.eis.service;

import java.util.Map;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.dao.Dioclass;
//import com.ibm.test.dao.DaoClass;

 public class EmployeeService implements EmployeeServiceInterface {

		Dioclass dao = new Dioclass();
		
		@Override
		public int validateUser(int salary ,String desigination) {
			if(salary>=5000 && salary<20000 && desigination.equals("SystemAssociate") )
				return 3;
			if(salary>=20000 && salary<40000 && desigination.equals("Programmer") )
				return 2;
			if(salary>=40000 && desigination.equals("Manager") )
			   return 1;
			//return 0;
	    return 0;
			
		}
		
	public void storeIntoMap1(Employee employee){
			dao.storeIntoMap(employee);
	}

		public Map<Integer, Employee> Employee() {
			return dao.displayPersons();
		}

		@Override
		public int validateUserName(int salary, String desigination) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void storeIntoMap(com.ibm.eis.bean.Employee employee) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Map<Integer, com.ibm.eis.bean.Employee> displayEmployee() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public char[] displayPersons1() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public char[] displayPersons() {
			// TODO Auto-generated method stub
			return null;
		}
	}


