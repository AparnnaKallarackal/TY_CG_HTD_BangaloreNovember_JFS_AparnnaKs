package localvariable;

public class Car extends Vehicle {
	int cost=10000;
	void carDetails()
	{
		int cost=20000;
		System.out.println("local var "+cost);
		System.out.println("global var "+this.cost);
		System.out.println("parent class var "+super.cost);
	}

}
