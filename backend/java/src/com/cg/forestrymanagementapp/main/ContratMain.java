package com.cg.forestrymanagementapp.main;

import java.util.Scanner;

import com.cg.forestrymanagement.home.Home;
import com.cg.forestrymanagementapp.DAO.ContractDAO;
import com.cg.forestrymanagementapp.bean.ContractBean;
import com.cg.forestrymanagementapp.factory.ContractFactory;

public class ContratMain {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	ContractDAO contractDao=ContractFactory.instanceOfContractDAOImpl();
	ContractBean contractBean=new ContractBean();
	while(true) {
		System.out.println("*****************");
		System.out.println();
		System.out.println("press 1 for adding contract");
		System.out.println("press 2 for deleting contract");
		System.out.println("press 3 for home");
		System.out.println();
		System.out.println("*****************");
		System.out.println();
		System.out.println();
		
		int choice=scn.nextInt();
			
		switch (choice)
		{
		case 1:
			System.out.println("enter contract no");
			contractBean.setContractNo(scn.nextInt());
			System.out.println("enter customer id");
			contractBean.setCustomerId(scn.nextInt());
			System.out.println("enter product id");
			contractBean.setProductId(scn.nextInt());
			System.out.println("enter haulier id");
			contractBean.setHaulierId(scn.nextInt());
			System.out.println("enter delivery date");
			contractBean.setDeiveryDate(scn.next());
			System.out.println("enter delivery day");
			contractBean.setDeliveryDay(scn.next());
			System.out.println("enter quantity");
			contractBean.setQuantity(scn.nextInt());
			
			boolean check=contractDao.addContractor(contractBean);
			if(check)
				System.out.println("contract added");
			else
				System.out.println("something went wrong ...please check");
			break;
			
		case 2:
			System.out.println("enter contract number");
			int contractId1=scn.nextInt();
			System.out.println("enter customer id");
			int customerId=scn.nextInt();
			
			boolean check1=contractDao.deleteContractor(contractId1, contractId1);
			if(check1)
				System.out.println("contract deleted");
			else 
				System.out.println("something went wrong ...please check again");
			break;
			
		case 3:
			System.out.println(" Home");
			Home.main(args);
			break;
			
			
		}
	}		
}
}
