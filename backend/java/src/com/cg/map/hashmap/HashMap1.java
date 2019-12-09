package com.cg.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class HashMap1 {
	public static void main(String[] args) {
	HashMap <Integer,String> h1=new HashMap<Integer, String>();
	
	h1.put(2, "deepu");
	h1.put(8, "dhiya");
	h1.put(4, "achu");
	h1.put(6,"appu");
	
	Set<Map.Entry<Integer,String>> s1=h1.entrySet();
	
	for (Map.Entry<Integer, String> entry : s1) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		System.out.println("************");
		
	}
	
}

}
