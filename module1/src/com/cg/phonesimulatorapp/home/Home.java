package com.cg.phonesimulatorapp.home;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);

		System.out.println("					Press 1 to show all contacts");
		System.out.println("					Press 2 to search for contact");
		System.out.println("					Press 3 to operate on contact");
		System.out.println();
		System.out.println();
		int choice=scn.nextInt();


		switch (choice){
		case 1:
			break;
		case 2:
			System.out.println("							Press 1 to call");
			System.out.println("							Press 2 to message");
			System.out.println("							Press 3 to go to main menu");
			
			break;
		case 3:
			System.out.println("							Press 1 to add contact");
			System.out.println("							Press 2 to delete contact");
			System.out.println("							Press 3 to edit contact");
			
			break;
		default:
			System.out.println("please enter a valid choice");
		}	
		scn.close();

	}
}
