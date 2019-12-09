package atm;

public class TestBank {
	public static void main(String[] args)
	{
		Cards c=new Cards();
		Sbi s=new Sbi();
		Hdfc h=new Hdfc();
		Icici i=new Icici();
		Bank b=new Bank();
		
		b.input(c);
		b.input(s);
		b.input(h);
		b.input(i);
		
		
		
		
	}

}
