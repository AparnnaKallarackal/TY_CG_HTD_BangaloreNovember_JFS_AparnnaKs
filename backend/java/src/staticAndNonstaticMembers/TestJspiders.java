package staticAndNonstaticMembers;

public class TestJspiders {

	public static void main(String[] args) {
		Jspiders OAR=new Jspiders();
		OAR.swipe();
		OAR.swipe();
		
		Jspiders BTR=new Jspiders();
		BTR.swipe();
		BTR.swipe();
		
		System.out.println("count in OAR "+OAR.branchStuCount);
		System.out.println("count in BTR "+BTR.branchStuCount);
		System.out.println("Total count "+OAR.totalStuCount);

	}

}
