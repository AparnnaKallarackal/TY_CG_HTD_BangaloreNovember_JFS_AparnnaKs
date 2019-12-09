package com.tyss.access.pack2;
import static com.tyss.access.pack1.Person.*;

import com.tyss.access.pack1.Person;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("kunju",3);
		System.out.println(p.age);
		p.details();
		System.out.println(Person.a);

	}

}
