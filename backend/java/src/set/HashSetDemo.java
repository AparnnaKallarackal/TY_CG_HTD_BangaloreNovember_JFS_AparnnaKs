package set;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	
	HashSet hs=new HashSet();
	hs.add(100);
	hs.add(200);
	hs.add(300);
	hs.add(400);
	hs.add(500);
	hs.add(null);
	
	for(Object obj:hs)
	{	//System.out.println(obj.hashCode());
		System.out.println(obj);
	}
	
	
	//STRING
	HashSet<String> hs1=new HashSet<String>();
	hs1.add(null);
	hs1.add("ammu");
	
}
}
