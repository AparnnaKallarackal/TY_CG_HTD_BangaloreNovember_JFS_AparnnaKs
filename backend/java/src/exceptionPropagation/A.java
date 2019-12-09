package exceptionPropagation;

public class A {

	public static void main(String[] args) {
		System.out.println("main started");
		try {
			B.m();
		}
		catch (ClassNotFoundException e) {
			System.out.println("exception handled");
			// TODO: handle exception
		}
		System.out.println("main ended");
	}
}
