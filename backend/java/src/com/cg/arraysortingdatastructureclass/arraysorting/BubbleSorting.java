package com.cg.arraysortingdatastructureclass.arraysorting;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class BubbleSorting {
	public static void main(String []args) {
	
		
		countingDuration1();
		
		
		
	}
	
	public static void bubbleSorting() {
	    int num, i, j, temp;
	    Scanner input = new Scanner(System.in);
	 
	    System.out.println("Enter the number of integers to sort:");
	    num = input.nextInt();
	 
	    int array[] = new int[num];
	 
	    System.out.println("Enter " + num + " integers: ");
	 
	    for (i = 0; i < num; i++) 
	      array[i] = input.nextInt();
	 
	    for (i = 0; i < ( num - 1 ); i++) {
	      for (j = 0; j < num - i - 1; j++) {
	        if (array[j] > array[j+1]) 
	        {
	           temp = array[j];
	           array[j] = array[j+1];
	           array[j+1] = temp;
	        }
	      }
	    }
	 
	    System.out.println("Sorted list of integers:");
	 
	    for (i = 0; i < num; i++) 
	      System.out.println(array[i]);
	  }
	
	public static void countingDuration1() {
		
		Instant start=Instant.now();
		System.out.println("bubble sorting  :");
		bubbleSorting();
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds=duration/1000;
		System.out.println("bubble Sorting time : "+seconds+"seconds");
	}
}
