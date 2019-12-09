
public class Ola {
GoogleMap g;

public Ola(GoogleMap g) {
	super();
	this.g = g;
}
void find (String a)
{
	try {
		g.findLocation(a);
		
	}
	catch (NullPointerException e)
	{
		System.out.println("ola user fill details");
		
	}
	
}
}
