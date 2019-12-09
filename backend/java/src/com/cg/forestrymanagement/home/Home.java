package com.cg.forestrymanagement.home;

import java.util.Scanner;

import com.cg.forestrymanagementapp.main.ContratMain;
import com.cg.forestrymanagementapp.main.CustomerMain;
import com.cg.forestrymanagementapp.main.ProductMain;

public class Home {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	while(true) {
	System.out.println("press 1 for customer");
	System.out.println("press 2 for contract");
	System.out.println("press 3 for product ");
	int choice=scn.nextInt();
	
	switch(choice)
	{
	case 1:
		CustomerMain.main(args);
		break;
	case 2:
		ContratMain.main(args);
		break;
	case 3:
		ProductMain.main(args);
	}
	}
}
}
