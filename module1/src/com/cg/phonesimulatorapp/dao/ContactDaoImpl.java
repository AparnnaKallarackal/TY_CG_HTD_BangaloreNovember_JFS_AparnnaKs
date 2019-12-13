package com.cg.phonesimulatorapp.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.phonesimulatorapp.bean.Contact;

public class ContactDaoImpl implements ContactDao {
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	Statement stmt=null;
	Scanner scn=new Scanner(System.in);


	@Override
	public boolean getAllContacts() {


		try {

			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded");
			String dbUrl="jdbc:mysql://localhost:3306/ContactFile"+"?user=root&password=root";
			conn=DriverManager.getConnection(dbUrl);
			System.out.println("connection established");


			String query="select * from Contact";
			stmt=conn.createStatement();
			stmt.execute(query);
			rs=stmt.executeQuery(query);



			while(rs.next()) {
				System.out.println("name is :"+rs.getString("Name"));
				System.out.println("number is :"+rs.getString("Number"));
				System.out.println("group is :"+rs.getString("Group"));
				System.out.println();
				System.out.println("***********************");
			}


		} 


		catch (SQLException e) {

			e.printStackTrace();
		}

		return true;

	}

	@Override
	public boolean addContact(Contact contact) {
		try {

			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded");
			String dbUrl="jdbc:mysql://localhost:3306/ContactFile"+"?user=root&password=root";
			conn=DriverManager.getConnection(dbUrl);
			System.out.println("connection established");

			
			String query="insert into contact values(?,?,?,?)";
			pstmt=conn.prepareStatement(query);

			System.out.println("enter contact name");
			pstmt.setString(1,scn.nextLine());

			System.out.println("enter number");
			pstmt.setLong(2,Long.parseLong(scn.nextLine()));

			int count=pstmt.executeUpdate();
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
				conn.close();
				} 
			catch (SQLException e) {
				e.printStackTrace();

			}
			try {
				if(pstmt!=null)
				pstmt.close();
				

			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
		return true;
	}

	@Override
	public boolean deleteContact(Contact contact) {
		try {

			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded");
			String dbUrl="jdbc:mysql://localhost:3306/ContactFile"+"?user=root&password=root";
			conn=DriverManager.getConnection(dbUrl);
			System.out.println("connection established");
			
			String query="delete from contact where Name=?";
			pstmt=conn.prepareStatement(query);
			
			System.out.println("enter name");
			pstmt.setString(1,scn.nextLine());
			
			
			
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("contact deleted............");
			}else
				System.err.println("something went wrong.......");
			
			
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null)
				conn.close();
				
			} 
			catch (SQLException e) {
				e.printStackTrace();

			}
			try {
				if(pstmt!=null)
					pstmt.close();
				
				} catch (SQLException e) {
				e.printStackTrace();

			}
	}


		return true;
	}

	@Override
	public boolean editContact(Contact contact) {
		try {

			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded");
			String dbUrl="jdbc:mysql://localhost:3306/ContactFile"+"?user=root&password=root";
			conn=DriverManager.getConnection(dbUrl);
			System.out.println("connection established");
			
			String query="update contact set Number=? where Name=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter user name");
			pstmt.setString(1, scn.nextLine());
			
			
			System.out.println("enter new number");
			pstmt.setString(2, scn.nextLine());
			
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("contact edited");
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
				conn.close();
				
			
			if(pstmt!=null)
				pstmt.close();
			
		
		}
			catch(Exception ex){
				ex.printStackTrace();
				
			}
		
		}
		return true;
	}



}
