package com.cg.thread.creatingthread;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("main started............");
		Thread1 t1=new Thread1();
		t1.start();
		System.out.println("main ended.............");
	}

}
