import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestFilter {
public static void main(String[] args) {
	
	ArrayList<Integer>a1=new ArrayList();
	a1.add(10);
	a1.add(15);
	a1.add(20);
	a1.add(25);
	
	
	List <Integer>l1=a1.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(l1);
	
	List l2=a1.stream().filter(i->i%2!=0).collect(Collectors.toList());
	System.out.println(l2);
	
	List <Integer>l3=a1.stream().map(i->i*50).collect(Collectors.toList());
	System.out.println(l3);
	
	Optional<Integer>a=a1.stream().max((i,j)->i.compareTo(j));
	System.out.println(a);
	
	System.out.println(a1.stream().count());
	
	
	
}
}
