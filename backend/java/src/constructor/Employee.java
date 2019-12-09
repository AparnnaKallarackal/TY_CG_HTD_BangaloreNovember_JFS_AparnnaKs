package constructor;

public class Employee {
	String empname;int empage;double sal;
	Employee(String name,int age,double s)
	{
		empname=name;empage=age;sal=s;
	}
void empDetails()
{
	System.out.println("empname:"+empname+" emp age:"+empage+" salary:"+sal);
}
}
