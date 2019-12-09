package com.cg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {
public static void main(String[] args) {
	
	LinkedHashMap<String,Integer>l1=new LinkedHashMap<String, Integer>();
	l1.put("OAR", 1000);
	l1.put("BTR", 2000);
	l1.put("BTM", 4000);
	l1.put("RAJAJI", 5000);
	l1.put(null, null);
	l1.put(null, 7000);
	l1.put("OAR", 1000);
	
	
	Set<Map.Entry<String,Integer>> s1=l1.entrySet();
	
	for (Map.Entry<String, Integer> entry : s1) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		System.out.println("---------------");
		
	}
}
}
