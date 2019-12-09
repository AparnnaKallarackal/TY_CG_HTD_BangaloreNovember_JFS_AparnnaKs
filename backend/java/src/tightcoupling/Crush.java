package tightcoupling;

public class Crush {
	void receive(Phone p)
	{
		if(p instanceof Nokia)
			System.out.println("nokia");
		else if(p instanceof Oppo)
			System.out.println("oppo");
		else if(p instanceof OnePlus)
			System.out.println("one plus");
		else if(p instanceof Apple)
			System.out.println("apple");
		else
			System.out.println("!!!!!!");
	}

}
