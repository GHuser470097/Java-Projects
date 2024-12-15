package com.demo;

public class Obj_Employee
{
	public static void main(String[] args)
	{
		Employee E1=new Employee(117, "Rajesh", 745234904, "Andheri", 30000.00, 2500.00, 2500.00);
		System.out.println("Employee ID      : "+E1.emp_id);		
	    System.out.println("Employee Name    : "+E1.emp_name);		
	    System.out.println("Employee Address : "+E1.emp_address);
	    System.out.println("Employee Contact No : "+E1.emp_contact);
	    System.out.println("Employee Salary : "+E1.emp_sal);
	    System.out.println("Employee Provident Fund : "+E1.emp_epf);
	    System.out.println("Employee Allowance : "+E1.emp_allowance);
	    double s1 = (E1.emp_sal-E1.emp_epf-E1.emp_allowance);
	    System.out.println("Employee New salary: "+s1);
	    Employee E2=new Employee(145, "Ramesh", 795294504, "Kolkata", 3000.00, 245.00, 215.00);
	    System.out.println("Employee ID      : "+E2.emp_id);		
	    System.out.println("Employee Name    : "+E2.emp_name);		
	    System.out.println("Employee Address : "+E2.emp_address);
	    System.out.println("Employee Contact No : "+E2.emp_contact);
	    System.out.println("Employee Salary : "+E2.emp_sal);
	    System.out.println("Employee Provident Fund : "+E2.emp_epf);
	    System.out.println("Employee Allowance : "+E2.emp_allowance);
	    double s2 = (E2.emp_sal-E2.emp_epf-E2.emp_allowance);
	    System.out.println("Employee New salary: "+s2);
	}
}