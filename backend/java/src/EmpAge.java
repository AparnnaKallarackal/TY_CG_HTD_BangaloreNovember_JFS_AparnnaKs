import java.util.Comparator;

public class EmpAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
if(o1.empAge>o2.empAge)
	return 1;
else if(o1.empAge<o2.empAge)
	return -1;
else return 0;
	}

}
