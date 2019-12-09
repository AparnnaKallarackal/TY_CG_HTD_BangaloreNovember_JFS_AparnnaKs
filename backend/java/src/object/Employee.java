package object;

public class Employee {
	int EmpId;String EmpName;


	public Employee(int empId, String empName) {
		super();
		EmpId = empId;
		EmpName = empName;
	}


	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + "]";
	}
	

}
