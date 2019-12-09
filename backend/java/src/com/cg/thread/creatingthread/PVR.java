package com.cg.thread.creatingthread;

public class PVR {
synchronized void confirmTicket() {
	for(int i=0;i<5;i++)
	{
		System.out.println(i);
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
		
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//
//			e.printStackTrace();
//		}
	}
	
		
	}
	synchronized void leaveMe() {
		System.out.println("notify called.......");
		notify();
		
}
}
