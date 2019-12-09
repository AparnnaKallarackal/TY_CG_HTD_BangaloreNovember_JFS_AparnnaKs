package multipleinheritance;

public class Son implements Father,Father2{

	@Override
	public void home() {
		// TODO Auto-generated method stub
		Father2.super.home();
	}
	

}
