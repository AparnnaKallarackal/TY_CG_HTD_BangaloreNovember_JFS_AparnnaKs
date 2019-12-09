import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		EmpAge e=new EmpAge();
		TreeSet<Employee>ts=new TreeSet<Employee>();
		ts.add(new Employee(22, "akash", 50000));
		ts.add(new Employee(10, "praghithi", 25000));
		ts.add(new Employee(28, "abin", 45000));
		ts.add(new Employee(22, "akash", 50000));
		
		for(Employee o:ts)
			System.out.println(o);
	}

}
