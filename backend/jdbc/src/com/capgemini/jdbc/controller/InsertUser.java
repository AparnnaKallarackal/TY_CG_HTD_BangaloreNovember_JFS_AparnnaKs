package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class InsertUser {
public static void main(String[] args) {
	
	UserServices services=UserFactory.instanceOfUserServices();
	UserBean user=new UserBean();
	Scanner scn=new Scanner(System.in);
	
	System.out.println("enter user id....");
	user.setUserid(Integer.parseInt(scn.nextLine()));
	
	System.out.println("enter user name.....");
	user.setUsername(scn.nextLine());
	
	System.out.println("enter email........");
	user.setEmail(scn.nextLine());
	
	System.out.println("enter password.....");
	user.setPassword(scn.nextLine());
	
	if(services.insertUser(user)) {
		System.out.println("user inserted.........");
		
	}
	else
		System.err.println("something went wrong..........");
	scn.close();
}
}
