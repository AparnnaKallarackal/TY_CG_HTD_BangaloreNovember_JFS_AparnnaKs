package object;

public class TestVehcle {
public static void main(String[] args) throws CloneNotSupportedException {
	Vehicle v1=new Vehicle("benz");
	Object o=v1.clone();
	Vehicle v2=(Vehicle)o;
	System.out.println(v2.vehiclename);
	
	
}
}
