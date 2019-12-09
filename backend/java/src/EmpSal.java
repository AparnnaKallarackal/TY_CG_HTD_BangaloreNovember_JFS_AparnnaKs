import java.util.Comparator;

public class EmpSal implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.empSal>o2.empSal)
			return 1;
		else if(o1.empSal<o2.empSal)
			return -1;
		else return 0;
	}

}
