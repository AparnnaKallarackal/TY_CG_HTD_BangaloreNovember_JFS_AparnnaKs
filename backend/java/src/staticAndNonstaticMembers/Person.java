package staticAndNonstaticMembers;

public class Person {
	static int age;
	String name;
	void personDetails()
	
	{
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		personDetailsStatic();
		
	}
	static void personDetailsStatic()
	{
		System.out.println(age);
	}
}
