package exceptions;

public class TryCatch {
	void divide(int a,int b)
	{
		System.out.println("*********division started******");
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("don't divide by zero");
		}
				System.out.println("**********division ended");
	}

}
