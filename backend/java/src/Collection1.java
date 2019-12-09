import java.util.LinkedList;
import java.util.ListIterator;

public class Collection1 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(1);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(null);
		ListIterator itr=l1.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			l1.add(6);
			l1.remove(new Integer(3));
		System.out.println("***************for   loop******************");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println("*************for ecach**************");
		for(Object i1: l1)
		{
			System.out.println(i1);
		}
	}

}
