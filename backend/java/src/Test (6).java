
public class Test {
public static void main(String[] args) {
	ExceptionA e=new ExceptionA();
	System.out.println("main stareted");
	e.exception(0, "appu");
	e.exception(5, null);
	e.exception(0, null);
	System.out.println("main ending");
}
}
