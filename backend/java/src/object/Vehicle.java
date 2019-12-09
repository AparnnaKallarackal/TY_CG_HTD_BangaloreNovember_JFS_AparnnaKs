package object;

public class Vehicle implements Cloneable {
	String vehiclename;

	public Vehicle(String vehiclename) {
		super();
		this.vehiclename = vehiclename;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
