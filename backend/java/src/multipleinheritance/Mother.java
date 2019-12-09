package multipleinheritance;

public interface Mother {
	default void home()
	{
		System.out.println("interface method");
	}

}
