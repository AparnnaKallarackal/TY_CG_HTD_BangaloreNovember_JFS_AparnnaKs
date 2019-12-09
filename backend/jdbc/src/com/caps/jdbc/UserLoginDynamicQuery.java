package com.caps.jdbc;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLoginDynamicQuery {
public static void main(String[] args) {
	//load driver
	//get DB connection via driver
	//issues sql queries via connection
	//process the results returned
	//close all JDBC objects
	
	
	Connection conn=null;
	PreparedStatement pstmt=null;
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
		String query="select * from user_info where userid=? and password=? ";
		pstmt=conn.prepareStatement(query);
		System.out.println("enter user id.........");
		pstmt.setInt(1,Integer.parseInt(scn.nextLine()));
		System.out.println("enter password.........");
		pstmt.setString(2,scn.nextLine());
		
		
		
		
		
		rs=pstmt.executeQuery();
		System.out.println("query issue and executed");
		
		//process result returned
		if(rs.next())//only zero or one row we can use if o.w use while loop
		{
			System.out.println("user id "+rs.getInt(1));
			System.out.println("user name "+rs.getString(2));
			System.out.println("email "+rs.getString(3));
		}
		else
			System.err.println("something went wrong..........");
		
		
		
		
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
			if(pstmt!=null)
				{pstmt.close();
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



