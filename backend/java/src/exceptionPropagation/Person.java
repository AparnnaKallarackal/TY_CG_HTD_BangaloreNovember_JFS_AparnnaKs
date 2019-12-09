package exceptionPropagation;

public class Person {
public static void main(String[] args) {
	
	Election e=new Election();
	try {
		e.vote(19);
		
	}
	catch(AgeLimitExceptions a)
	{System.out.println(a.getMessage());
	}
	}
}
