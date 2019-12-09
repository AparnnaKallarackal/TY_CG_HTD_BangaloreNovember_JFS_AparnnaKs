package interfaceexample;

public interface Bottle {
	void open();
	void drink();
	default void juice() {
		System.out.println("dafault method juice");
	}
	static void close()
	{
		System.out.println("static method close");
	}

}
