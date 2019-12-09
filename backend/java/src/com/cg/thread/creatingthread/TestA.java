package com.cg.thread.creatingthread;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started........");
		
		IRCTC i=new IRCTC();
		
		User2 u1=new User2(i);
		u1.start();
		
		User2 u2=new User2(i);
		u2.start();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		i.leaveMe();
		System.out.println("main ended..........");
	}

}
