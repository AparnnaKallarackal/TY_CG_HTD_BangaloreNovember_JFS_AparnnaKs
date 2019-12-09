package com.cg.forestrymanagementapp.main;

import java.util.Scanner;

import com.cg.forestrymanagement.home.Home;
import com.cg.forestrymanagementapp.DAO.ProductDAO;
import com.cg.forestrymanagementapp.bean.ProductBean;
import com.cg.forestrymanagementapp.factory.ProductFactory;

public class ProductMain {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	ProductDAO productDao=ProductFactory.instanceOfProductDAOImpl();
	ProductBean productBean=new ProductBean();
	while(true) {
		
		System.out.println("*****************");
		System.out.println();
		System.out.println("press 1 to add product");
		System.out.println("press 2 to  delete product");
		System.out.println("press 3 for modifying product");
		System.out.println("press 4 for home");
		System.out.println();
		System.out.println("*****************");
		System.out.println();
		System.out.println();
		
		int choice=scn.nextInt();
		
		switch (choice)
		{
		case 1:
			System.out.println("enter product id");
			productBean.setId(scn.nextInt());
			boolean check=productDao.addProduct(productBean);
			if(check)
				System.out.println("product id added");
			else
				System.out.println("invalid product id");
			break;
			
		case 2:
			System.out.println("enter product id");
			int productId=scn.nextInt();
			boolean check1=productDao.deleteProduct(productId);
			if(check1)
				System.out.println("product id deleted");
			else
				System.out.println("invalid id ..please check id");
			break;
			
		case 3:
			System.out.println(" Home");
			Home.main(args);
			break;
			
		
	}
}
}
}
