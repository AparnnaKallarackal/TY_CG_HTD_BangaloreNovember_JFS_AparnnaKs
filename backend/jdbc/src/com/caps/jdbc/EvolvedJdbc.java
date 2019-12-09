package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EvolvedJdbc {
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	String dburl="jdbc:mysql://localhost:3306/ty_cg_nov6";
	System.out.println("enter username");
	String dbname=scn.nextLine();
	System.out.println("enter passsword");
	String dbpass=scn.nextLine();
	String query="select * from user_info";
	
	
	
	
	try(
			Connection conn=DriverManager.getConnection(dburl, dbname, dbpass);
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query))
			{
			while(rs.next())
			{
				System.out.println("user name"+rs.getString(2));
				System.out.println("email"+rs.getString(3));
				System.out.println("*************");
			}
			}
	catch(Exception e)
	{
			
	e.printStackTrace();
		
	}
}
}
