package com.cg.thread.creatingthread;

public class Test2 {
public static void main(String[] args) {
	
	Thread2 t2=new Thread2();
	
	System.out.println("main started..........");
	Thread t=new Thread(t2);
	t.start();
	System.out.println("main ended.............");
}

}
