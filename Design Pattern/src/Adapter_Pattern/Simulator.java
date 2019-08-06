package Adapter_Pattern;

public class Simulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new MallardDuck();
		test(duck);
		Drone dr = new SuperDrone();
		Adapter ad = new Adapter(dr);
		test(ad);
	}

	
	
	private static void test(Duck duck1) {
		// TODO Auto-generated method stub
		duck1.fly();
		duck1.quack();
	}
}
