
public class GoogleMap {
	void findLocation(String loc)
	{
		try
		{
			System.out.println(loc.length());
			
		}
		catch (NullPointerException n )
		{
			System.out.println("PLZ FILL LLOCATION NAME");
			throw n;
			
		}
	}

}
