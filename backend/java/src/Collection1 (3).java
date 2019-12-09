import java.util.Vector;

public class Collection1 {
public static void main(String[] args) {
	
	//Vector v1=new Vector();
	//v1.add(40);
	//v1.add(50);
	//v1.add(73);
	//System.out.println(v1);
	
	//System.out.println("......remove......");
	//v1.remove(new Integer(50));
	//System.out.println(v1);
	
	Vector v2=new Vector();
	System.out.println(".......size ....capacity......");
	v2.add(100);
	v2.add(200);
	v2.add(300);
	v2.add(400);
	v2.add(500);
	System.out.println(v2.size());
	System.out.println(v2.capacity());
	v2.add(600);
	v2.trimToSize();
	
	System.out.println(v2.capacity());
	v2.add(700);
	System.out.println(v2.size());
	System.out.println(v2.capacity());
	
	
}
}
