package overloading;

public class Calculator {
  int add(int a)
  { return a+a;
  }
  int add(int a,int b)
  { return a+b;
  }
  double add(double a)
  {return a+a;
  }
  static void mul(int a)
  {System.out.println(a*a);
  }
  static void mul(int a,int b)
  { System.out.println(a*b);
	  
  }
}
  