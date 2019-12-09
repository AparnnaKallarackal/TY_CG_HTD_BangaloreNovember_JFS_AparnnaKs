package overriding;

public class TestAnimal {
	public static void main(String[] args)
	{
		Animal a=new Cat();
		a.eat();
		Animal B=new Lion();
		B.eat();
		Animal C=new Cat();
		C.eat();
	}

}
