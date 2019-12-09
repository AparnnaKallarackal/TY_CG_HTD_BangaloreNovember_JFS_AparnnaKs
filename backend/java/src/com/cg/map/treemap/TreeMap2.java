package com.cg.map.treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
public static void main(String[] args) {
	SortingAge s=new SortingAge();
	SortingName n=new SortingName();
	
	TreeMap<Student,String>t1=new TreeMap<Student, String>(n);
	
	t1.put(new Student(12, "aparna"), "1st");
	t1.put(new Student(20, "ajay"), "2nd");
	t1.put(new Student(5, "zeepu"), "7th");
	t1.put(new Student(18, "vijay"), "5th");
	
	Set<Map.Entry<Student,String>>s1=t1.entrySet();
	
	for (Map.Entry<Student, String> entry : s1) {
		
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		System.out.println("-----------");
		
		
	}
}
}
