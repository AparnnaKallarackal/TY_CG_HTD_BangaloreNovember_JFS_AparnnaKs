
public class DayLimitException extends RuntimeException{
String msg;
DayLimitException()
{
	
}
public DayLimitException(String msg) {
	super();
	this.msg = msg;
}

}
