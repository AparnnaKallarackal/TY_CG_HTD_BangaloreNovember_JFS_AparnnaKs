import java.util.Iterator;
import java.util.LinkedHashSet;

public class LHSDemo1 {
public static void main(String[] args) {
	
	LinkedHashSet<Employee>l1=new LinkedHashSet<Employee>();
	l1.add(new Employee(100, "shuppandi"));
	l1.add(new Employee(200, "pappu"));
	l1.add(new Employee(100, "shuppandi"));
	
	Iterator<Employee>itr=l1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		
	}
	
}
}
