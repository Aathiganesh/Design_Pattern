package Decorator_Pattern;

public class Milk extends Decorator{
	Beverage b1;
	
	Milk(Beverage bb) {
		b1 = bb;
	}

	@Override
	public String getdesc() {
		// TODO Auto-generated method stub
		return b1.getdesc() + ", Milk";
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return b1.cost() + 1;
	}
}
