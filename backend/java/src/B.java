
public class B {
static void e()
{
	try {
		C.d();	
	}
	catch (ArithmeticException e)
	{
		System.out.println("b class "+e.getMessage());
		throw e;
	}
}
}
