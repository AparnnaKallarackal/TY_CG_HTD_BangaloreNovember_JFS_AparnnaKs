package com.cg.phonesimulatorapp.dao;

import java.util.Scanner;

public class SearchDaoImpl implements SearchDao{
	
	Scanner scn=new Scanner(System.in);

	@Override
	public void call(String name) {
		System.out.println("select contact "+scn.nextLong());
		System.out.println("connected");
		System.out.println("press 0 disconnect");
		int choice=scn.nextInt();
		while(true) {
			if(choice==0) {
				System.out.println("call ended");
				return;
			}
			else
				System.out.println("enter valid number");
		}
		
	}

	@Override
	public void message(String message) {
		System.out.println("select contact "+scn.next());
		System.out.println("type message ");
		String message1=scn.next();
		System.out.println("Message sent  :");
		System.out.println(message1);
		
	}
	
	
	
}
