package Strategy_Pattern;

public class MallardDuck extends Duck {

	MallardDuck () {
		qb = new RegularQuack();
		fb = new NoFly();
	}
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Original Mallard duck");
		
	}

}
