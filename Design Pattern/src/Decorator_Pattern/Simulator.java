package Decorator_Pattern;

public class Simulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage bb = new HouseBlend();
		bb = new Milk(bb);
		bb = new Milk(bb);
		bb = new Milk(bb);

		System.out.println(bb.getdesc() +" -- " + bb.cost());
	}

}
