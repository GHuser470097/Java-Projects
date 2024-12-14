package com.example;

public class Student
{
	private int studid;
	private String studname;
	private double studfees;
	
	public int getStudid()
	{
		return studid;
	}
	public void setStudid(int sid)
	{
		this.studid = sid;
	}
	public String getStudname() 
	{
		return studname;
	}
	public void setStudname(String sname)
	{
		this.studname = sname;
	}
	public double getStudfees()
	{
		return studfees;
	}
	public void setStudfees(double sfees) 
	{
		this.studfees = sfees;
	}
	
	public String toString() 
	{
		return "Student [studid=" + studid + ", studname=" + studname + ", studfees=" + studfees + "]";
	}
}