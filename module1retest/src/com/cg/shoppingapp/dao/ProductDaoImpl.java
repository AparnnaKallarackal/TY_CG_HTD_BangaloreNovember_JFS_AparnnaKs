package com.cg.shoppingapp.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cg.shoppingapp.beans.ProductBean;

public class ProductDaoImpl implements ProductDao {
	FileReader reader;
	Properties prop;
	ProductBean product;
	
	public ProductDaoImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader=new FileReader("data.properties");
			prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
			} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	@Override
	public List<ProductBean> showAll() {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPass"));
				 Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("showAllQuery"))){
				while(rs.next())
				{
					product=new ProductBean();
					product.setProId(rs.getInt(1));
					product.setProName(rs.getString(2));
					product.setProCost(rs.getDouble(3));
					product.setProColor(rs.getString(4));
					product.setDes(rs.getString(5));
					product.setNumOfPro(rs.getInt(6));
					list.add(product);
				}
				return list;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean search(ProductBean bean) {
		try {Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),
				prop.getProperty("dbPass"));
		PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("searchQuery"));
		int count=pstmt.executeUpdate();
		
		if(count>0)
		{
			return true;
			
		}	
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public ProductBean buyPro() {
		

		return null;
	}

}
