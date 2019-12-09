package com.cg.arraysortingdatastructureclass.arraysorting;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	
	
	int [] array=new int[5];
	
	for(int i=0;i<array.length;i++)
	{
		System.out.println("enter element  :");
		array[i]=scn.nextInt();
	}
	
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+"  ");
		
	}
	System.out.println();
	int choice;
	System.out.println(" 1 for sorting using bubble algorithm");
	System.out.println(" 2 for sorting using merge algorithm");
	System.out.println(" 3 for sorting using quick algorithm");
	choice=scn.nextInt();
	
	switch (choice)
	{
		case 1:
			BubbleSorting.main(args);
			break;
		case 2:
			MergeSorting.main(args);
			break;
		case 3:
			QuickSorting.main(args);
			break;
			
	}
	scn.close();
	
}
}
