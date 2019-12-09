package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;



public class UserEmailUpdate {

	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
				
		
		
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			System.out.println("driver loaded..............");
			
			//get DB connection via driver
			
			String dburl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("enter username");
			String dbname=scn.nextLine();
			
			System.out.println("enter password");
			String dbpass=scn.nextLine();
			
			conn=DriverManager.getConnection(dburl, dbname, dbpass);
			System.out.println("connection established.......");
			
			
			//issue  queries via connection
			String query="update user_info set email=? where userid=? and password=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter user id");
			pstmt.setInt(2, Integer.parseInt(scn.nextLine()));
			System.out.println("enter password");
			pstmt.setString(3, scn.nextLine());
			System.out.println("enter new email");
			pstmt.setString(1, scn.nextLine());
			
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("email updated");
			}
			else
				System.err.println("something went wrong......");
			
			
			} catch (Exception e) {

			e.printStackTrace();
		}
		
		finally
		{
			try {
				scn.close();
			if(conn!=null)
			{
				conn.close();
				System.out.println("conn closedd....");
			}
			if(pstmt!=null)
			{
				pstmt.close();
				System.out.println("pstmt closedd....");
			}
		
		}
			catch(Exception ex){
				ex.printStackTrace();
				
			}
		
		}
	}
	
	
	
	
}
