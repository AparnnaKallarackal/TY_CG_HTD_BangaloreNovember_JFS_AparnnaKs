package collectionInterface;

import java.util.ArrayList;
import java.util.List;

public class Collection4 {
	public static void main(String[] args) {
		
		List l1=new ArrayList();
		//add in index
		l1.add(0,1);
		l1.add(1,2);
		l1.add(2,3);
		l1.add(3,4);
		l1.add(4,4);
		l1.add(5,4);
		
		System.out.println(l1);
		
		//remove index
		l1.remove(1);
		System.out.println(l1);
		
		//index of
		System.out.println(l1.indexOf(4));
		
		
		//last index of
		System.out.println(l1.lastIndexOf(4));
		
		//get
		System.out.println(l1.get(0));
		
		//add all
		List l2=new ArrayList();
		
		l2.add(0,5);
		l2.add(1,6);
		l2.add(2,7);
		l2.add(3,8);
		l2.add(4,9);
		l2.add(5,4);
		
		l1.addAll(1, l2);
		System.out.println(l1);
		
		//set
		
		l2.set(0, 10);
		System.out.println(l2);
		
		//sublist
		System.out.println(l2.subList(0,3));
		
		
		
		
		
		
	}

}
