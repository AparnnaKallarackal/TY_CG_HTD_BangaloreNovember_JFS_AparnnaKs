package collectionInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionStrings {
	public static void main(String[] args) {
		
		ArrayList<String> s1=new ArrayList<String>();
		//add
		s1.add("appu");
		s1.add("ammu");
		s1.add("greeeshma");
		s1.add("keerthi");
		System.out.println(s1);
		
		System.out.println("******");
		
		//remove
		s1.remove("appu");
		System.out.println(s1);
		System.out.println("*******");
		
		//add
		s1.add("tinku");
		
		//remove index
		System.out.println(s1.remove(2));
		System.out.println(s1);
		System.out.println("**********");
		
		//size
		System.out.println(s1.size());
		System.out.println("***********");
		
		//isEmpty
		System.out.println(s1.isEmpty());
		
		//contains
		System.out.println(s1.contains("ammu"));
		System.out.println("**************");
		
		//for loop
		for(int i=0;i<s1.size();i++)
			System.out.println(s1.get(i));
		System.out.println("**************");
		
		//for each
		for(String s:s1)
			System.out.println(s);
		System.out.println("++++++++++++++++++");
		
		//iterator
		Iterator<String>itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("!!!!!!!!!!!!!!!!");
		
		// list iterator
		ListIterator<String> litr=s1.listIterator(s1.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		System.out.println("--------------------");
		//list iterator
		ListIterator<String> litr1=s1.listIterator(s1.size());
		while(itr.hasNext())
		{
			System.out.println(litr1.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
