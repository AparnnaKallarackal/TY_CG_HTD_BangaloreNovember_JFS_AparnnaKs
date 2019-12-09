package object;

public class Employee1 {
	int EmpId;String EmpName;


	public Employee1(int empId, String empName) {
		super();
		EmpId = empId;
		EmpName = empName;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + EmpId;
		result = prime * result + ((EmpName == null) ? 0 : EmpName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		if (EmpId != other.EmpId)
			return false;
		if (EmpName == null) {
			if (other.EmpName != null)
				return false;
		} else if (!EmpName.equals(other.EmpName))
			return false;
		return true;
	}


	


	

}
