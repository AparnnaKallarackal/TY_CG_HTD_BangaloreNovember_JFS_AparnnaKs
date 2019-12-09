import java.util.Vector;

public class Collection2 {
public static void main(String[] args) {
	
	Vector v1=new Vector();
	System.out.println("......add element.....");
	v1.addElement(100);
	v1.addElement(200);
	v1.addElement(500);
	v1.addElement(800);
	System.out.println(v1);
	
	System.out.println("....remove element....");
	v1.removeElement(200);
	v1.removeElement(800);
	System.out.println(v1);
	
	v1.add(700);
	v1.add(600);
	
	Object [] ob=new Object[v1.size()];
	v1.copyInto(ob);
	for(int i=0;i<ob.length;i++)
		System.out.println(ob[i]);
	
	
	System.out.println(v1);
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	//v1.trimToSize();
	//System.out.println(v1.size());
	//System.out.println(v1.capacity());
	
	//v1.ensureCapacity(8);
	//System.out.println(v1.size());
	//System.out.println(v1.capacity());
	v1.setSize(12);
	System.out.println(v1);
	System.out.println(v1.capacity());
	
}
}
