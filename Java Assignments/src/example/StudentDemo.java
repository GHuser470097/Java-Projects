package com.example;

public class StudentDemo
{
	public static void main(String[] args)
	{
		Student stud = new Student();            // student object
		stud.setStudid(101);                       // set all members
		stud.setStudname("Akash");
		stud.setStudfees(10000.00);
		
		System.out.println(stud.toString());
		
		stud.setStudid(102);                       // set all members
		stud.setStudname("Akshay");
		stud.setStudfees(15000.00);
		
		System.out.println("Student ID   : " +stud.getStudid() );   // get all members
		System.out.println("Student Name : " +stud.getStudname() );
		System.out.println("Student Fees : " +stud.getStudfees() );
	}
}