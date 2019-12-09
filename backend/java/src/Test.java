
public class Test {
	public static void main(String[] args) {
		
		int i1=5;
		//boxing
		Integer i2=new Integer(i1);
		//unboxing
		int i3=i2.intValue();
		System.out.println(i1+" "+i2+" "+i3);
		
		
	}

}
