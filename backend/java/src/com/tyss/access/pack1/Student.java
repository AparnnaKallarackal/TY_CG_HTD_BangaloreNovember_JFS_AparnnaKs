package com.tyss.access.pack1;
public class Student {
	protected String name;
	protected Student(String n)
	{
		name=n;
	}
	protected void details()
	{
		System.out.println("name is "+name);
	}
}
