package collectionInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection5 {
	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(10);
		
		System.out.println("************for loop************");
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		
		
		System.out.println("***********for each***********");
		for(Integer i1:a)
		{
			System.out.println(i1);
		}
		
		System.out.println("*********iterator***************");
		Iterator<Integer> itr=a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		System.out.println("************ list iterator*************");
		
	
	}

}
