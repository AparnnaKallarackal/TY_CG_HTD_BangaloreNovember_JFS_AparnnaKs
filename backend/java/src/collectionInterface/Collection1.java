package collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
	public static void main(String[] args) {
		
	
	Collection c1=new ArrayList();
	//insertimg
	c1.add(12);
	c1.add(50);
	c1.add(5);
	System.out.println(c1);
	//removing
	System.out.println(c1.remove(5));
	
	
	//finding size
	
	System.out.println(	c1.size());
	
	//checking empty or not
	System.out.println(c1.isEmpty());
	
	
	
	}

}
