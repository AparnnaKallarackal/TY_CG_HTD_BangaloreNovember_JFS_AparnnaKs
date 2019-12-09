
package com.tyss.access.pack2;
import com.tyss.access.pack1.*;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//DefaultEmp dem=new DefaultEmp("appu");
		//cannot make object of default constructor in diff package
		DefaultEmp dem=new DefaultEmp("appu");
		dem.m1();
		
		

	}

}
