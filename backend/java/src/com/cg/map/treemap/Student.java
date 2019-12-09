package com.cg.map.treemap;

public class Student //implements Comparable<Student> 
{
int age;
String name;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}


@Override
public String toString() {
	return "Student [age=" + age + ", name=" + name + "]";
}

public Student(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}





//public int compareTo(Student o) {
	//if(this.age>o.age)
		//return 1;
	//else if(this.age<o.age)
		//return -1;
	//else return 0;
}


