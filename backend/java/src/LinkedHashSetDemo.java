import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
public static void main(String[] args) {
	
	LinkedHashSet<Integer> l1=new LinkedHashSet<Integer>();
	l1.add(100);
	l1.add(200);
	l1.add(300);
	l1.add(100);
	l1.add(500);
	l1.add(null);
	
	for(Integer ob: l1)
		System.out.println(ob);
	
}
}
