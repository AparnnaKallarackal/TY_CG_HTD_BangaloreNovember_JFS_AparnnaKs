package exceptions;

public class Test {
	public static void main(String[] args) {
		TryCatch t=new TryCatch();
		System.out.println("*******main started*********");
		t.divide(10,0);
		System.out.println("**********main endded************");
	}

}
