package com.tyss.typecasting.pack2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1=new Cat();
		a1.eat();
		System.out.println("************");
		
		Cat c=(Cat)a1;
		c.eat();
		c.walk();
		System.out.println("************");
		
		Animal a2=new Fish();
		a2.eat();
		System.out.println("*************");
		
		Fish f=(Fish)a2;
		f.eat();
		f.swim();
		
		

	}

}
