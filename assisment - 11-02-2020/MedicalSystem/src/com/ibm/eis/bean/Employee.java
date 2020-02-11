package com.ibm.eis.bean;

public class Employee {

	
		// TODO Auto-generated method stub
           private int id,salary;
            private String name,desigination;
			int scheme;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public int getSalary() {
				return salary;
			}
			public void setSalary(int salary) {
				this.salary = salary;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getDesigination() {
				return desigination;
			}
			public void setDesigination(String desigination) {
				this.desigination = desigination;
			}
			public int getScheme() {
				return scheme;
			}
			public void setScheme(int scheme2) {
				this.scheme = scheme2;
			}
			
			@Override
			public String toString() {
				return "Employee [name=" + name + ", id =" + id + ",salary = " + salary+",desigination = "+desigination+",Scheme"+scheme+" ]";
			}
		
			
           
	

}
