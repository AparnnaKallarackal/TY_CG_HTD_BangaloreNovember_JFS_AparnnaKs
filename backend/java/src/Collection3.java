import java.util.LinkedList;

public class Collection3 {
public static void main(String[] args) {
	
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add(100);
	l1.add(102);
	l1.add(106);
	l1.add(109);
	
	System.out.println("...........push.....");
	l1.push(100);
	System.out.println(l1);
	l1.pop();
	System.out.println(l1);
	l1.element();
	System.out.println(l1);
}
}
