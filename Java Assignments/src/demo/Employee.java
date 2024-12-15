package com.demo;

public class Employee 
{
	int emp_id;
	String emp_name;             // variables
	long emp_contact;
	String emp_address;
	double emp_sal;
	double emp_epf;
	double emp_allowance;
	public String s;
	
	Employee(int eid,String ename,long econtact,String eaddress,double esalary,double eepf, double eallow) 	 // constructor
	{
	 	this.emp_id = eid;
	 	this.emp_name = ename;
	 	this.emp_contact = econtact;
	 	this.emp_address = eaddress;
	 	this.emp_sal = esalary;
	 	this.emp_epf = eepf;
	 	this.emp_allowance = eallow;
	}
	void empdetails()
	{
	   System.out.println("Employee ID      : "+emp_id);		
       System.out.println("Employee Name    : "+emp_name);		
       System.out.println("Employee Address : "+emp_address);		
	}
	
	double salary(double emp_sal,double emp_epf, double emp_allowance)        // method
	{
	     double s =(emp_sal-emp_epf-emp_allowance);
		 return s;
	}
}