package com.cg.thread.creatingthread;

public class User2 extends Thread{
	IRCTC i;

	public User2(IRCTC i) {
		this.i = i;
	}
	
public void run()
{
	i.confirmTicket();
}
}
