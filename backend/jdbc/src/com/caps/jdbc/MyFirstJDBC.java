package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		try {
			//load driver
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded");
			//get DB connection via driver
			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6"+"?user=root&password=root";
					conn=DriverManager.getConnection(dbUrl);
					System.out.println("connection established");
					
					//issue SQL query via connection
					String query="select * from user_info";
					stmt=conn.createStatement();
					stmt.execute(query);
					rs=stmt.executeQuery(query);
					System.out.println("query issued......................");
					
					//process the result returned
					while(rs.next()) {
						System.out.println("user id"+rs.getInt("userid"));
						System.out.println("user name:"+rs.getString("username"));
						System.out.println("email:"+rs.getString("email"));
						System.out.println("password"+rs.getString("password"));
						System.out.println("***********************");
					}
					
				
		} 
		
		
		catch (SQLException e) {

			e.printStackTrace();
		}



		//close all JDBC Objects
		finally {
			
				try {
					if(conn !=null)
					{
					conn.close();
					}
				} 
					catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					if(stmt !=null)
						stmt.close();
				}	
					
					catch (SQLException e) {

						e.printStackTrace();
					}
					
					try {
						if(rs != null)
						rs.close();
						
					}
						catch(SQLException e) {
							e.printStackTrace();
						}
					}
				}
				
			
		}

	



