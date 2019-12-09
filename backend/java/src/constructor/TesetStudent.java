package constructor;

public class TesetStudent {

	public static void main(String[] args) {
Student s=new Student();
System.out.println(s.sName);
System.out.println(s.sAge);

Student s1=new Student("prrr",5);
System.out.println(s1.sName);
System.out.println(s1.sAge);


	}

}
