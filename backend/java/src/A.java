
public class A {
	static void f()
	{
		try
		
		{
			B.e();
		}
		catch (ArithmeticException e)
		{
			System.out.println("a class "+e.getMessage());
		}
	}

}
