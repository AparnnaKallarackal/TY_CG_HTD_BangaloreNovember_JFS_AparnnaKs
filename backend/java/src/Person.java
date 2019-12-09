
public class Person {
String name;

public Person(String name) {
	super();
	this.name = name;
}

@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
	System.out.println("******finalize method********");
}

}
