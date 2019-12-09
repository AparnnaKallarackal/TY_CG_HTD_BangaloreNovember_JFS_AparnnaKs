package throwandthrows;

public class Paytm {
	ITCTC i;

	public Paytm(ITCTC i) {
		super();
		this.i = i;
	}
	void bookTicket() {
		try
		{i.confirmTicket();
		System.out.println("ticket confirmed");
		}
		catch(ClassNotFoundException e){
			System.out.println("ticket not found");
		}
	}
	

}
