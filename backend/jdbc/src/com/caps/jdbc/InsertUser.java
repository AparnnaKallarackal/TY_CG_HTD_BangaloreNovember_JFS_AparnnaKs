package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Driver;

public class InsertUser {
	public static void main(String[] args) {
		
		//load driver
				//get DB connection via driver
				//issue SQL query
				//process results
				//close all jdbc objects
				Connection conn=null;
				PreparedStatement pstmt=null;
				
				Scanner scn=new Scanner((System.in));
				
				
				try {
					
					//load driver
					
					Driver d=new com.mysql.jdbc.Driver();
					DriverManager.registerDriver(d);
					System.out.println("driver loaded.....");
					
					//get the DB connection
					String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
					System.out.println("enter user name and password");
					String user=scn.nextLine();
					String password=scn.nextLine();
					conn=DriverManager.getConnection(dbUrl, user, password);
					System.out.println("connection established.....");
					
					
					//issue SQL Query
					String query="insert into user_info values(?,?,?,?)";
					pstmt=conn.prepareStatement(query);
					
					System.out.println("enter user id.........");
					pstmt.setInt(1,Integer.parseInt(scn.nextLine()));//parameter index
					
					System.out.println("enter username.........");
					pstmt.setString(2,scn.nextLine());
					
					System.out.println("enter email.........");
					pstmt.setString(3,scn.nextLine());
					
					
					System.out.println("enter password.........");
					pstmt.setString(4,scn.nextLine());//parameter index
					
					
					int count=pstmt.executeUpdate();//integer  -->when using other than select clause----in select clause we get--> result set
					if(count>0)
					{
						System.out.println("user data entered............");
					}else
						System.err.println("something went wrong.......");
					
					
					
					
				} catch (SQLException e) {

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
			}
	}

}
