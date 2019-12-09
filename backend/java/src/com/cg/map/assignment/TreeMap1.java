package com.cg.map.assignment;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(new Student("deepu", 101));
		a1.add(new Student("appu", 102));
		
		ArrayList<Student> a2=new ArrayList<Student>();
		a2.add(new Student("dhiya", 201));
		a2.add(new Student("achu", 202));
		
		ArrayList<Student> a3=new ArrayList<Student>();
		a3.add(new Student("snehu", 301));
		a3.add(new Student("ani", 302));
		
		
		TreeMap<String,ArrayList<Student>>t1=new TreeMap<String, ArrayList<Student>>();
		t1.put("1 st", a1);
		t1.put("2 nd", a2);
		t1.put("3 rd", a3);
		
		Set<Map.Entry<String,ArrayList<Student>> >s1=t1.entrySet();
		
		for (Map.Entry<String,ArrayList<Student>>entry : s1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("************");
			
		
		}
	}
	}
