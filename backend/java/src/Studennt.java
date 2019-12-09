
public class Studennt implements Comparable<Studennt>{
int age;
String name;

public Studennt(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}

public int compareTo(Studennt o)
{
if(this.age>o.age)
	return 1;
else if(this.age<o.age)
	return-1;
else return 0;
}

@Override
public String toString() {
	return "Studennt [age=" + age + ", name=" + name + "]";
}

}
