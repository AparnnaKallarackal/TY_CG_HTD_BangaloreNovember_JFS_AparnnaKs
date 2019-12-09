package object;

public class TestGetClass {
	public static void main(String[] args)throws  IllegalAccessException,InstantiationException, ClassNotFoundException {
		GetClass c1=new GetClass("pinky");
		Class c2=c1.getClass();
		System.out.println(c2);
		//@SuppressWarnings("deprecation")
		//GetClass c3=(GetClass)c2.newInstance();
		//System.out.println(c3);
		//System.out.println(c3.name);
		Class c4=Class.forName("GetClass");
		System.out.println(c4);
		
		
		
	}

}
