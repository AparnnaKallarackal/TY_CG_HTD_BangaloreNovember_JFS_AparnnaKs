package com.cg.dsa.algo;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class SearchComparison {
	public static void main(String[] args) {
		
		countingDuration1();
		countingDuration2();

	}
	public static void binarySearch() {
		int counter, num, item, array[], first, last, middle;
		//To capture user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		num = input.nextInt(); 

		//Creating array to store the all the numbers
		array = new int[num];

		System.out.println("Enter " + num + " integers");
		//Loop to store each numbers in array
		for (counter = 0; counter < num; counter++)
			array[counter] = input.nextInt();

		System.out.println("Enter the search value:");
		item = input.nextInt();
		first = 0;
		last = num - 1;
		middle = (first + last)/2;

		while( first <= last )
		{
			if ( array[middle] < item )
				first = middle + 1;
			else if ( array[middle] == item )
			{
				System.out.println(item + " found at location " + (middle + 1) + ".");
				break;
			}
			else
			{
				last = middle - 1;
			}
			middle = (first + last)/2;
		}
		if ( first > last )
			System.out.println(item + " is not found.\n");
	}
	public static void countingDuration1() {

		Instant start=Instant.now();
		System.out.println("binarySearch  :");
		binarySearch();
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds=duration/1000;
		System.out.println("binary search : "+seconds+"seconds");
	}
	public static void linearSearch() {
		{
			int counter, num, item, array[];
			//To capture user input
			Scanner input = new Scanner(System.in);
			System.out.println("Enter number of elements:");
			num = input.nextInt(); 
			//Creating array to store the all the numbers
			array = new int[num]; 
			System.out.println("Enter " + num + " integers");
			//Loop to store each numbers in array
			for (counter = 0; counter < num; counter++)
				array[counter] = input.nextInt();

			System.out.println("Enter the search value:");
			item = input.nextInt();

			for (counter = 0; counter < num; counter++)
			{
				if (array[counter] == item) 
				{
					System.out.println(item+" is present at location "+(counter+1));
					/*Item is found so to stop the search and to come out of the 
					 * loop use break statement.*/
					break;
				}
			}
			if (counter == num)
				System.out.println(item + " doesn't exist in array.");
		}
	}
	public static void countingDuration2() {

		Instant start=Instant.now();
		System.out.println("linear search  :");
		linearSearch();
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds=duration/1000;
		System.out.println("linear search : "+seconds+"seconds");
	}
}
