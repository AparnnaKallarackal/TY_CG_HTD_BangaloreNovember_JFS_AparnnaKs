package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {
public static void main(String[] args) {
	//load driver
	//get DB connection via driver
	//issues sql queries via connection
	//process the results returned
	//close all JDBC objects
	
	
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	Scanner scn=new Scanner(System.in);
	
	try
	{
		//load driver
		Driver driver=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("driver loaded............");
		
		//get db connection via driver
		String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
		System.out.println("enter user name and password");
		String dbUser=scn.nextLine();
		String dbPass=scn.nextLine();
		conn=DriverManager.getConnection(dbUrl,dbUser, dbPass);
		System.out.println("connection established...............");
		
		
		//issues sql queries via connection
		String query="select * from user_info where userid=100 and password='appa'";
		stmt=conn.createStatement();
		rs=stmt.executeQuery(query);
		System.out.println("query issue and executed");
		
		//process result returned
		if(rs.next())//only zero or one row we can use if o.w use while loop
		{
			System.out.println("user id "+rs.getInt(1));
			System.out.println("user name "+rs.getString(2));
			System.out.println("email "+rs.getString(3));
		}
		
		
		
		
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(conn!=null)
			{conn.close();
			System.out.println("closing connection");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();

		}
		try {
			if(stmt!=null)
				{stmt.close();
			System.out.println("closing statement");}
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
		try {
			if(rs!=null)
			{
				rs.close();
				System.out.println("closing result set");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}
}
