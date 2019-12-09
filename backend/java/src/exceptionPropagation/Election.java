package exceptionPropagation;

public class Election {
void vote (int age)throws AgeLimitExceptions{
	if(age<18)
		throw new AgeLimitExceptions();
	else
		System.out.println("allowed for voting");
}
}
