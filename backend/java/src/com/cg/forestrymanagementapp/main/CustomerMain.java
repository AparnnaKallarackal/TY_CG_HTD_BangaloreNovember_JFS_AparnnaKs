package com.cg.forestrymanagementapp.main;

import java.util.Scanner;

import com.cg.forestrymanagement.home.Home;
import com.cg.forestrymanagementapp.DAO.CustomerDAO;
import com.cg.forestrymanagementapp.bean.CustomerBean;
import com.cg.forestrymanagementapp.factory.CustomerFactory;

public class CustomerMain {
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	CustomerDAO custDao=CustomerFactory.instanceOfCustomerDAOImpl();
	CustomerBean custBean=new CustomerBean();
	while(true) {
	
	System.out.println("*****************");
	System.out.println();
	System.out.println("press 1 for adding customer");
	System.out.println("press 2 for deleting customer");
	System.out.println("press 3 for modifying customer details");
	System.out.println("press 4 for customer details");
	System.out.println("press 5 for home");
	System.out.println();
	System.out.println("*****************");
	System.out.println();
	System.out.println();
	
	int choice=scn.nextInt();
	
	switch (choice)
	{
	case 1:
		System.out.println("enter customer id");
		custBean.setCustId(scn.nextInt());
		System.out.println("enter customer name");
		custBean.setCustName(scn.next());
		System.out.println("enter customer street address1");
		custBean.setCustAddress1(scn.next());
		System.out.println("enter customer street address1");
		custBean.setCustAddress2(scn.next());
		System.out.println("enter customer town");
		custBean.setCustTown(scn.next());
		System.out.println("enter customer postal code");
		custBean.setCustPostalCode(scn.nextInt());
		System.out.println("enter customer email id");
		custBean.setCustEmail(scn.next());
		boolean check=custDao.addCustomer(custBean);
		if(check)
			System.out.println("customer details added...");
		else
			System.out.println("invalid customer id..");
		break;
		
	case 2:
		System.out.println("enter customer id");
		int id=scn.nextInt();
		System.out.println("enter customer name");
		String name=scn.next();
		boolean check1=custDao.deleteCustomer(id, name);
		if(check1)
			System.out.println("deleted");
		else
			System.out.println("invalid id...plz check again");
		break;
		
	case 3:
		System.out.println("enter customer id");
		int idModify=scn.nextInt();
		System.out.println("enter customer name");
		String nameModify=scn.next();
		boolean check2=custDao.modifyCustomer(idModify, nameModify);
		if(check2)
			System.out.println("modified");
		else
			System.out.println("invalid id...plz check again");
		break;
		
	case 4:
		System.out.println("enter customer id");
		int idDetails=scn.nextInt();
		System.out.println("enter customer name");
		String nameDetails=scn.next();
		custDao.customerDetails(idDetails, nameDetails);
		break;
	case 5:
		System.out.println(" Home");
		Home.main(args);
		break;
		
		
		
	}
		
	}
		
			
}
}
