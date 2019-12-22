package com.cg.shoppingapp.controller;

import java.util.Scanner;

import com.cg.shoppingapp.beans.ProductBean;
import com.cg.shoppingapp.factory.ProductFactory;
import com.cg.shoppingapp.services.ProductServices;

public class Choice2Main {
	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		ProductServices services=ProductFactory.instanceOfProductServices();
		ProductBean bean=new ProductBean();

		System.out.println("press 1 to buy the product");
		System.out.println("press 2 to search again");
		System.out.println("press 3 to last menu");
		int choice=scn.nextInt();

		switch (choice) {
		case 1:
			System.out.println("enter product name");
			bean.setProName(scn.next());
			if(services.search(bean)) {
				System.out.println(bean);
			}else
				System.out.println("not found..");
			break;





		}
		}
	}
