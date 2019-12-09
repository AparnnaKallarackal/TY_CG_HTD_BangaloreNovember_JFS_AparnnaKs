package com.tyss.queue.arraydeque1;

import java.util.ArrayDeque;

public class ArrayDeque1 {
	public static void main(String[] args) {
		ArrayDeque<String> a1=new ArrayDeque<String>();
		a1.add("appu");
		a1.add("dhiya");
		System.out.println(a1);
		a1.addFirst("deepu");
		a1.addLast("achu");
		System.out.println(a1);
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		a1.remove();
		System.out.println(a1);
		System.out.println(a1.removeFirst());
		System.out.println(a1.removeLast());
		
	
	
	
	
	}

}
