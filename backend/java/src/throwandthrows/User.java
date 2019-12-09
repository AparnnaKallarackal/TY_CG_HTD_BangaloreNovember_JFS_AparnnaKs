package throwandthrows;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stubsyso
		System.out.println("main started");
		ITCTC i=new ITCTC();
		Paytm p=new Paytm(i);
		p.bookTicket();
		System.out.println("main ended");

	}

}
