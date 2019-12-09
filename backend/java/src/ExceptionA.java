
public class ExceptionA {
	void exception(int a,String s)
	{
		try
		{
			System.out.println(500/a);
			System.out.println(s.length());
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("dont deal with zero");
		}
		catch(NullPointerException f)
		{
			System.out.println("dont deal with null");
		}
	}

}
