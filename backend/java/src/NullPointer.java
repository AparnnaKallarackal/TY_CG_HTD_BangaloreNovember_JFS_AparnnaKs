
public class NullPointer {
void write()
{
	String s1=null;
	try
	{
		System.out.println("length of string"+s1.length());
	}
	catch(NullPointerException e)
	{
		System.out.println("don't tryy to messs with null");
	}
}
public static void main(String[] args) {
	
	NullPointer n = new NullPointer();
	System.out.println("main started");
	n.write();
	System.out.println("main ended"
			+ "");
}
}
