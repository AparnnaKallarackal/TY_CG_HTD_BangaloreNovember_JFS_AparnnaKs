package com.tyss.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
public static void main(String[] args) {
	
	Queue q1=new PriorityQueue();
	q1.offer(76);
	q1.offer(89);
	q1.offer(26);
	System.out.println(q1);
	q1.offer(22);
	q1.offer(8);
	q1.offer(96);
	System.out.println(q1);
	q1.poll();
	System.out.println(q1);
	q1.poll();
	System.out.println(q1);
	
	Queue q2=new PriorityQueue();
	q2.offer(10);
	q2.offer(30);
	q2.offer(100);
	System.out.println(q2);
	q2.poll();
	System.out.println(q2);
	
	Queue q3=new PriorityQueue();
	q3.offer(200);
	q3.offer(300);
	q3.offer(400);
	q3.offer(500);
	q3.remove();
	System.out.println(q3); 
	
	
	
}
}
