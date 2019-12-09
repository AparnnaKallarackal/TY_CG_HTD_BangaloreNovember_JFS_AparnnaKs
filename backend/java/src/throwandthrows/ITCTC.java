package throwandthrows;

public class ITCTC {
void confirmTicket()throws ClassNotFoundException{
	try {
		Class.forName("throwthrows.Paytm");
		System.out.println("ticket is confirmed");
		
	}
	catch(ClassNotFoundException e) {
		System.out.println("ticket confirmed");
		throw e;
	}
	
	
}

}
