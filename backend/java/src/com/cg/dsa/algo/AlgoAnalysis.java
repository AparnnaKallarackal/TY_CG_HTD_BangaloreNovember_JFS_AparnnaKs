package com.cg.dsa.algo;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {
	public static void main(String[] args) {
//		long number=9999999L;
//		System.out.println(addUpto(number));
//		System.out.println(addUptoQuick(number));
		countingDuration1();
		countingDuration2();
	}
	public static long addUpto(Long number) {
		long total=0L;
		for(long i=0;i<=number;i++) {
			total = total+i;
		}
		return total;
	}
	public static long addUptoQuick(Long number) {
		return number*(number+1)/2;
	}
	public static void countingDuration1() {
		long number=999999999L;
		Instant start=Instant.now();
		System.out.println("addUpto:"+ addUpto(number));
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds=duration/1000;
		System.out.println("addupto : "+seconds+"seconds");
	}
	public static void countingDuration2() {
		long number=999999999L;
		Instant start=Instant.now();
		System.out.println("addUptoQuick :"+ addUptoQuick(number));
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double seconds=duration/1000;
		System.out.println("adduptoQuick time : "+seconds+"seconds");
	}
}
