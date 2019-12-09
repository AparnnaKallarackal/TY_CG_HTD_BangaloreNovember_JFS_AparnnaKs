package overloading;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		int res1=cal.add(5);
		int res2=cal.add(5,8);
		double res3=cal.add(2.0);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		Calculator.mul(5);
		Calculator.mul(5, 5);
		
		

		
	}

}
