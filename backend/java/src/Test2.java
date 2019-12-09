
public class Test2 {
	public static void main(String[] args) {
		System.out.println("main started");
		int a[]=new int[2];
		a[0]=10;
		a[1]=20;
		try
		{
			a[3]=30;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("idiot   give   values within limit");
		}
		System.out.println("main ended");
	}

}
