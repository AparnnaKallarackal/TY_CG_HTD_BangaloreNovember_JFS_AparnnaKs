import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predicate1 {
	public static void main(String[] args) {
		
		System.out.println(".....predicate............");
		Predicate<Integer>p=i->i%2==0;
		
		boolean b=p.test(50);
		System.out.println(b);
		System.out.println(p.test(45));
		
		System.out.println("..........function..........");
		Function<Integer,Integer>f=i->i*100;
		int a=f.apply(50);
		System.out.println(a);
		
		System.out.println(".............supplier............");
		Supplier<Person>s=()->new Person(10,"mottu");
		
		System.out.println(s.get().getAge());
		System.out.println(s.get().getName());
		
		System.out.println("........consumer........");
		Consumer<Person>c=j->{
			System.out.println(j.getAge());
			System.out.println(j.getName());
			
			
		};
		Person p1=new Person(24,"appu");
		c.accept(p1);
		
		
		
		
	}

}
