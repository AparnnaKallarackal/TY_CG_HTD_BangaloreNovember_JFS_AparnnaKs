package interfaceexample;

public class Frooti implements Bottle {
	public void open()
	{
		System.out.println("opened frooti");
	}
public void drink()
{
	System.out.println("drinking frooti");
}
public void juice()
{
	System.out.println("overridden juice");
}

}
