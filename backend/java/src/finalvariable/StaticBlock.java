package finalvariable;

public class StaticBlock {
	final int MAX;static final int MIN;
	StaticBlock()
	{
		System.out.println("constructor executing");
	}
	StaticBlock(int a)
	{
		System.out.println("constructor overloaded");
	}
	{
		MAX=500;
		System.out.println("instance block executing");
	}
	static{
		MIN=200;
		System.out.println("static block executing");
	}

}
