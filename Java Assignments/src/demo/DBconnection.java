package com.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DBconnection
{
	public static void main(String[] args) 
	{
		try
		{
		//Register type-4 driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mydemo5","root","12345");
		
		// create statement
		Statement st = con.createStatement();
		
		// query
		String s1 = "select * from department";
		
		// execute query
		ResultSet rs = st.executeQuery(s1);
		
		//print data
		System.out.println( "Dept ID " + " Dept Name");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"      "+rs.getString(2));
		}
		
		//close connection
		con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}