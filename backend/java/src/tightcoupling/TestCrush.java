package tightcoupling;

public class TestCrush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Phone p=new Phone();
Nokia n=new Nokia();
Oppo o=new Oppo();
OnePlus op=new OnePlus();
Apple a=new Apple();
Crush c=new Crush();
c.receive(op);
c.receive(o);
c.receive(p);
c.receive(n);
c.receive(a);
c.receive(null);


	}

}
