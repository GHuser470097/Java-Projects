package com.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class BankDB
{
	public static void main(String[] args) 
	{
		try
		{
		//Register type-4 driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","12345");
		
		// create statement
		Statement st = con.createStatement();
		
		// query
		String s1 = "select * from Bank_data";
		
		// execute query
		ResultSet rs = st.executeQuery(s1);
		
		//print data
		System.out.println( "User ID " + "      User Name "+"             Email ID "+"             Account number "+"                   Address");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"      "+rs.getString(2)+"      "+rs.getString(3)+"      "+rs.getString(4)+"      "+rs.getString(5));
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
