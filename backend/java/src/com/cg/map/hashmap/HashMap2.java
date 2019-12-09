package com.cg.map.hashmap;

import java.util.Collection;
import java.util.HashMap;

public class HashMap2 {
public static void main(String[] args) {
	
	HashMap<Integer,Student> h1=new HashMap<Integer, Student>();
	
	h1.put(34, new Student(31, "divya"));
	h1.put(45, new Student(52, "ramesh"));
	h1.put(null, null);
	System.out.println(h1.size());
	
	Collection<Student>c1=h1.values();
	
	for (Student s1 : c1) {
		System.out.println(s1);
	}
	System.out.println(h1.containsKey(34));
	System.out.println(h1.containsValue(new Student(31, "divya")));
	h1.keySet();
}

}
