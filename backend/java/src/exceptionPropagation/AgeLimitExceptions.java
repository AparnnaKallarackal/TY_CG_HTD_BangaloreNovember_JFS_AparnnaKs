package exceptionPropagation;

public class AgeLimitExceptions extends Exception
{
String msg="age should be more than 18 ";
AgeLimitExceptions()
{
}


public AgeLimitExceptions(String msg) {
	super();
	this.msg = msg;
}


public String getMsg() {
	return msg;
}




}
