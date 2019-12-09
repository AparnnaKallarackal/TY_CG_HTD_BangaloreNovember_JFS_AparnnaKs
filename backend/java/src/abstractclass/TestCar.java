package abstractclass;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass a=new Car();
		a.start();
		a.stop();
		System.out.println("////////////");
		Car c=new Car();
		c.start();
		c.stop();

	}

}
