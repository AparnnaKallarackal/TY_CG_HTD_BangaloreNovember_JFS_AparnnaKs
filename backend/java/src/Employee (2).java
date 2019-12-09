
public class Employee implements Comparable<Employee> {
	
	int empAge;
	String empName;
	double empSal;
	
	
	public Employee(int empAge, String empName, double empSal) {
		super();
		this.empAge = empAge;
		this.empName = empName;
		this.empSal = empSal;
	}


	@Override
	public int compareTo(Employee o) {
		if(this.empSal>o.empSal)
			return 5;
		else if(this.empSal<o.empSal)
			return-5;
		else return 0;
	}


	@Override
	public String toString() {
		return "Employee [empAge=" + empAge + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
	

}
