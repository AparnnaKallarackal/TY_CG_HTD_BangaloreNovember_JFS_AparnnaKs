package finalvariable;

public class InstanceBlock {
	final int MAX;
	InstanceBlock()
	{
		System.out.println("constructor executing");
	}
	InstanceBlock(int a)
	{
		System.out.println("constructor overloaded");
	}
	{
		MAX=500;
		System.out.println("instance block executing");
	}
}
