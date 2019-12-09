package collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
	public static void main(String[] args) {
		
	
	Collection c1=new ArrayList();
	c1.add(12);
	c1.add(50);
	c1.add(5);
	c1.add(12);
	
	Collection c2=new ArrayList();
	c2.add(12);
	c2.add(50);
	c2.add(55);
	
	
	
	//add all
	c1.addAll(c2);
	System.out.println(c1);
	
	//remove all
	c1.removeAll(c2);
	System.out.println(c1);
	
	//contains all
		System.out.println(c1.containsAll(c2));
	
	
	//add all
	c1.addAll(c2);
	System.out.println(c1);
	
	//contains all
	System.out.println(c1.containsAll(c2));
	
	//retain all
	c1.retainAll(c2);
	System.out.println(c1);
	
	//clear all
	c1.clear();
	System.out.println(c1);
	
	//to array
	Collection c3=new ArrayList();
	c3.add(22);
	c3.add(25);
	c3.add(55);
	
	Object [] a=c3.toArray();
	
	for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	
	}
}
