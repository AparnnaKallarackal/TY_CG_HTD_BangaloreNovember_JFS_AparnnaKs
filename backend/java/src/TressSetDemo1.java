import java.util.TreeSet;

public class TressSetDemo1 {
	public static void main(String[] args) {
		
		TreeSet<Studennt>ts=new TreeSet<Studennt>();
		ts.add(new Studennt(10, "shambu"));
		ts.add(new Studennt(15," thanku"));
		ts.add(new Studennt(15," thanku"));
		
		for(Studennt ob:ts)
	System.out.println(ob);
		
	}

}
