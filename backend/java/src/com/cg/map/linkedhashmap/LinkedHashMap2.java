package com.cg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap2 {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,Employee>l1=new LinkedHashMap<Integer, Employee>();
		l1.put(100, new Employee(20000, "ramesh"));
		l1.put(200, new Employee(20000, "suresh"));
		l1.put(300, new Employee(20000, "santhosh"));
		l1.put(400, new Employee(20000, "ramesh"));
		 System.out.println(l1.get(200));
		 
		 Set<Map.Entry<Integer,Employee>> s1=l1.entrySet();
		 
		 for (Map.Entry<Integer, Employee> entry : s1) {
			 System.out.println(entry.getKey());
			 System.out.println(entry.getValue());
			 System.out.println("---------------");
			 
			 }
		System.out.println(l1.containsKey(300));
	}

}
