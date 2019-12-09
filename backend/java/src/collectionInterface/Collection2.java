package collectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
public static void main(String[] args) {
	
	Collection c1=new ArrayList();
	//insertimg
		c1.add("aparnna");
		c1.add("praveena");
		c1.add("mamatha");
		System.out.println(c1);
		//removing
		System.out.println(c1.remove("aparnna"));
		
		
		//finding size
		
		System.out.println(	c1.size());
		
		//checking empty or not
		System.out.println(c1.isEmpty());
		
		
		
}
}
