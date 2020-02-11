package com.ibm.eis.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.EmployeeService;
import com.ibm.eis.service.EmployeeServiceInterface;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
	
		EmployeeServiceInterface service=
				new EmployeeService();
		
		String name,desigination;
		int id,salary,scheme;
			
		System.out.println("enter name");
		name=scan.next();
		System.out.println("enter id");
		id=scan.nextInt();
		System.out.println("enter salary");
		salary=scan.nextInt();
		System.out.println("enter desigination");
		desigination=scan.next();
		
		int isValid= service.validateUser(salary,desigination);
		scheme = isValid;
		System.out.println("Catagory of person is:"+isValid);
		
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		employee.setDesigination(desigination);
		employee.setScheme(scheme);
		System.out.println(employee);
		service.storeIntoMap(employee);
	
		//System.out.println(DaoInterface.persons);
		
		//vasuSystem.out.println(service.displayPersons());
	}
}
